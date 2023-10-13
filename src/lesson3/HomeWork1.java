package lesson3;

public class HomeWork1 {
    public static void main(String[] args) {
        int summEvenNumbers = 0;
        int[] nums = {3, 6, 4, 9, 34, 12};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                summEvenNumbers = summEvenNumbers + 1;

            }
        }
        System.out.println(summEvenNumbers);


    }
}
