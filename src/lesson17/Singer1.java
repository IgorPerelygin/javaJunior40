package lesson17;

public class Singer1 extends Thread {
    private boolean needStop = false;

    @Override
    public void run() {
        int count = 0;

        while (!needStop){

            for (int i = 0; i < 2; i++){
                System.out.println("La ---------- ");
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e); // e.printstacktrase()
                }
            }

            synchronized (Monitors.MICROFON) {
                Monitors.MICROFON.notify();
            }
            try {
                synchronized (Monitors.MICROFON) {
                    Monitors.MICROFON.wait();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            count++;
            if (count > 4){
                needStop = true;
            }

        }
    }
}
