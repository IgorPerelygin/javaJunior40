package lesson1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Ввадите сторону а:");
        Scanner scaner = new Scanner(System.in);
        int a = scaner.nextInt();
        System.out.println("Введите сторону b:");
        int b = scaner.nextInt();
        System.out.println("Введите сторону c:");
        int c = scaner.nextInt();
       if (a == b){
           if (b == c){
               System.out.println("Треугольник равносторонний!");
           }else{
               System.out.println("Треугольник равнобедренный!");
           }
       }else{
       if (b == c){
            System.out.println("Треугольник равнобедренный!");
        }else{
           if (a ==c){
               System.out.println("Треугольник равнобедренный!");
           }else {
               System.out.println("Треугольник разносторонний");
           }
        }
    }}
}
