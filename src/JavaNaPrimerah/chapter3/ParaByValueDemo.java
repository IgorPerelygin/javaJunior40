package JavaNaPrimerah.chapter3;
class ParaByValue {
    void callByVal (int x, int y) {
        x = x + y;
        y = y + 1;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    } // metod
} // class

public class ParaByValueDemo {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        // передача параметров по значению
        ParaByValue test = new ParaByValue();
        test.callByVal(a, b);

        System.out.println("a = " + a); // вывод 2
        System.out.println("b = " + b); // вывод 3
    } // metod
} // class
