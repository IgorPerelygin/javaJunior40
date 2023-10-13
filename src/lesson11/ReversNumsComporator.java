package lesson11;

import java.util.Comparator;

public class ReversNumsComporator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        // 12 56

        return o2 - o1;
    }
}
