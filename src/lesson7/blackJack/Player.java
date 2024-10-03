package lesson7.blackJack;

import java.util.Scanner;

public class Player {
    private String nickname;
    private Card[] cardsOnHand = new Card[20];
    private boolean canWin = true;

    public Player() {
    }

    public Player(String nickname) {
        this.nickname = nickname;
    }


    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getNickname() {
        return nickname;
    }

    public boolean isCanWin() {
        return canWin;
    }

    public void setCardsOnHand(Card[] cardsOnHand) {
        this.cardsOnHand = cardsOnHand;
    }

    public void setCanWin(boolean canWin) {
        this.canWin = canWin;
    }

    public Card[] getCardsOnHand() {
        return cardsOnHand;
    }

    public void addCardToHand(Card card){
        for (int i = 0; i < cardsOnHand.length; i++ ){
            if (cardsOnHand[i] == null){
                cardsOnHand[i] = card;
                break;
            }

        }
    }

    public boolean needMoreCards() {
        System.out.println("------- Ваши карты --------");
        openHand();
        System.out.println("--------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вам нужна карта ?");
        if (scanner.next().equalsIgnoreCase("да")) {
            return true;
        }
        return false;
    }
    public void openHand(){
        for (int i = 0; i < cardsOnHand.length; i++){
            if (cardsOnHand[i] != null){
                cardsOnHand[i].open();
            }
        }
    }
    public int caddsValueOnHand(){
       int value = 0;
        for(int i = 0; i < cardsOnHand.length; i++){
            if (cardsOnHand[i] != null){
                value = value + cardsOnHand[i].getValue();
            }
        }
        return value;
    }
}
