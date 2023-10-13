package lesson6;

import java.util.Scanner;

import static lesson6.HomeWork.calculateTriangle;

public class Main5 {
    public static void main(String[] args) {
        Scanner sideInput = new Scanner(System.in);
        int sideA = sideInput.nextInt();
        int sideB = sideInput.nextInt();
        int sideC = sideInput.nextInt();
        String triangle = calculateTriangle(sideA, sideB, sideC);
        System.out.println(triangle);
    }
}
