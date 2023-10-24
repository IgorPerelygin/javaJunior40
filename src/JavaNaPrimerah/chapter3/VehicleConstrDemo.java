package JavaNaPrimerah.chapter3;
class  VehicleConst {
    int passengers; // кол-во пассажиров
    int wheels; // число колёс
    int maxspeed; // макс скорость
    int burnup; // расход топлива

    // конструктор с параметрами
    VehicleConst(int passengers, int wheels, int maxspeed, int burnup) {
        this.passengers = passengers;
        this.wheels = wheels;
        this.maxspeed = maxspeed;
        this.burnup = burnup;
    } // VehiclrConst (int, int, int, int)
    // расчёт длинны пройденного пути
    double distance(double interval) {
        double value = this.maxspeed * interval;
        return value;
    } // distance

} //class
public class VehicleConstrDemo {
    public static void main(String[] args) {

        VehicleConst car = new VehicleConst(2, 4, 130, 30);
        VehicleConst bus = new VehicleConst(45, 4, 120, 25);

        double interval = 1;
        double distanceCar = car.distance(interval);
        double distanceBus = bus.distance(interval);

        System.out.println("Автомобиль с " + car.passengers + " пассажирами " + "проедет за 1 час "
                + distanceCar + " км.");
        System.out.println("Автобус с " + bus.passengers + " пассажирами " + "проедет за 1 час "
                + distanceBus + " км.");
    } // main
} // class
