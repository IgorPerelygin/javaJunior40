package lesson6;

import java.util.Random;

public class HomeWork {
    public static int evenNumbersInArray(int[][] array) {
        int countEvenNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != 0) {
                    if (array[i][j] % 2 == 0) {
                        countEvenNumbers++;
                    }
                }
            }
        }
        return countEvenNumbers;
    }

    // принимает 5 чисел и вывести наименьшую из них
    public static int minNumberIsIntroduced(int a, int b, int c, int d, int e) {
        int minNumber = 0;
        if (a < b && a < c && a < d && a < e) {
            minNumber = a;
        }
        if (b < a && b < c && b < d && b < e) {
            minNumber = b;
        }
        if (c < a && c < b && c < d && c < e) {
            minNumber = c;
        }
        if (d < a && d < b && d < c && d < e) {
            minNumber = d;
        }
        if (e < a && e < b && e < c && e < d) {
            minNumber = e;
        }
        return minNumber;
    }

    public static int[] randomFillArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomNumber = random.nextInt(100);
            array[i] = randomNumber;
        }
        return array;
    }

    public static String whatMonth(int numberMonth) { // число от 01 до 12.

        String[] array = new String[]{"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль",
                "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        String whatMonth = array[numberMonth - 1];
        return whatMonth;


    }

    public static String calculateTriangle(int sideA, int sideB, int sideC) {
        String trueTriangle = String.valueOf(0);
        if (sideA > 0 && sideB > 0 && sideC > 0) {
            if (sideA + sideB > sideC && sideB + sideC > sideA && sideC + sideA > sideB){
            trueTriangle = "Верный треугольник";}
            else trueTriangle = "Не возможно построить треугольник";
        } else {
            trueTriangle = "Треугольник не существует";
        }
        return trueTriangle;
    }

}
