package lesson7.blackJack;

public class Dealer extends Player {

    public Dealer(){
        setNickname("Крупье");
    }


    @Override
    public boolean needMoreCards() {
        if (caddsValueOnHand() < 17){
            return true;
        }
    return false;
    }

}
