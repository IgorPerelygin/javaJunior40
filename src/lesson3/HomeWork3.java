package lesson3;

public class HomeWork3 {
    public static void main(String[] args) {
        int[] nums = {1, 6, 24, 8, 64, 33, 19, 85};
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.println(nums[i]);
            if (nums[i] % 3 == 0) {
                System.out.println("Делится на 3 без остатка: " + nums[i]);
            }
        }
    }
}
