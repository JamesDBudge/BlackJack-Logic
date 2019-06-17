public class Runner {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.populateDeck();
        deck.shuffler();
        Dealer dealer = new Dealer(deck);
        Player player1 = new Player("Baz");


//        System.out.println(deck.shuffler());
//        for (int i=0; i < 52; i++) {
//            System.out.println(deck.dealCard());
//        }
        dealer.addPlayer(player1);
        dealer.dealCards();
        System.out.println(dealer.valueOFHand());
        System.out.println(player1.valueOFHand());

    }
}
