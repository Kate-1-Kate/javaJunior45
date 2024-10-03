package lesson17.domashka;

public class Main {
    public static void main(String[] args) {

        VasyaThread vasyaThread = new VasyaThread();
        vasyaThread.start();
        PetruhaThread petruhaThread = new PetruhaThread();
        petruhaThread.start();

        while (vasyaThread.isAlive()){

        }

    }
}
