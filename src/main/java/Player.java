import java.util.ArrayList;

public class Player {

    private ArrayList<Card> hand;
    private String name;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<Card>();
    }

    public void addCardToHand(Card card) {
        this.hand.add(card);
    }

    public int valueOFHand() {
        int handValue = 0;

        for(Card card : this.hand) {
            if (card.getRankValue() == 1 && handValue < 11) {
                handValue += 11;
            } else {
                handValue += card.getRankValue();
            }
        }

        return handValue;
    }

    public int getHandSize() {
        return this.hand.size();
    }

    public boolean blackjack() {
        return (this.getHandSize() == 2 && this.valueOFHand() == 21);
    }
}
