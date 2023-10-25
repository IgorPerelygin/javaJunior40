package JavaNaPrimerah.chapter3;
class  VehicleAcc {
    int passengers; // кол-во пассажиров
    int wheels; // число колёс
    private int maxspeed; // макс скорость
    int burnup; // расход топлива

    // конструктор с параметрами
    VehicleAcc (int passengers, int wheels, int maxspeed, int burnup) {
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
public class VehicleAccessDemo {
    public static void main(String[] args) {

        VehicleAcc ferrari = new VehicleAcc(2,4, 360,12);

        double distance = ferrari.distance(0.5);
        System.out.println("Ferrari за пол часа проедет " + distance + " км.");

        // следующий код вызовет ошибку компиляции. Закомментировать его.
        // System.out.println("Скорость Ferrari: " + ferrari.maxspeed + " км/ч.");
    } // main
} // class
