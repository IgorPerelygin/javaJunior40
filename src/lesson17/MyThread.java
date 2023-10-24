package lesson17;

public class MyThread extends Thread {

    @Override
    public void run() {
        for(int i = 1000; i < 1020; i++) {
            System.out.println(i + " - " + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
