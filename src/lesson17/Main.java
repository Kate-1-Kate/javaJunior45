package lesson17;

public class Main {
    public static void main(String[] args) {

        Mythread mythread = new Mythread();
        mythread.start();

        Thread mySecondThread = new Thread(new MySecondThread());
        mySecondThread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
