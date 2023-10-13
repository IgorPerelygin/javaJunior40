package blackJack;

public class Main {
    public static void main(String[] args) {
        Koloda koloda = new Koloda();
        koloda.prepared();

        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Dealer dealer = new Dealer();

        player1.setName("Vasya");
        player2.setName("Petya");
        player3.setName("Ruslan");

        BlackJack blackJack = new BlackJack();
        blackJack.addPlayerToGame(player1);
        blackJack.addPlayerToGame(player2);
        blackJack.addPlayerToGame(player3);
        blackJack.addPlayerToGame(dealer);

        blackJack.dealTwoCardsToAllPlayers(koloda);
        blackJack.dealAllNeedCards(koloda);
        blackJack.printWinner();
    }
}
