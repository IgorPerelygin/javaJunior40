package lesson2;

public class Main8 {
    public static void main(String[] args) {
        //Сколько мы соберем денег с банка, если оставим 10 000р на 7 лет под 9% годовых
        // помесячная капитализация

        double money = 10000;
        int year = 2;
        int prosent = 9;

        for (int month = 1; month <= year * 12; month++){
            money = money + ((money / 100 * prosent) / 12);

        }

        System.out.println(money);
    }
}
// месяц начинать с 1го, а не с 0.