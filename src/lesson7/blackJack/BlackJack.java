package lesson7.blackJack;

public class BlackJack {
private Koloda koloda = new Koloda();
private Player[] players = new Player[8];

    public Koloda getKoloda() {
        return koloda;
    }

    public void setKoloda(Koloda koloda) {
        this.koloda = koloda;
    }
    public void addPlayerToGame(Player player){
        for (int i = 0; i < players.length; i++){
            if (players[i] == null){
                players[i] = player;
                break;
            }
        }
    }
    public void dealTwoKardsToAllPlayers(){
        for (int i = 0; i < players.length; i++){
            if (players[i] != null){
                Card card = koloda.randomCard();
                players[i].addCardToHand(card);
            }
        }
        for (int i = 0; i < players.length; i++){
            if (players[i] != null){
                Card card = koloda.randomCard();
                players[i].addCardToHand(card);
            }
        }
    }
    public void dealRemainingCardsToAllPlayers(){
        for (int i = 0; i < players.length; i++){
            if (players[i] != null){
                while (players[i].needMoreCards()){
                    players[i].addCardToHand(koloda.randomCard());
                }
            }
        }
    }

    public void printWinners() {

        for (int i = 0; i < players.length; i++){
            if(players[i] != null && players[i].caddsValueOnHand() > 21){
                players[i].setCanWin(false);
            }
        }
        if (countPlayersWhicCanWin() == 0){
            for (int i = 0; i < players.length; i++){
                if (players[i] != null && players[i] instanceof Dealer){
                    System.out.println("---- Выиграл крупье ----");
                    players[i].openHand();
                }
            }
        }
        int winnersValue = winnersValue();
        for (int i = 0; i < players.length; i++){
            if (players[i] != null && players[i].caddsValueOnHand() == winnersValue){
                System.out.println("------ ПОБЕДИТЕЛЬ : " + players[i].getNickname());
                players[i].openHand();
            }
        }

    }
    public int countPlayersWhicCanWin(){
        int count = 0;
        for (int i = 0; i < players.length; i++){
            if (players[i] != null && players[i].isCanWin()) {
                count++;
            }
        }
        return count;
    }
    public int winnersValue(){
        int winnerValue = -1;
        for (int i = 0; i < players.length; i++){
            if (players[i] != null && players[i].isCanWin() && players[i].caddsValueOnHand() > winnerValue){
                winnerValue = players[i].caddsValueOnHand();
            }
        }
        return winnerValue;
    }
}
