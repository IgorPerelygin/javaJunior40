package JavaNaPrimerah.chapter5;

class QuickSort {

    static void sort(char items[]) {
        quicksort(items, 0, items.length - 1);
    }

    private static void quicksort(char items[], int left, int right){
        int top, bottom;
        char comparaand, value;

        top = left; // первая позиция
        bottom = right; // последняя позиция
        // выбор компаранда - символ середины массива
        comparaand = items[(left + right) / 2];

        // разделение последовательности на 2 части

        do {
            while ((items[top] < comparaand) && (top < right)) top++;
            while ((comparaand < items[bottom]) && (bottom > left)) bottom--;

            if (top <= bottom) {
                value = items [top];
                items[top] = items[bottom];
                items[bottom] = value;
                top++;
                bottom--;
            }
        } while (top <= bottom);

/*        // если включить, будет виден промежуточный результат
        if (((right + 1) - left) == items.length){
            for (int i = 1; i < items.length; i++)
                System.out.print(items[i]);
            System.out.println();
        }*/

        // рекурсивная строка первой части
        if (left < bottom) quicksort(items, left, bottom);
        // рекурсивная строка второй части
        if (top < right) quicksort(items, top, right);
    }
}

public class QuickSortDemo {
    public static void main(String[] args) {
        char seq[] = {'h', 'e', 'd', 'a', 'c', 'i'};

        System.out.print("Исходный порядок символов: ");
        for (int i = 0; i < seq.length; i++)
            System.out.print(seq[i]);

        System.out.println();
        QuickSort.sort(seq);

        System.out.print("Сортированный порядок:");
        for (int i = 0; i < seq.length; i++)
            System.out.print(seq[i]);
        System.out.println();
    }
}
