package JavaNaPrimerah.chapter6;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class MyApp {
    public static void main(String[] args) {
        try {
            PrintStream errOut = new PrintStream(new FileOutputStream("Error.log"));
            System.setErr(errOut);

            PrintStream sysOut = new PrintStream(new FileOutputStream("Debug.log"));
            System.setOut(sysOut);
        } catch (Exception e) {}
        System.out.println("Сообщение о нормальной работы программы");
        System.err.println("Сообщение об ошибках");
    }
}
