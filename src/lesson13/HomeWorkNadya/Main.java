package lesson13.HomeWorkNadya;


import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        try {
            String string1 = "55";
            String string2 = "5";
            StringUtilsImpl stringUtils = new StringUtilsImpl();
            double result = stringUtils.div(string1, string2);
            System.out.println("1. Результат деления:");
            System.out.println(result);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: "+ e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: "+ e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }

        //задание 2
        try {
            String word = "раму";
            String text = "мама мыла раму раму раму мыла и еще раз раму мыла мама";
            StringUtilsImpl stringUtils = new StringUtilsImpl();
            int[] indices = stringUtils.findWord(text, word);
            System.out.println("\n2. Индексы вхождения слова " + word + ":");
            System.out.println(Arrays.toString(indices));
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }

        try {
            String text = "text исхwe3одный т-235екст -2/3  kjk9-9.0";
            StringUtilsImpl stringUtils = new StringUtilsImpl();
            double[] result = stringUtils.findNumbers(text);
            System.out.println("\n3. Double числа из строки в виде массива: ");
            System.out.println(Arrays.toString(result)
            );

        } catch (CustomException e) {
            System.out.println("\nCustomException: " +e.getMessage());
        }

    }
}
