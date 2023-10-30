package JavaNaPrimerah.chapter3;
class DivisionByZeroException extends Exception {
    public String getMessage(){
        return "Деление на ноль запрещено!";
    }
} // class
public class ExeptionDemo {
    private static double divide(double dividend, double divisor) throws DivisionByZeroException{
        if (divisor == 0)
            throw new DivisionByZeroException();
        return dividend / divisor;
    } // metod

    public static void main(String[] args) {
        try {
            divide(8, 0);
        } catch (DivisionByZeroException dz) {
            System.out.println(dz.getMessage());
        }
    } // main
} // class
