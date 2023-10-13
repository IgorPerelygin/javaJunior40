package lesson8;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("89997550709", "Apple", 12.4);
        Phone phone2 = new Phone("89997550309", "Samsung");
        Phone phone3 = new Phone();

        System.out.println(phone1.getNumber());
        System.out.println(phone1.model);
        System.out.println(phone1.weight);
        System.out.println();

        System.out.println(phone2.getNumber());
        System.out.println(phone2.model);
        System.out.println(phone2.weight);
        System.out.println();

        System.out.println(phone3.getNumber());
        System.out.println(phone3.model);
        System.out.println(phone3.weight);

        phone1.receiveCall("Мама!");
        phone2.receiveCall("Папа!");
    }
}
