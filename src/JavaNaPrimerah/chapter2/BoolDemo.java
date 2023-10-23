package JavaNaPrimerah.chapter2;
// пример использования типа данных boolean
public class BoolDemo {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b равно " + b);
        b = true;
        System.out.println("b равно " + b);

        // переменная логического типа может стоять в условии оператора if
        if (b) System.out.println("Как вы думаете, увидите ли вы эту строку?"); // тут имеется ввиду, если b = true, то sout...

        // операторы сравнения возвращают логическое значение
        System.out.println("Выражение 10>9 имеет значение " + (10 > 9)); // оператор конкатенации(+) имеет приоретет перед (>)
    } // main
} // class
