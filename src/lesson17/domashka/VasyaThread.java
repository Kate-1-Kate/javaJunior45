package lesson17.domashka;

import lesson17.practika.Monitors;

import java.util.concurrent.TimeUnit;

public class VasyaThread extends Thread implements Monitors {
    private boolean needStop = false;

    @Override
    public void run() {

        int count = 0;

        while (!needStop){

            count++;

            if (count > 1){
                needStop = true;
            }
        }


        for (int i = 1; i < 10; i += 2) {

                System.out.println (i + " - я Поток Вася");

                try {

                    Thread.sleep(1000);

                } catch (InterruptedException e) {

                    e.printStackTrace();
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













}   }
