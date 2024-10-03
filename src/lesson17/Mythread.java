package lesson17;

public class Mythread extends Thread{

    @Override
    public void run() {
        for (int i = 100; i < 115; i++){
            System.out.println(i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
