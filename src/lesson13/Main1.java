package lesson13;

public class Main1 {
    public static void main(String[] args) {
        Fridj fridj = new Fridj();
        fridj.addProduct("Бананы", 3);
        fridj.addProduct("Бананы", 2);
        fridj.addProduct("Яблоки", 1);
        fridj.addProduct("Груши", 2);
        fridj.addProduct("Сливы", 8);
        fridj.addProduct("Персики", 4);


        fridj.printLatestProducts();
        fridj.printBiggestProduct();
        fridj.printAllSortByAlpfabet();
        fridj.printAllSortValue();


    }
}
