package JavaNaPrimerah.chapter2;
// Динамическая инициализация переменных
public class CylinderVolume {
    public static void main(String[] args) {
        // Эти переменные инициализируются константами
        double radius = 4; //  радиус цилиндра
        double height = 5; // выссота цилиндра

        // переменная volume инициализируется динамически вычисленным значением выражения
        double volume = 3.1416 * radius * radius * height;
        System.out.println("Объем цилиндра равен " + volume);
    } // main
} // Cylinder class
