package lesson17;

public class MyThread2 implements Runnable{
    @Override
    public void run() {
        for(int i = 100; i < 120; i++) {
            System.out.println(i + " - " + Thread.currentThread().getName());
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
