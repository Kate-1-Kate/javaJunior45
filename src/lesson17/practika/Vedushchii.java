package lesson17.practika;

public class Vedushchii {
    public static void main(String[] args) {
        System.out.println("Начало концерта : ");

        Pevets1 pevets1 = new Pevets1();
        pevets1.start();
        Pevets2 pevets2 = new Pevets2();
        pevets2.setDaemon(true);
        pevets2.start();

        while (pevets1.isAlive()){

        }

        System.out.println("Конец концерта : ");
    }
}
