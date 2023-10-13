package lesson8;

public class Person {
    private String fullName;
    private int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
        fullName = "Zayceva";
        age = 25;
    }

    public void move() {
        System.out.println(this.fullName + " Person говорит");
    }

    public void talk() {
        System.out.println(this.fullName + " Person говорит");
    }

    public static void main(String[] args) {
        Person Vasya = new Person("Pupkin", 22);
        Person Liza = new Person();
        System.out.print(Vasya.fullName);
        System.out.println(" " + Vasya.age);
        System.out.print(Liza.fullName);
        System.out.println(" " + Liza.age);
    }

}
