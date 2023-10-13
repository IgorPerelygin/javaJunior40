package game1;

import javax.swing.*;

public class Display {
    public static void main(String[] args) {
        JFrame frame = new JFrame(/* название нашей игры */);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        //frame.add(new Main());
        frame.setVisible(true);
    }
}
