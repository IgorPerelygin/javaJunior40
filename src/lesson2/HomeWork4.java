package lesson2;

public class HomeWork4 {
    public static void main(String[] args) {
        // Вывести на консоль сколько секунд в сутках (86400)

       /* int second = 1;
        int minute = second * 60;
        int hour = minute * 60;
        int day = hour * 24;*/
        int summa = 0;
        for (int i = 0; i < 24 * 60 * 60; i++){
            summa = summa + 1;
        }
        System.out.println(summa);
    }
}
