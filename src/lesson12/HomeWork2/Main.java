package lesson12.HomeWork2;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<TeaPot> teaPots = new TreeSet<>();

        teaPots.add(new TeaPot("Redmond A", 1590, 1.7, 1500, "нержавеющая сталь", 12));
        teaPots.add(new TeaPot("Redmond A", 1590, 1.7, 1500, "нержавеющая сталь", 12));
        teaPots.add(new TeaPot("Xiaomi Bsc21", 2795, 1.5, 1800, "нержавеющая сталь", 12));
        teaPots.add(new TeaPot("Aceline SS1800", 670, 1.8, 1800, "нержавеющая сталь", 18));
        teaPots.add(new TeaPot("Samsung", 990, 1.9, 1700, "нержавеющая сталь", 24));
        teaPots.add(new TeaPot("Bosch TWK", 9870, 1.5, 2400, "золото", 12));

        SortingButtons sort = new SortingButtons();

        System.out.println("Результат сортировки по имени (от А до Я): ");
        sort.sortByNameFromTo(teaPots); // сортировка по имени (от Я до А)
        System.out.println();

        System.out.println("Результат сортировки по имени (от Я до А): ");
        sort.sortByNameToFrom(teaPots);  // сортировка по имени (от А до Я)
        System.out.println();

        System.out.println("Результат сортировки по цене (по убыванию): ");
        sort.sortByPriceFromTo(teaPots); // сортировка по цене (по убыванию)
        System.out.println();

        System.out.println("Результат сортировки по цене (по возрастанию): ");
        sort.sortByPriceFromTo(teaPots); // сортировка по цене (по возрастанию)
        System.out.println();

        System.out.println("Результат сортировки по материалу (от А до Я): ");
        sort.sortByMaterialFromTo(teaPots); // сортировка по материалу (от А до Я)
        System.out.println();

        System.out.println("Результат сортировки по материалу (от Я до А): ");
        sort.sortByMaterialToFrom(teaPots); // сортировка по материалу (от Я до А)
        System.out.println();

        System.out.println("Результат сортировки по гарантии (по убыванию): ");
        sort.sortByGuaranteeFromTo(teaPots); // сортировка по цене (по убыванию)
        System.out.println();

        System.out.println("Результат сортировки по гарантии (по возрастанию): ");
        sort.sortByGuaranteeToFrom(teaPots); // сортировка по цене (по возрастанию)
        System.out.println();

        System.out.println("Результат сортировки по объёму (по убыванию): ");
        sort.sortByVolumeFromTo(teaPots); // сортировка по объёму (по убыванию)
        System.out.println();

        System.out.println("Результат сортировки по объёму (по убыванию): ");
        sort.sortByVolumeFromTo(teaPots); // сортировка по объёму (по убыванию)
        System.out.println();

        System.out.println("Результат сортировки по объёму (по возрастанию): ");
        sort.sortByVolumeToFrom(teaPots); // сортировка по объёму (по возрастанию)
        System.out.println();

        System.out.println("Результат сортировки по мощности (по убыванию): ");
        sort.sortByPowerFromTo(teaPots); // сортировка по мощности (по убыванию)
        System.out.println();

        System.out.println("Результат сортировки по мощности (по возрастанию): ");
        sort.sortByPowerToFrom(teaPots); // сортировка по мощности (по возрастанию)
        System.out.println();

    }
}
