package lesson1;

public class Main1 {

    public static void main(String[] args) {
        int money = 1000;
        int priceOfSnikers = 35;
        double priceOfCandy = 3.5;


        // приведение типа
        int countSnikersCanBuy = money / priceOfSnikers; // остаток не сохраняется 28 (980)
        int restOfMoneyAfterSnekersBuy = money % priceOfSnikers; //

        int countCandyBuy = (int) (restOfMoneyAfterSnekersBuy / priceOfCandy);
         // посчитать сдачу
        double restOfMoneyAfterCandyBuy = restOfMoneyAfterSnekersBuy % priceOfCandy;

        System.out.println(countSnikersCanBuy);
        System.out.println(countCandyBuy);
        System.out.println(restOfMoneyAfterCandyBuy);




    }
}
