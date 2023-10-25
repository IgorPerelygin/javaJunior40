package JavaNaPrimerah.chapter3;
class Basket { // "Корзина покупок"
    // оплата наличными
    void pay (double money){
        System.out.println("Оплачено наличными: " + money);
    }
    // оплата кредитной картой
    void pay (String cardNum) {
        System.out.println("Оплачено по кредитной карте №" + cardNum);
    }
    // оплата чеком
    void pay (String accountNum, String bankCode) {
        System.out.println("Переведено на счёт №" + accountNum + " в банке " + bankCode);
    }

} // class
public class BasketDemo {
    public static void main(String[] args) {

        Basket b1 = new Basket();
        Basket b2 = new Basket();
        Basket b3 = new Basket();

        System.out.print("b1: ");
        b1.pay(1200.0); // оплата наличными
        System.out.print("b2: ");
        b2.pay("123456789"); // оплата по кредитке
        System.out.print("b3: ");
        b3.pay("987654321", "5500"); // оплата переводом
    } // main
} // class
