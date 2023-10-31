package JavaNaPrimerah.chapter3;
interface A {
    void metodA(); // метод А() интерфейса А
} // А interface

interface B extends A {
    void metodB(); // метод B() интерфейса B
} // B interface

class IExample implements B {

    @Override
    public void metodA() {
        System.out.println("Метод А");
    }

    @Override
    public void metodB() {
        System.out.println("Метод B");
    }
}  // class
public class IExampleDemo {
    public static void main(String[] args) {
        IExample ie = new IExample();
        ie.metodA(); // вызов метода интерфейса А
        ie.metodB(); // вызов метода интерфейса B
    } // metod
} // class
