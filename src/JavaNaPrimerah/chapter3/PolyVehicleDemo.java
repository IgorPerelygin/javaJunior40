package JavaNaPrimerah.chapter3;
// эту часть используем из VehicleOverrideDemo
public class PolyVehicleDemo {
    public static void main(String[] args) {

        Auto3_20 a = new Auto3_20(true); // экземпляр подкласса Auto
        Vehicle3_20 v = new Vehicle3_20();  // экземпляр класса Vehicle

        /* поместим оба объекта в массив типа Vehicle.
        Первый эдемент массива pvd[0] будет содержать экземпляр подкласса Auto,
        а второй - экземпляр класса Vehicle
         */

        Vehicle3_20[] pvd = {a, v};
        for (int i = 0; i < pvd.length; i++) {
            // динамический выбор версии переопределённого метода toString()
            System.out.println(pvd[i].toString());
        } // for

    } // main
} // class
