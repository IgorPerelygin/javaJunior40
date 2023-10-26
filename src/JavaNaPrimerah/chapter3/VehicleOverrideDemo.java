package JavaNaPrimerah.chapter3;
class Vehicle3_20 {
    int passengers; // кол-во пассажиров
    private int wheels; // число колёс
    private int maxspeed; // макс скорость
    int burnup; // расход топлива

    Vehicle3_20(int f, int g, int h, int j) {
        this.passengers = 4;
        this.wheels = 4;
        this.maxspeed = 160;
        this.burnup = 13;
    }

    public Vehicle3_20() {
    }

    double distance(double interval) {
        double val = this.maxspeed * interval;
        return val;
    } // class
    int getMaxspeed () {
        return this.maxspeed;
    }

    // метод чтения значения кол-ва колёс
    int getWheels() {
        return this.wheels;
    }

    // метод записи кол-ва колёс
    void setWheels(int wheels){
        // проверяем переданный параметр на корректность
        if ((wheels < 1) || (wheels > 24)) {
            System.out.println("Неверно цказанно число колёс.");
            return;
        }
        this.wheels = wheels;
    }

    // новый метод
    public String toString() {
        return "Vehicle(passengers=" + passengers + ";" + "wheels=" + wheels + ";"
                + "maxspeed=" + maxspeed + ";" + "burnup=" + burnup + ")";
    } // toString metod
} // class

class Auto3_20 extends Vehicle3_20 {
    boolean sunroof; // наличие люка

    Auto3_20(boolean sunroof){
        this(4, 4, 200, 12, sunroof);
    } // auto boolean constructor

    // конструктор с 5ю параметрами
    Auto3_20(int f, int g, int h, int j, boolean sunroof) {
        super(f, g, h, j);
        this.sunroof = sunroof;
    } // auto3_20

    // метод toString повторённый в классе Auto с изменениями
    public String toString() {
        return "Auto(passengers=" + passengers + ";" + "wheels=" + super.getWheels() + ";"
                + "maxspeed=" + super.getMaxspeed() + ";" + "burnup=" + burnup + ";"
                + "sunroof=" + sunroof + ")";
    }

} // class

public class VehicleOverrideDemo {
    public static void main(String[] args) {
        Vehicle3_20 v = new Vehicle3_20(2, 2, 100, 9);
        Auto3_20 a = new Auto3_20(2, 4, 180, 12, true);
        System.out.println("Vehicle.toString(): " + v.toString());
        System.out.println("Auto.toString(): " + a.toString());
    } // metod
} // class
