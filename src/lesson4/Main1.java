package lesson4;

public class Main1 {
    public static void main(String[] args) {
        // создать квадрат 9 на 9 зап 0 и напечать на консоль

        int [][] nums = new int [9][9];
 /*       System.out.print(nums[0][0] + " ");
        System.out.print(nums[0][1] + " ");
        System.out.print(nums[0][2] + " ");
        System.out.println();

        System.out.print(nums[1][0] + " ");
        System.out.print(nums[1][1] + " ");
        System.out.print(nums[1][2] + " ");
        System.out.println();

        System.out.print(nums[2][0] + " ");
        System.out.print(nums[2][1] + " ");
        System.out.print(nums[2][2] + " ");
*/
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums[i].length; j++){
                System.out.print(nums[i][j] + " ");
            }
 /*           System.out.print(nums[i][0] + " ");
            System.out.print(nums[i][1] + " ");
            System.out.print(nums[i][2] + " ");*/
            System.out.println();


        }

    }
}
