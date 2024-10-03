package lesson7.blackJack;

public class Main {
    public static void main(String[] args) {
        Dealer dealer = new Dealer();

        Player player1 = new Player("DoctorX");
        Player player2 = new Player("PrettyGirl");
        Player player3 = new Player("Marsushka");

        BlackJack blackJack = new BlackJack();

        blackJack.addPlayerToGame(player1);
        blackJack.addPlayerToGame(player2);
        blackJack.addPlayerToGame(player3);
        blackJack.addPlayerToGame(dealer);

        blackJack.dealTwoKardsToAllPlayers();
        blackJack.dealRemainingCardsToAllPlayers();
        blackJack.printWinners();
        blackJack.printWinners();
    }
}
