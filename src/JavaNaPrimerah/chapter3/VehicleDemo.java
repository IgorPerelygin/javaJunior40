package JavaNaPrimerah.chapter3;
class Vehicle {
    int passengers; // количество пассажиров
    int wheels; // количество колес
    int maxspeed; // максимальная скорость
    int burnup; // расход топлива

    // объявлявем метод, вычисляющий пройденный путь
    // метод принемает параметр interval, задающий времяб и не возвращает никакого значения (void)
    // теперь возвращает вычисленное значение типа double
    double distance (double interval) {
        double value = maxspeed * interval;
        return value;
        //System.out.println("пройдет путь, равный " + value + " км.");
    } // metod


} // Vehicle class
class VehicleDemo {
    public static void main(String[] args) {

        Vehicle car1 = new Vehicle();
        car1.passengers = 2; // два пассажира
        car1.wheels = 6; // шесть колес
        car1.maxspeed = 130; // максимальная скорость 130 км/ч
        car1.burnup = 30; // расход 30 л на 100 км

        // расчёт путиб проходимого за пол часа при движении с максимальной скоростью
        double distance = car1.maxspeed * 0.5;
        System.out.print("За полчаса car1 может проехать ");
        System.out.println(distance + " км.");

        car1 = null;
    } // main

} // VehicleDemo class
