package lesson3;

public class HomeWork5 {
    public static void main(String[] args) {
        int sumNums = 0;
      int [] nums = {27, 12, 86, 5, 10, 52};
      for (int i = 0; i < nums.length; i++){
          sumNums = sumNums + nums[i];
      }
        System.out.println("Сумма чисел: "+sumNums);
    }
}
