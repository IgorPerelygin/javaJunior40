package lesson1;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner number = new Scanner(System.in);
        int code = number.nextInt();
        int a = code % 2;
        if (a == 0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
