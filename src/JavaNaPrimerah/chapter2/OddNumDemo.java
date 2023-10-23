package JavaNaPrimerah.chapter2;

public class OddNumDemo {
    public static void main(String[] args) {

        for (int num = 0; num <= 10; num++) {
            if ((num % 2) == 0) continue;
            System.out.println(num);
        }
    } // main
} // class
