package lesson9.domashka;

public class UkrainianHan extends Hen{


    @Override
    public int getCountOfEggsPerMonth() {
        return 14;
    }

    @Override
    public String getCountry() {
        return "Украина";
    }

    public String getDescription() {
        return super.getDescription();
    }

    public String toString() {
        return   " "+getDescription()+", моя страна - "+this.getCountry()+"," +
                " я несу "+this.getCountOfEggsPerMonth()+" яиц в месяц.";
    }

}
