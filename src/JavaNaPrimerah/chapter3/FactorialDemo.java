package JavaNaPrimerah.chapter3;
class Factorial {

    // вычисление факториала в цикле
    static long computeI(int n){
        long result = 1;
        for (int i = 1; i <= n; i++)
            result *= i;
        return result;
    }
    // вычисление факториала рекурсивным способом
    static long competeR (int n) {
        if (n == 1) return n;
        return competeR(n - 1) * n;
    }
} // class
public class FactorialDemo {
    public static void main(String[] args) {

        // Factorial  f = new Factorial();
        System.out.println("Вычисление факториала в цикле: ");
        for (int i = 6; i > 0; i--) {
            System.out.println(i + "! = " + Factorial.computeI(i));
        }
        System.out.println("Вычисление факториала рекурсивным методом");
        for (int r = 1; r <= 6; r++) {
            System.out.println(r + "! = " + Factorial.competeR(r));
        }
    }  // metod
} // class
