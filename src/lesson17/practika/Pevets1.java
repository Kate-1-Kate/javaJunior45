package lesson17.practika;

public class Pevets1 extends Thread implements Monitors {
    private boolean needStop = false;

    @Override
    public void run() {

        int count = 0;

        while (!needStop){

            count++;

            if (count > 3){
                needStop = true;
            }
        }


        while (true){
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            synchronized (Monitors.MIKROFON) {

                Monitors.MIKROFON.notify();
            }

            synchronized (Monitors.MIKROFON) {
                try {
                    Monitors.MIKROFON.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
