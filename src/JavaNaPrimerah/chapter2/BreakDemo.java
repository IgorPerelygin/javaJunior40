package JavaNaPrimerah.chapter2;

public class BreakDemo {
    public static void main(String[] args) {

        int nmax = 25;
        for (int n = 0; n < nmax; n++){
            // цикл выполняется до тех пор, пока квадрат числа n не станет больше 25
            if ((n * n) >= nmax) break;
            System.out.println("n равно " + n + ", n в квадрате равно " + n * n);
        } // for
        System.out.println("Конец цикла");
    } // main
} // class
