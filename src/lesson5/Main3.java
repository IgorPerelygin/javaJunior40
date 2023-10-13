package lesson5;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main3 {
    public static void main(String[] args) {
        String level = ScannerUtil.getLevel();

        if (level.equalsIgnoreCase("новичок")) {
            int[][] field = new int[9][9];
            for (int i = 0; i < 10; i++) {
                // нужно поставить рандомно 1 мину
                int row = ThreadLocalRandom.current().nextInt(0, 9);
                int col = ThreadLocalRandom.current().nextInt(0, 9);
                if (field[row][col] != 0) { // если уже есть в клеточке мина
                    i--; // откат попытки
                } else { // если нет в клеточке мины
                    field[row][col] = 1;
                }
                field[row][col] = 8;
            }
            ScannerUtil.printField(field);
        } else if (level.equalsIgnoreCase("любитель")) {
            int[][] field = new int[16][16];
            for (int i = 0; i < 40; i++) {
                // нужно поставить рандомно 1 мину
                int row = ThreadLocalRandom.current().nextInt(0, 16);
                int col = ThreadLocalRandom.current().nextInt(0, 16);
                if (field[row][col] != 0) { // если уже есть в клеточке мина
                    i--; // откат попытки
                } else { // если нет в клеточке мины
                    field[row][col] = 1;
                }
                field[row][col] = 8;
            }
            ScannerUtil.printField(field);
        } else if (level.equalsIgnoreCase("профессионал")) {
            int[][] field = new int[16][30];
            for (int i = 0; i < 99; i++) {
                // нужно поставить рандомно 1 мину
                int row = ThreadLocalRandom.current().nextInt(0, 16);
                int col = ThreadLocalRandom.current().nextInt(0, 30);
                if (field[row][col] != 0) { // если уже есть в клеточке мина
                    i--; // откат попытки
                } else { // если нет в клеточке мины
                    field[row][col] = 1;
                }
                field[row][col] = 8;
            }
            ScannerUtil.printField(field);
        } else if (level.equalsIgnoreCase("особый")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Щирина: ");
            int a = scanner.nextInt();
            System.out.println("Высота: ");
            int b = scanner.nextInt();
            System.out.println("Кол-во мин: ");
            int mines = scanner.nextInt();
            int[][] field = new int[a][b];
            if (mines > (a * b))  { // условие, если введено значение мин
                mines = a * b;    // больше допустимого
            }
            for (int i = 0; i < mines; i++) {
                // нужно поставить рандомно 1 мину
                int row = ThreadLocalRandom.current().nextInt(0, a);
                int col = ThreadLocalRandom.current().nextInt(0, b);
                if (field[row][col] != 0) { // если уже есть в клеточке мина
                    i--; // откат попытки
                } else { // если нет в клеточке мины
                    field[row][col] = 1;
                }
                field[row][col] = 8;
            }
            ScannerUtil.printField(field);
        }
    }
}