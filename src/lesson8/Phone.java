package lesson8;

public class Phone {
    String number;
    String model;
    double weight;

    Phone(String n, String m, Double w) {
        number = n;
        model = m;
        weight = w;
    }

    Phone(String n, String m) {
        number = n;
        model = m;
    }

    Phone() {

    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    String getNumber() {
        return number;
    }

}
