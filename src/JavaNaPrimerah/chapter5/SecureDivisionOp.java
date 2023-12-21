package JavaNaPrimerah.chapter5;

public class SecureDivisionOp {
    public static void main(String[] args) {
        int result;

        for (int divisor = -5; divisor <= 5; divisor++){
            // использование тернарного оператора для защиты от деления на ноль
            result = divisor != 0 ? 100 / divisor : 0;
            if (result != 0) {
                System.out.println("100 / " + divisor + " = " + result);
            }
        }
    }
}
