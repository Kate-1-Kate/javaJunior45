package lesson17.practika;

public class Pevets2 extends Thread implements Monitors {

    public void run() {
        while (true) {

            synchronized (Monitors.MIKROFON) {
                try {
                    Monitors.MIKROFON.wait();

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            for (int i = 0; i <= 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


            synchronized (Monitors.MIKROFON) {

                Monitors.MIKROFON.notify();
            }
        }
    }


}
