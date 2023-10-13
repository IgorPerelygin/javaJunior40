package lesson4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("Выберите уровень: ");
        System.out.println("Новичок");
        System.out.println("Любитель");
        System.out.println("Профессионал");
        System.out.println("Особый");

        //Формула создания ссылочного типа
        Scanner scanner = new Scanner(System.in);
        String level = scanner.next();

        if (level.equalsIgnoreCase("Новичок")) {
            int[][] field = new int[9][9];
            for (int i = 0; i < 10; i++) {
                // нужно поставить 1 мину рандомно
                int row = ThreadLocalRandom.current().nextInt(0, 9);
                int col = ThreadLocalRandom.current().nextInt(0, 9);
                if (field[row][col] != 0) { // если есть уже мина
                    i--;
                } else { // если нет мины
                    field[row][col] = 1;
                }
            }
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    System.out.print(field[i][j] + " ");
                }
                System.out.println();
            }


        }
        if (level.equalsIgnoreCase("Любитель")) {
            int[][] field = new int[16][16];
            for (int i = 0; i < 40; i++) {
                // нужно поставить 1 мину рандомно
                int row = ThreadLocalRandom.current().nextInt(0, 16);
                int col = ThreadLocalRandom.current().nextInt(0, 16);
                if (field[row][col] != 0) { // если есть уже мина
                    i--;
                } else { // если нет мины
                    field[row][col] = 1;
                }
            }
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    System.out.print(field[i][j] + " ");
                }
                System.out.println();
            }


        }
        if (level.equalsIgnoreCase("Профессионал")) {
            int[][] field = new int[16][30];
            for (int i = 0; i <99; i++) {
                // нужно поставить 1 мину рандомно
                int row = ThreadLocalRandom.current().nextInt(0, 16);
                int col = ThreadLocalRandom.current().nextInt(0, 30);
                if (field[row][col] != 0) { // если есть уже мина
                    i--;
                } else { // если нет мины
                    field[row][col] = 1;
                }
            }
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    System.out.print(field[i][j] + " ");
                }
                System.out.println();
            }


        }
        if (level.equalsIgnoreCase("Особый")) {
            System.out.println("Введите ширину: ");
            Scanner shirina = new Scanner(System.in);
            int widhtField = shirina.nextInt();
            System.out.println("Введите высоту: ");
            Scanner dlinna = new Scanner(System.in);
            int longField = dlinna.nextInt();
            System.out.println("Введите количество мин: ");
            Scanner miny = new Scanner(System.in);
            int minesField = miny.nextInt();


            int[][] field = new int[longField][widhtField];

            for (int i = 0; i < minesField; i++) {
                // нужно поставить 1 мину рандомно
                int row = ThreadLocalRandom.current().nextInt(0, longField);
                int col = ThreadLocalRandom.current().nextInt(0, widhtField);
                if (field[row][col] != 0) { // если есть уже мина
                    i--;
                } else { // если нет мины
                    field[row][col] = 1;
                }
            }
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    System.out.print(field[i][j] + " ");
                }
                System.out.println();
            }


        }
    }
}