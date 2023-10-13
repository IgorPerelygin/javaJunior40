package lesson2;

public class Main1 {
    public static void main(String[] args) {

        //управляющие конструкции
        //if

        int a = 8;
        int b = 8;
        int c = 8;

        if (a != b && b != c && c != a) {
            System.out.println("Это разносторонний треугольник");
        } else if (a == b && b == c && c == a) {
            System.out.println("Это равносторонний треугольник");
        } else {

            System.out.println("Это равнобедренный треугольник");
        }


    }
}
