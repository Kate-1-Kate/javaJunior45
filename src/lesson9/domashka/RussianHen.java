package lesson9.domashka;

public class RussianHen extends Hen{

    @Override
    public int getCountOfEggsPerMonth() {
        return 30;
    }

    @Override
    public String getCountry() {
        return "Россия";
    }


    public String getDescription() {
        return super.getDescription();
    }

    public String toString() {
        return   " "+getDescription()+", моя страна - "+this.getCountry()+"," +
                " я несу "+this.getCountOfEggsPerMonth()+" яиц в месяц.";
    }


}
