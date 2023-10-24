package lesson17;

public class Singer2 extends Thread {

    @Override
    public void run() {
        while (true){

            try {
                synchronized (Monitors.MICROFON) {
                    Monitors.MICROFON.wait();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            for (int i = 0; i < 3; i++){
                System.out.println("----------FA ");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e); // e.printstacktrase()
                }
            }
            synchronized (Monitors.MICROFON) {
                Monitors.MICROFON.notify();
            }
        }
    }
}
