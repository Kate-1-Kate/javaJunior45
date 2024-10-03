package lesson9.domashka;

public class MoldovanHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 20;
    }

    @Override
    public String getCountry() {
        return "Молдова";
    }

    public String getDescription() {
        return super.getDescription();
    }

    public String toString() {
        return   " "+getDescription()+", моя страна - "+this.getCountry()+"," +
                " я несу "+this.getCountOfEggsPerMonth()+" яиц в месяц.";
    }


}
