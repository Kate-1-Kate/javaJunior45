package lesson9.domashka;

public class HenFactory {
    public static void main(String[] args) {

        BelarusianHen belarusianHen = new BelarusianHen();
        MoldovanHen moldovanHen = new MoldovanHen();
        RussianHen russianHen = new RussianHen();
        UkrainianHan ukrainianHan = new UkrainianHan();

        System.out.println(belarusianHen.getHen());
        System.out.println(moldovanHen.getHen());
        System.out.println(russianHen.getHen());
        System.out.println(ukrainianHan.getHen());
    }
}
