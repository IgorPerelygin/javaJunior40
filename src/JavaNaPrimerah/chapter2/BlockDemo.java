package JavaNaPrimerah.chapter2;
// пример использования блоков для выполнения нескольких операторов как одного

public class BlockDemo {
    public static void main(String[] args) {
        double i, j, d;
        i = 50;
        j = 150;

        if (i != 0) {
            System.out.println("делитель не равен нулю");
            d = j / i;
            System.out.println("j / i равно " + d);
        } // if
    } // main
} // class
