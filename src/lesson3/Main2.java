package lesson3;

public class Main2 {
    public static void main(String[] args) {
        // Создать массив длинной 10 ячеек и наполнить его числами кратными 3 от 30 до .. пока не заполниться массив.
        // вывести маасив на консоль

        int [] nums = new int[10];

//        nums [0] = 30;
//        nums [1] = 33;
//        nums [2] = 36;
//        ...
        int value = 30;
        for (int i = 0; i < nums.length; i++){
            nums[i] = value;
            value = value + 3;
            System.out.println(nums[i]);
        }
    }
}
