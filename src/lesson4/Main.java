package lesson4;

public class Main {
    public static void main(String[] args) {
        int[] nums = {23, 56, 43, 456, 444, 47, 78, 8, 4};

        // for - для прохода по массиву
        // for each - сокращеная версия
//n - текущие число из массива
        for ( int n : nums){
// число в текст
            String numInText = n + "";
            if (numInText.contains("4")){
                System.out.println(numInText);
            }
        }
    }
}
