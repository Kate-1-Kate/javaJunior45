package lesson9.domashka;

public abstract class Hen {


    public abstract int getCountOfEggsPerMonth();

    public abstract String getCountry();


    public String getDescription() {
        return "Я курица";
    }

    public String getHen(){
        if (getCountry().equals("Россия")){
            return "порода : Русская красавица";
        }
        if (getCountry().equals("Молдова")){
            return "порода : Геркулес";
        }
        if (getCountry().equals("Беларусь")){
            return "порода : Курчавая";
        }

            return "порода : Ушанка";

    }
}
