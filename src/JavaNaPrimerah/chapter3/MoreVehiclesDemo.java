package JavaNaPrimerah.chapter3;

public class MoreVehiclesDemo {
    public static void main(String[] args) {

        // объект car1
        Vehicle car1 = new Vehicle();
        car1.passengers = 2;
        car1.wheels = 6;
        car1.maxspeed = 130;
        car1.burnup = 30;

        // другой экземпляр класса Vehicle: объект bus1
        Vehicle bus1 = new Vehicle();
        bus1.passengers = 45;
        bus1.wheels = 4;
        bus1.maxspeed = 100;
        bus1.burnup = 45;

        // расчёт пути, пройденного за 1.25 часа
        double interval = 1.25;
        double distanceCar = car1.maxspeed * interval;
        double distanceBus = bus1.maxspeed * interval;

        System.out.print("car1 может проехать за 1ч15мин расстояние в ");
        System.out.print(distanceCar + " км с " + car1.passengers);
        System.out.println(" пасажирами");

        System.out.print("bus1 может проехать за 1ч15мин расстояние в ");
        System.out.print(distanceBus + " км с " + bus1.passengers);
        System.out.println(" пасажирами");
    } // main
} // class
