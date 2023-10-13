package lesson13;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

public class Fridj {
    private HashMap<String, Integer> products = new HashMap<>();
    private int capacity = 500;

    public void addProduct(String product, int weight) {
        if (products.containsKey(product)) {
            products.put(product, weight + products.get(product));
        } else {
            products.put(product, weight);
        }

    }

    public void printAllProducts() {
        for (Map.Entry<String, Integer> product : products.entrySet()) {  // (слева)тип одного яйца, которое достаём
            System.out.println(product.getKey() + " - " + product.getValue());
        }
    }

    public void getProduct(String product, int weight) {
        if (!products.containsKey(product)) {
            System.out.println("Такого продукта в холодильнике нет!!!");
            return;
        }

        if (products.get(product) < weight) {
            System.out.println("Такого продукта не достаточно" + product + "в холодильнике!");
            products.remove(product);
            return;
        }

        if (products.get(product) == weight) {
            products.remove(product);
            return;
        }

        products.put(product, products.get(product) - weight);

    }

    public void printLatestProducts() {
        for (Map.Entry<String, Integer> product : products.entrySet()) {  // (слева)тип одного яйца, которое достаём
            if (product.getValue() <= 2) {
                System.out.println("В холодильнике " + product.getKey() + " скоро закончатся!!!");

            }
        }
    }

    public void printBiggestProduct() {
        List<String> keys = products.entrySet().stream().sorted(Map.Entry.<String,
                Integer>comparingByValue().reversed()).limit(1).map(Map.Entry::getKey).toList();
        System.out.println("В холодильнике " + keys + " больше всего!!!");
    }

    public void printAllSortByAlpfabet() {
        Map<String, Integer> map = new TreeMap<>(products);
        System.out.println(map);
    }

    public void printAllSortValue() {
        Stream<Map.Entry<String, Integer>> sorted =
                products.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue());
        products.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }

    /**
     * Добавить методы
     * 1)Метод должен выводить на консоль те продукты, которые скоро закончатся (меньше 2 кг)
     * 2)Вывести на консоль продукт которого больше всего в холодильнике
     * 3)Вывести на консоль продукты отсортированы по названию (см в Интернете)
     * ***Вывести на консоль продукты отсортированые по весу от меньшего
     *
     */
}
