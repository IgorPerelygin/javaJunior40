package lesson1;

import java.util.Scanner;

public class Main6 {
        public static void main(String[] args) {

            System.out.println("Введите логин:");
            Scanner scaner = new Scanner(System.in);
            String login = scaner.nextLine();
            System.out.println("Введите пароль:");
            String pass = scaner.nextLine();

            if (login.equals("admin")){
                if (pass.equals("123")){
                    System.out.println("OK!");
                }else{
                    System.out.println("Password Wrong");
                }

            }else{
                System.out.println("Login Wrong");
            }
        }
}
