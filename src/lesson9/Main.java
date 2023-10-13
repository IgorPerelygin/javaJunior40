package lesson9;

public class Main {
    public static void main(String[] args) {
        Tovar tovar1 = new Tovar("Сковорода", 2000, 1500);
        Tovar tovar2 = new Tovar("Сковорода", 2000, 1500);

        System.out.println(tovar1.equals(tovar2));
        System.out.println(tovar1.hashCode());

        System.out.println(tovar1.toString());
    }
}
