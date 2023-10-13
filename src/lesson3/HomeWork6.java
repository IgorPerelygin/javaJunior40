package lesson3;

public class HomeWork6 {
    public static void main(String[] args) {
        int sumEvenIndex = 0;
        int sumOddIndex = 0;
        int numberDifr = 0;

        int[] nums = {10, 3, 43, 55, 4, 29};
        for (int i = 0; i < nums.length; i++){
            if (i % 2 == 0){
                sumEvenIndex = sumEvenIndex + nums[i];
            }
            else sumOddIndex = sumOddIndex + nums[i];
        }
        numberDifr = sumEvenIndex - sumOddIndex;
        System.out.println("Разница между суммами четных и нечетных индексов: "+numberDifr);
    }
}
