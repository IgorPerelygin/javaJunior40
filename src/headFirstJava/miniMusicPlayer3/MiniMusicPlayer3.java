package headFirstJava.miniMusicPlayer3;
import javax.sound.midi.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;

public class MiniMusicPlayer3 {
    static JFrame f = new JFrame("Мой первый музыкальный клип"); // создаём поле для рисования
    static MyDrawPanel ml;

    public static void main(String[] args) {
        MiniMusicPlayer3 mini = new MiniMusicPlayer3();  // создаём экземпляр объекта с именем mini
        mini.go();
    }

    public void setUpGui() { // устанавливаем параметры поля
        ml = new MyDrawPanel();
        f.setContentPane(ml);
        f.setBounds(30,30,300,300);
        f.setVisible(true);
    }

    public void go(){
        setUpGui();

        try {
            Sequencer sequencer = MidiSystem.getSequencer(); // создания миди пианино
            sequencer.open(); // открытие пианино
            sequencer.addControllerEventListener(ml, new int[] {127}); //
            Sequence seq = new Sequence(Sequence.PPQ, 4);  // создание последовательности
            Track track = seq.createTrack(); // создаём дорожку

            int r = 0;
            for (int i = 0; i < 60 ; i += 4) {

                r = (int) ((Math.random() * 50) + 1); // создаются рандомные числа и сохраняются в дорожку трека
                track.add(makeEvent(144,1,r,100,i));
                track.add(makeEvent(176,1,127,0,i));
                track.add(makeEvent(128,1,r,100,i + 2));
            }

            sequencer.setSequence(seq);
            sequencer.start(); // запуск секвентера
            sequencer.setTempoInBPM(120);  // устанавливаем темп
        } catch (Exception ex) {ex.printStackTrace();}
    }

    public MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;  // создаётся регистратор события
        try {
            ShortMessage  a = new ShortMessage();
            a.setMessage(comd,chan, one, two);
            event = new MidiEvent(a, tick);
        }catch (Exception e){}
        return event;  // возвращает event
    }

    class MyDrawPanel extends JPanel implements ControllerEventListener {
        boolean msg= false;

        public void controlChange(ShortMessage event) {
            msg = true; // получили событие и присваиваем флагу тру, и вызываем репаинт
            repaint();
        }

        public void paintComponent(Graphics g) {
            if (msg) {
                Graphics2D g2 = (Graphics2D) g;

                int r = (int) (Math.random() * 250);
                int gr = (int) (Math.random() * 250);
                int b = (int) (Math.random() * 250);

                g.setColor(new Color(r,gr,b));  // устанавливаем цвет после случайного выбора

                int ht = (int) ((Math.random() * 120) + 10);
                int width = (int) ((Math.random() * 120) + 10);

                int x = (int) ((Math.random() * 40) + 10);
                int y = (int) ((Math.random() * 40) + 10);

                g.fillRect(x,y,ht,width);  // рисование производного прямоугольника
                msg = false;
            }
        }
    }

}
