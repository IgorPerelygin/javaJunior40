package lesson11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {
        // проход по коллекции
        // 1. С помощью for - используется только в коллекции только ГДЕ ЕСТЬ ИНДЕКСЫ (по SETaм)
        // 2. С помощью for each - можно пройтись по коллекции, НО НЕ ИЗМЕНИТЬ ЕЁ
        // 3. С помощью итератора - МОЖЕТ ПРОЙТИСЬ И МОДЕРНИЗИРОВАТЬ КОЛЛЕКЦИЮ
        // int - Integer, float - Float, char - Charecter - классы обвёртка,

        TreeSet<Integer> texts = new TreeSet<>(new ReversNumsComporator()); // если вложить метод сортировки, то не будет использоваться из метода Integer
        texts.add(8);
        texts.add(4);
        texts.add(6);
        texts.add(1);
        texts.add(9);

        for (Iterator<Integer> iterator = texts.iterator(); iterator.hasNext(); ){
            System.out.println(iterator.next());
        }

    }
}
