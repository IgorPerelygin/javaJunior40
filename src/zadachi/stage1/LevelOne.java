package zadachi.stage1;

import java.util.Scanner;

public class LevelOne {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int x = Integer.parseInt(scanner.next());
        String result;
        if (x > 0) {
            result = "положительное";
        } else if (x < 0) {
            result = "отрицательное";
        } else {
            result = "ноль";
        }
        System.out.println("Введённое число: " + result);


        System.out.println("Введите строку:");
        String str = scanner.next();
        System.out.println("Длинна строки: " + str.length());

        System.out.println("Введите строку ещё раз:");
        String str1 = scanner.next();
        System.out.println("Последний символ строки: " + str1.substring(str1.length() - 1));

        System.out.println("Введите число:");
        int y = Integer.parseInt(scanner.next());
        String resultY;
        if (y % 2 == 0) {
            resultY = "чётное";
        } else {
            resultY = "нечётное";
        }
        System.out.println("Введённое число: " + resultY);


        System.out.println("Введите первое слово:");
        String word1 = scanner.next();
        System.out.println("Введите второе слово:");
        String word2 = scanner.next();
        String resultWord;
        if (word1.compareTo(word2)<0) {
            resultWord = "совпадают";
        } else {
            resultWord = "не совпадают";
        }
        System.out.println("Первые буквы слов: " + resultWord);


        System.out.println("Введите слово:");
        String word3 = scanner.next();

        char resultChar;
        resultChar = word3.charAt(word3.length() - 1);
        if (resultChar == 'ь') {
            resultChar = word3.charAt(word3.length() - 2);
        }
        System.out.println("Последняя буква слова: " + resultChar);
    }
}
