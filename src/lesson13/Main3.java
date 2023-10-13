package lesson13;

public class Main3 {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.setAge(160);
        } catch (AgeException e) {
            System.out.println("Возраст не может быть больше 150!");
        }
        System.out.println("Hello!");
    }
}
