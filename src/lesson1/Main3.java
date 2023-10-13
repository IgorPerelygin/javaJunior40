package lesson1;

public class Main3 {
    public static void main(String[] args) {


        int targetMoney = 10000;
        int moneyDay = 2;
        int dayOfYers = 365;
        int amountTusday = dayOfYers / 7;
        int amountDayNeed = targetMoney / moneyDay;
        double amounOfYers = (double) amountDayNeed / amountTusday;
        /* System.out.println(amountTusday);
        System.out.println(amountDayNeed); */

        System.out.println(amounOfYers);


    }
}
