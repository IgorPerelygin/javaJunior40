package JavaNaPrimerah.chapter2;

public class GradualCastDemo {
    public static void main(String[] args) {

        byte x, z;
        int y;

        x = 5;
        y = x * x; //результат операции имеет тип int
        z = (byte) (x * x); // Чтобы записать результат в переменную byte, требуется явное преобразование типа результата
    }  // main
}  // class
