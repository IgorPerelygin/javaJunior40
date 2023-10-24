package JavaNaPrimerah.chapter3;


public class VehicleMetodDemo {
    public static void main(String[] args) {

        Vehicle car = new Vehicle();
        car.passengers = 2;
        car.wheels = 4;
        car.maxspeed = 130;
        car.burnup = 30;

        // другой экземпляр класса Vehicle
        Vehicle bus = new Vehicle();
        bus.passengers = 45;
        bus.wheels = 4;
        bus.maxspeed = 100;
        bus.burnup = 25;

        // расчёт пути, пройденного за 0.5 часа
        double time = 0.5;
        double distanceCar = car.distance(time);
        double distanceBus = bus.distance(time);

        System.out.print("автомобиль с " + car.passengers + " пассажирами ");
        System.out.println("пройдёт за пол часа путь  " + distanceCar + " км.");
        System.out.print("автобус с " + bus.passengers + " пассажирами ");
        System.out.println("пройдёт за пол часа путь  " + distanceBus + " км.");
    } // main
} // class
