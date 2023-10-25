package JavaNaPrimerah.chapter3;
class StaticBlock {
    static double rootOf9; // корень из 9
    static double rootOf27; // корень из 27
    int number;

    static {
        System.out.println("Инициализация статических членов класса....");
        rootOf9 = Math.sqrt(9.0);
        rootOf27 = Math.sqrt(27.0);
    } // static block

    StaticBlock(int number) {
        System.out.println("Инициализаци переменных экземпляра класса....");
        this.number = number;
    }

} // StaticBlock class
public class StaticBlockDemo {
    public static void main(String[] args) {

        System.out.println("Корень из 9 равен " + StaticBlock.rootOf9);
        System.out.println("Корень из 27 равен " + StaticBlock.rootOf27);

        StaticBlock sb1 = new StaticBlock(4);
        System.out.println("sb1.number = " + sb1.number);

        StaticBlock sb2 = new StaticBlock(16);
        System.out.println("sb2.number = " + sb2.number);
    } // metod
} // class
