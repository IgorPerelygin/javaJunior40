package JavaNaPrimerah.chapter3;
class  VehicleGetSet {
    int passengers; // кол-во пассажиров
    private int wheels; // число колёс
    private int maxspeed; // макс скорость
    int burnup; // расход топлива

    // конструктор без параметров, инициализирующий переменные объекта стандартными значениями
    VehicleGetSet(){
        /*this.passengers = 4;
        this.wheels = 4;
        this.maxspeed = 160;
        this.burnup = 13;*/
        this(4,4,160,13); // более короткий ввод
    } // constructor

    // конструктор с параметрами, инициализирующий переменные объектаа значениями из
    // вызывающей программы
    VehicleGetSet (int passengers, int wheels, int maxspeed, int burnup) {
        this.passengers = passengers;
        this.wheels = wheels;
        this.maxspeed = maxspeed;
        this.burnup = burnup;
    } // VehicleGetSet (int, int, int, int) constructor
    // расчёт длинны пройденного пути
    double distance(double interval) {
        double val = this.maxspeed * interval;
        return val;
    } // distance metod

    // метод чтения значения maxspeed
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

} //class
public class VehicleGetSetMetod {
    public static void main(String[] args) {

        VehicleGetSet ferrari = new VehicleGetSet(2,-2,360, 12);
        System.out.println("Max скорость: " + ferrari.getMaxspeed() + " км/ч.");
        System.out.println("Число колёс: " + ferrari.getWheels());

        ferrari.setWheels(4);
        System.out.println("Число колёс (повторно): " + ferrari.getWheels());
    } // main
} // class
