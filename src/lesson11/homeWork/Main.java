package lesson11.homeWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        CollectionUtilsImpl collectionUtils1 = new CollectionUtilsImpl(){};
        Collection<Integer> collectionA = new ArrayList<>();
        Collection<Integer> collectionB = new ArrayList<>();


        for (int i = 1; i <= 6; i++) {
            collectionA.add(i);
            collectionA.add(i);
        }
        for (int i = 5; i <= 10; i++) {
            collectionB.add(i);
            collectionB.add(i);
        }

        //вывод коллекций для наглядности
        for (Iterator<Integer> iterator = collectionA.iterator(); iterator.hasNext(); ) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println(" ");
        for (Iterator<Integer> iterator = collectionB.iterator(); iterator.hasNext(); ) {
            System.out.print(iterator.next() + " ");
        }
        //методы
        Collection<Integer> union = collectionUtils1.union(collectionA, collectionB);
        System.out.println(" \nОбъединение: " + union);

        Collection<Integer> intersection = collectionUtils1.intersection(collectionA, collectionB);
        System.out.println("Пересечение " + intersection);

        Set<Integer> unionWithoutDuplicate = collectionUtils1.unionWithoutDuplicate(collectionA, collectionB);
        System.out.println("Объединение без дубликатов " + unionWithoutDuplicate);

        Set<Integer> intersectionWithoutDuplicate = collectionUtils1.intersectionWithoutDuplicate(collectionA, collectionB);
        System.out.println("Пересечение без дубликатов " + intersectionWithoutDuplicate);

        Collection<Integer> difference = collectionUtils1.difference(collectionA, collectionB);
        System.out.println("Kоллекция, содержащая разность: " + difference);
    }
}
