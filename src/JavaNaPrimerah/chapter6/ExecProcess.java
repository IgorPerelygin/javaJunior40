package JavaNaPrimerah.chapter6;

import java.io.IOException;

public class ExecProcess {
    public static void main(String[] args) {
        try {
            // запуск блокнота в Windows
            Runtime.getRuntime().exec("notepad.exe");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
