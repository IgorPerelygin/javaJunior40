package JavaNaPrimerah.chapter3;
class Number {
    int x;
    Number (int num) {
        x = num;
    } // Number constructor
} // class
public class NumberDemo {
    public static void main(String[] args) {
        Number t1 = new Number(9);
        Number t2 = new Number(27);

        System.out.println(t1.x + " *** " + t2.x);
    } // main
} // class
