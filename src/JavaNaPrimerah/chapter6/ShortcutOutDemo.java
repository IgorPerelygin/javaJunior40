package JavaNaPrimerah.chapter6;

import java.io.PrintStream;

public class ShortcutOutDemo {
    // Объявление статического члена типа PrintStream
    private static PrintStream out = System.out;

    public static void main(String[] args) {

        // применение сокращеной формы записи
        out.println("Пример...");
        out.println("...краткой записи команды вывода на консоль...");
    }
}
