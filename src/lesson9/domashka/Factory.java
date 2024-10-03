package lesson9.domashka;

public class Factory {

    public static void main(String[] args) {
        BelarusianHen belarusianHen = new BelarusianHen();
        MoldovanHen moldovanHen = new MoldovanHen();
        RussianHen russianHen = new RussianHen();
        UkrainianHan ukrainianHan = new UkrainianHan();

        Hen[] hens = new Hen[4];

        hens[0] = belarusianHen;
        hens[1] = moldovanHen;
        hens[2] = russianHen;
        hens[3] = ukrainianHan;

        for(Hen h : hens){
            System.out.println(h.toString());
        }
    }

}
