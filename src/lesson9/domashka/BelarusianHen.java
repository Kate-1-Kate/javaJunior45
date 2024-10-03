package lesson9.domashka;

public class BelarusianHen extends Hen {


    @Override
    public int getCountOfEggsPerMonth() {
        return 26 ;
    }

    @Override
    public String getCountry() {
        return "Беларусь";
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public String toString() {
        return   " "+getDescription()+", моя страна - "+this.getCountry()+"," +
                " я несу "+this.getCountOfEggsPerMonth()+" яиц в месяц.";
    }

}
