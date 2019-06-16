import java.util.ArrayList;

public class Dealer {

    private Deck deck;
    private ArrayList<Player> players;
    private ArrayList<Card> hand;

    public Dealer(deck, players) {
        this.deck = deck;
        this.players = new ArrayList<Player>();
        
    }
}
