package lesson15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class main {
    public static void main(String[] args) {
        try {
            // полный путь C:\Program Files\лролпыр\рыкен\оллрл\erste.jpg
            // относительный путь указывается относительно папки проекта "erste.jpg"
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\Котята\\Downloads\\Lection_IO.ppt"));//путь откуда копируем
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("qwerty.ppt"));

            int c = 0;
            while (true) {
                c = bis.read();
                if (c != -1)
                    bos.write(c);
                else
                    break;
            }
            bis.close();
            bos.flush(); //освобождаем буфер (принудительно записываем содержимое буфера в файл)
            bos.close(); //закрываем поток записи (обязательно!)
        }
        catch (java.io.IOException e) {
            e.printStackTrace();
        }

    }
}
