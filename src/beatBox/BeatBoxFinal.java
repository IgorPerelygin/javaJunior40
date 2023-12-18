package beatBox;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.Track;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Vector;

public class BeatBoxFinal {
        JFrame theFrame;
        JPanel mainPanel;
        JList incomingList;
        JTextField userMessage;
        ArrayList<JCheckBox> checkboxList;
        int nextNum;
        Vector<String> listVector = new Vector<String>();
        String userName;
        ObjectOutputStream out;
        ObjectInputStream in;
        HashMap<String, Boolean[]> otherSeqsMap = new HashMap<String, Boolean>();

        Sequencer sequencer;
        Sequence sequence;
        Sequence mySequence = null;
        Track track;

        String[] instrumentNames = {"Bass Drum", "Closed Hi-Hat", "Open Hi-Hat", "Acoustic Share", "Crash Cymbal",
        "Hand Clap", "High Tom", "Hi Bongo", "Maracas", "Whistle", "Low Conga", "Cowbell", "Vibraslap",
        "Low-mid Tom", "High Agogo", "Open Hi Conga"};

        int[] instruments = {32, 42, 46, 49, 39, 50, 60, 70, 72, 64, 56, 58, 47, 67, 63};

    public static void main(String[] args) {
        new BeatBoxFinal().startUp (args[0]); // наш пользовательский индефикатор (отображаемое имя).
        // Используем аргеменит командной строкив качестве имени, которое будет выводиться на экране
    }

    public void startUp(String name){
        userName = name;
        // открываем соединение с сервером
        try {
            Socket sock = new Socket("127.0.0.1", 4242);  // настройка сети ввода-вывода
            out = new ObjectOutputStream(sock.getOutputStream());
            in = new ObjectInputStream(sock.getInputStream());
            Thread remote = new Thread(new RemoteReader());
            remote.start();

        } catch (Exception ex){
            System.out.println("couldn't connect - you'll have to play alone.");
        }
        setUpMidi();
        buildGui();
    }  // закрываем startUp

