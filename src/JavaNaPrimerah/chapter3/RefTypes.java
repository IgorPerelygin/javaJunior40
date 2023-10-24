package JavaNaPrimerah.chapter3;
class SimpleVehicle { // упрощенный вариант класса Vehicle
    int passengers;
}
public class RefTypes {
    public static void main(String[] args) {
        SimpleVehicle car1, car2; // две ссылки на объект типа SimpleVehicle
        car1 = new SimpleVehicle(); // создаём объект и ссылку на него
        car1.passengers = 25; // задаём количество пассажиров

        // обе переменные ссылаются на один объект
        car2 = car1;

        // докажем это:
        System.out.println("Количество пассажиров car2 равно " + car2.passengers);
        car2.passengers = 50;
        // если car2 и car1 - это один и тот же объект, то теперь car1.passengers стало ровно 50
        System.out.println("Количество пассажиров car1 равно " + car1.passengers);
    } // main
} // class RefTypes
