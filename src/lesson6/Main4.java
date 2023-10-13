package lesson6;

import java.util.Scanner;

import static lesson6.HomeWork.whatMonth;

public class Main4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberMonth = input.nextInt();
        String month = whatMonth(numberMonth);
        System.out.println(month);

    }
}