    public void buildGui(){

        theFrame = new JFrame("Cyber BeatBox");
        BorderLayout layout = new BorderLayout();
        JPanel background = new JPanel(layout);
        background.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10 ));

        checkboxList = new ArrayList<JCheckBox>();

        Box buttonBox = new Box(BoxLayout.Y_AXIS);
        JButton start = new JButton("Start");
        start.addActionListener(new MyStartListener());
        buttonBox.add(start);

        JButton stop = new JButton("Stop");
        stop.addActionListener(new MyStopListener());
        buttonBox.add(stop);

        JButton upTempo = new JButton("Tempo Up");
        upTempo.addActionListener(new MyUpTempoListener());
        buttonBox.add(upTempo);

        JButton downTempo = new JButton("Tempo Down");
        downTempo.addActionListener(new MyDownTempoListener());
        buttonBox.add(downTempo);

        JButton sendIt = new JButton("sendIt");
        sendIt.addActionListener(new MySendListener());
        buttonBox.add(sendIt);

        userMessage = new JTextField();
        buttonBox.add(userMessage);

        // JList - отображает входящие сообщения, которые можно выбрать из списка. Поэтоиу можно воспроизводить
        // прикреплённые файлы к сообщению
        incomingList = new JList<>();
        incomingList.addListSelectionListener(new MyListSelectionListener());
        incomingList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane theList = new JScrollPane(incomingList);
        buttonBox.add(theList);
        incomingList.setListData(listVector); // нет начальных данных

        Box nameBox = new Box(BoxLayout.Y_AXIS);
        for (int i = 0; i < 16; i++){
            nameBox.add(new Label(instrumentNames[i]));
        }

        background.add(BorderLayout.EAST, buttonBox);
        background.add(BorderLayout.WEST, nameBox);

        theFrame.getContentPane().add(background);
        GridLayout grid = new GridLayout(16, 16);
        grid.setVgap(1);
        grid.setHgap(2);
        mainPanel = new JPanel(grid);
        background.add(BorderLayout.CENTER, mainPanel);

        for (int i = 0; i < 256; i++){
            JCheckBox c = new JCheckBox();
            c.setSelected(false);
            checkboxList.add(c);
            mainPanel.add(c);
        }  // конец цикла

        theFrame.setBounds(50, 50, 300, 300);
        theFrame.pack();
        theFrame.setVisible(true);
    } // закрываем buildGui

    public void setUpMidi(){
        try {
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequence = new Sequence(Sequence.PPQ, 4); // получаем объект Sequence, создаём послед. и трек
            track = sequence.createTrack();
            sequencer.setTempoInBPM(120);
        }catch (Exception e) {e.printStackTrace();}
    } // закрываем setUpMidi

    public void buildTrackAndStart(){
        ArrayList<Integer> trackList = null; // здесь будут храниться инструменты для каждого трека
        sequence.deleteTrack(track);
        track = sequence.createTrack();

        for (int i = 0; i < 16; i++){
            trackList = new ArrayList<Integer>();
            for (int j = 0; j < 16; j++){
                JCheckBox jc = (JCheckBox) checkboxList.get(j + (16+i));
                if (jc.isSelected()){
                    int key = instruments[i];
                    trackList.add(new Integer(key));
                }else {
                    trackList.add(null); // этот слот в треке должен быть пустум
                }
            } // хакрываем вложенный цикл
            makeTracks(trackList);
        } // закрываемвнешний цикл

        track.add(makeEvent(192, 9,1,0,15)); // в результате всегда имееем 16 тактов
        try {
            sequencer.setSequence(sequence);
            sequencer.setLoopCount(sequencer.LOOP_CONTINUOUSLY);
            sequencer.start();
            sequencer.setTempoInBPM(120);
        }catch (Exception e) {e.printStackTrace();}
    } // Закрываем метод
    public class MyStartListener implements ActionListener{
        public void actionPerformed(ActionEvent a){
            buildTrackAndStart();
        } // закрываем ActionPerformed
    }
    public class MyStopListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            sequencer.stop();
        }
    }
    public class MyUpTempoListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            float tempoFactor = sequencer.getTempoFactor();
            sequencer.setTempoFactor((float) (tempoFactor * 1.03));
        }
    }

    public class MyDownTempoListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            float tempoFactor = sequencer.getTempoFactor();
            sequencer.setTempoFactor((float) (tempoFactor * .97));
        }
    }

    public class MySendListener implements ActionListener{
        public void actionPerformed(ActionEvent a) {
            //создаём массив в котором будет храниться состояние флажков
            boolean[] checkboxState = new boolean[256];
            for (int i = 0; i < 256; i++){
                JCheckBox check = (JCheckBox) checkboxList.get(i);
                if (check.isSelected()){
                    checkboxState[i] = true;
                }
            }
            String messageToSend = null;
            try {
                out.writeObject(userName + nextNum++ + ": " + userMessage.getText());
                out.writeObject(checkboxState);
            } catch (Exception ex) {
                System.out.println("Sorry dude. Could not send it to the server.");
            }
            userMessage.setText("");
        }
    }

    // срабатывает когда пользоватль выбирает сообщение из списка, загружается музыкальный шаблон, и проигрываем.
    public class MyListSelectionListener implements ListSelectionListener{
        public void valueChanged(ListSelectionEvent le){
            if (!le.getValueIsAdjusting()){
                String selected = (String) incomingList.getSelectedValue();
                if (selected != null){
                    // переходим к отображению и меняем последовательность
                    boolean[] selectedState = (boolean[]) otherSeqsMap.get(selected);
                    changeSequence(selectedState);
                    sequencer.stop();
                    buildTrackAndStart();
                }
            }
        }
    }

    public class RemoteReader implements Runnable{
        boolean[] checkboxState = null;
    }

}
