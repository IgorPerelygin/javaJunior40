package JavaNaPrimerah.chapter3;
// базовый класс Vehicle
class VehicleEtx {
    int passengers; // кол-во пассажиров
    private int wheels; // число колёс
    private int maxspeed; // макс скорость
    int burnup; // расход топлива

    VehicleEtx() {
        this.passengers = 4;
        this.wheels = 4;
        this.maxspeed = 160;
        this.burnup = 13;
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
}
// подкласс (потомок) Auto базового класса VehicleEtx
class Auto extends VehicleEtx {
    boolean sunroof; // наличие люка
} // class
public class ExtendsVehicleDemo {
    public static void main(String[] args) {

        // создание объекта подкласса Auto
        Auto bmw = new Auto();
        bmw.sunroof = true; // люк есть

        // пример обращения к методам и переменным надкласса и подкласса
        System.out.println("Путь, пройденный за 1.5 часа: " + bmw.distance(1.5 ) + " км.");
        System.out.println("Max.скорость: " + bmw.getMaxspeed() + " км/ч.");
        System.out.println("Наличие люка: " + bmw.sunroof);
    } // metod
} // class
