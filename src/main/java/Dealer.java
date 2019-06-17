import java.util.ArrayList;

public class Dealer {

    private Deck deck;
    private ArrayList<Player> players;
    private ArrayList<Card> dealer;

    public Dealer(Deck deck) {
        this.deck = deck;
        this.players = new ArrayList<Player>();
        this.dealer = new ArrayList<Card>();
    }

    public void dealCards(){
        for(int i = 0; i< this.players.size()+1; i++){
            Card card = deck.dealCard();
            this.dealer.add(card);
            for (Player player: this.players) {
                Card card2 = deck.dealCard();
                player.addCardToHand(card2);
            }
        }
    }

    public int getPlayers() {
        return this.players.size();
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public int getHandSize() {
        return this.dealer.size();
    }

    public int valueOFHand() {
        int handValue = 0;
        for(Card card : this.dealer) {
            if (card.getRankValue() == 1 && handValue < 11) {
                handValue += 11;
            } else {
                handValue += card.getRankValue();
            }
        }
        return handValue;
    }

    public 

}
