package lesson1;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int code = scanner.nextInt();
        System.out.println("Вы ввели число "+code);
        if (code == 111){
            System.out.println("OK");
        }else{
            System.out.println("ERROR");
        }
       /* String name = "Ivan";
        System.out.println("Hello "+name);*/

       /* int a = 8;
        int b = 2;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(a==b);
        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println("Hello World");*/
    }
}
