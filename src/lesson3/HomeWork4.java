package lesson3;

public class HomeWork4 {
    public static void main(String[] args) {

        int[] nums = {122, 124, 331, 355, 140, 634};
        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 100 == 4 || nums[i] % 10 == 4 || nums[i] % 1 == 4) {
                System.out.println(nums[i]);
            }

        }
    }
}
