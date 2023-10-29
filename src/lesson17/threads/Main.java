package lesson17.threads;

import lesson15.CopyWithCatalogJ7;
import lesson15.CopyWithCommonIo;
import lesson15.CopyWithGuava;
import lesson15.CopyWithOneByte;

public class Main {
    public static void main(String[] args) {
        CopyFileTask task1 = new CopyFileTaskImpl("D:\\Soft\\WIFI_20220930.exe", "C:\\COPY\\1.exe");
        CopyFileTask task2 = new CopyFileTaskImpl("D:\\Soft\\Ключ активации офиса 2021.doc", "C:\\COPY\\2.doc");
        CopyFileTask task3 = new CopyFileTaskImpl("D:\\Soft\\WIFI.exe", "C:\\COPY\\3.exe");
        CopyFileTask task4 = new CopyFileTaskImpl("D:\\Soft\\PCManager_Setup_16.0.0.118(C001HONORSP1).exe", "C:\\COPY\\1.exe");
        task1.setFileCopyUtils(new CopyWithOneByte());
        task2.setFileCopyUtils(new CopyWithGuava());
        task3.setFileCopyUtils(new CopyWithCommonIo());
        task4.setFileCopyUtils(new CopyWithCatalogJ7());

        Task task5 = new FindFilesTaskImpl("D:\\Soft\\", "WIFI", System.out);
        Task task6 = new FindFilesTaskImpl("D:\\Soft\\", "2021", System.out);
        Task task7 = new FindFilesTaskImpl("D:\\Soft\\", "zip", System.out);
        Task task8 = new FindFilesTaskImpl("D:\\Soft\\", "Setup", System.out);

        TasksStorage storage = new TaskStorageImpl();
        storage.add(task1);
        storage.add(task7);
        storage.add(task8);
        storage.add(task2);

        storage.add(task3);
        storage.add(task5);
        storage.add(task4);
        storage.add(task6);

        TaskExecutor executor1 = new TaskExecutorImpl();
        TaskExecutor executor2 = new TaskExecutorImpl();
        TaskExecutor executor3 = new TaskExecutorImpl();

        executor1.setStorage(storage);
        executor2.setStorage(storage);
        executor3.setStorage(storage);

        executor1.start();
        executor2.start();
        executor3.start();
    }
}
