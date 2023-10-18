package lesson15;

public class Test {
    public static void main(String[] args) {
        CopyWithOneByte copyWithOneByte = new CopyWithOneByte();
        long time1 = System.currentTimeMillis();
        copyWithOneByte.copy("D:\\Games\\3.3.5 RUS\\CircleL rus\\Data\\patch-3.MPQ", "Тест1.MPQ");
        long time2 = System.currentTimeMillis();
        System.out.println("Копирование по одному байту: " + (time2 - time1));

        CopyWithGuava copyWithGuava = new CopyWithGuava();
        long time3 = System.currentTimeMillis();
        copyWithGuava.copy("D:\\Games\\3.3.5 RUS\\CircleL rus\\Data\\patch-3.MPQ", "Тест2.MPQ");
        long time4 = System.currentTimeMillis();
        System.out.println("Копирование c помощью Guava: " + (time4 - time3));

        CopyWithCommonIo copyWithCommonIo = new CopyWithCommonIo();
        long time5 = System.currentTimeMillis();
        copyWithCommonIo.copy("D:\\Games\\3.3.5 RUS\\CircleL rus\\Data\\patch-3.MPQ", "Тест3.MPQ");
        long time6 = System.currentTimeMillis();
        System.out.println("Копирование c помощью CommonIo: " + (time6 - time5));
    }
}
