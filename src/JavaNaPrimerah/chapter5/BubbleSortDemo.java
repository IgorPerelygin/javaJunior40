package JavaNaPrimerah.chapter5;

class BubbleSort {
    static void sort (int nums[]) {
        int t; // вспомогательная переменная
        for (int a = 1; a < nums.length; a++){
            // повтор для каждого элемента массива
            for (int b = nums.length - 1; b >= a; b--) {
                // повтор для проверки порядка соседних элементов
                if (nums[b - 1] > nums[b]) {
                    // перестановка элементов
                    t = nums[b - 1];
                    nums[b-1] = nums [b];
                    nums[b] = t;
                }
            }
        }
    }
}

public class BubbleSortDemo {
    public static void main(String[] args) {
        int nums[] = {99, -10, 23, 123972, 17, -654, 46, 87, -9};

        System.out.print("Исходный порядок массива: ");
        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + " ");

        System.out.println();
        BubbleSort.sort(nums);

        System.out.print("Новый порядок: ");
        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + " ");

        System.out.println();
    }
}
