package lesson13.HomeWork;

public class StringUtil implements StringUtils{
    @Override
    public String div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        if ((Double.valueOf(number1) == 0) || (Double.valueOf(number2) == 0)){
            throw new NullPointerException("Number 1 или Number 2 равны 0!!!");
        }
        if ((number1.matches("-?\\d+(\\.\\d+)?")) || (number2.matches("-?\\d+(\\.\\d+)?"))){
            throw new NumberFormatException("Number 1 или Number 2 не число!!!");
        }


        return String.valueOf(Double.valueOf(number1) / Double.valueOf(number2));
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        return new int[0];
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        return new double[0];
    }
}
