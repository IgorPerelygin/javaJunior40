package lesson13.HomeWorkNadya;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtilsImpl implements StringUtils {
    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        double num1;
        double num2;

        if (number1 == null || number2 == null) {
            throw new NullPointerException("числа не должны быть null");
        }
        try {
            num1 = Double.parseDouble(number1);
            num2 = Double.parseDouble(number2);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Вы ввели не числа");
        }
        if (num2 == 0) {
            throw new ArithmeticException("На ноль делить нельзя");
        }
        return num1 / num2;
    }


    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        List<Integer> indexesOfWords = new ArrayList<>();

        if (text == null || word == null) {
            throw new NullPointerException("один из вводимых параметров (слово или текст) null");
        }
        String[] listOfWords = text.split(" ");

        for (int i = 0; i < listOfWords.length; i++) {
            if (listOfWords[i].equals(word)) {
                indexesOfWords.add(i);
            }
        }
        int d = indexesOfWords.size();
        int[] arr = new int[d];
        for (int i = 0; i < d; i++) {
            arr[i] = indexesOfWords.get(i);
        }
        return arr;
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {

        Pattern decimalNumPattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        Matcher matcher = decimalNumPattern.matcher(text);

        List<String> decimalNumList = new ArrayList<>();
        while (matcher.find()) {
            decimalNumList.add(matcher.group());
        }

        int d = decimalNumList.size();
        double[] arr = new double[d];
        for (int i = 0; i < d; i++) {
            arr[i] = Double.parseDouble(decimalNumList.get(i));
        }
        if (decimalNumList.isEmpty()) {
            throw new CustomException("Чисел не обнаружено");
        }
        return arr;

    }
}
