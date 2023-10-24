package lesson17;

public class Leading {
    public static void main(String[] args) {
        System.out.println("Начало концерта!");

        Singer1 singer1 = new Singer1();
        singer1.start();

        Singer2 singer2 = new Singer2();
        singer2.setDaemon(true);
        singer2.start();

        while (singer1.isAlive()){ // будет ждать пока первый жив

        }

        System.out.println("Концерт окончен!");
    }
}
