package lesson15;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
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

        CopyWhithFileChannel copyWhithFileChannel = new CopyWhithFileChannel();
        long time7 = System.currentTimeMillis();
        copyWhithFileChannel.copy("D:\\Games\\3.3.5 RUS\\CircleL rus\\Data\\patch-3.MPQ", "Тест4.MPQ");
        long time8 = System.currentTimeMillis();
        System.out.println("Копирование c помощью FileChannel: " + (time8 - time7));

        CopyWithStream copyWithStream  = new CopyWithStream();
        long time9 = System.currentTimeMillis();
        copyWithStream.copy("D:\\Games\\3.3.5 RUS\\CircleL rus\\Data\\patch-3.MPQ", "Тест5.MPQ");
        long time10 = System.currentTimeMillis();
        System.out.println("Копирование c помощью Потока: " + (time10 - time9));

        CopyWithCatalogJ7 copyWithCatalogJ7  = new CopyWithCatalogJ7();
        long time11 = System.currentTimeMillis();
        copyWithCatalogJ7.copy("D:\\Games\\3.3.5 RUS\\CircleL rus\\Data\\patch-3.MPQ", "Тест6.MPQ");
        long time12 = System.currentTimeMillis();
        System.out.println("Копирование c помощью каталога JAVA 7: " + (time12 - time11));

        CopyWithClassFile copyWithClassFile  = new CopyWithClassFile();
        long time13= System.currentTimeMillis();
        copyWithClassFile.copy("D:\\Games\\3.3.5 RUS\\CircleL rus\\Data\\patch-3.MPQ", "Тест7.MPQ");
        long time14 = System.currentTimeMillis();
        System.out.println("Копирование c помощью Files.copy(2я версия предыдущего копирования): " + (time14 - time13));
    }
}
