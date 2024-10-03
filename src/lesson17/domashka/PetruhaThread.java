package lesson17.domashka;

import lesson17.practika.Monitors;

public class PetruhaThread extends Thread implements Monitors {

    @Override
    public void run() {


         for (int i = 2; i <= 10 ; i += 2) {

                synchronized (Monitors.MIKROFON) {
                    try {
                        Monitors.MIKROFON.wait();

                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                System.out.println(i + " - я Поток Петруха");

                try {
                    Thread.sleep(1000);

                } catch (InterruptedException e) {

                    e.printStackTrace();

                }

                synchronized (Monitors.MIKROFON) {

                    Monitors.MIKROFON.notify();
                }

         }









    }


}
