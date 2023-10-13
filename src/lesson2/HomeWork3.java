package lesson2;

public class HomeWork3 {
    public static void main(String[] args) {
        // Вывести на консоль сумму четных чисел от 10 до 40

        int summa = 0;
        for (int i = 10; i <= 40; i += 2){
            summa = summa + i;
        }
        System.out.println(summa);
    }
}
