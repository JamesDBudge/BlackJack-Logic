import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Deck {

    private ArrayList<Card> deckOfCards;

    public Deck(){
        this.deckOfCards = new ArrayList<Card>();
    }

    public int cardCount() {
        return this.deckOfCards.size();
    }

    public void addCardToDeck(Card card) {
        this.deckOfCards.add(card);
    }

    public ArrayList<Card> populateDeck() {
        SuitType[] suit = SuitType.values();
        RankType[] rank = RankType.values();
        for ( int  i = 0; i < 4; i++){
            for (int j = 0; j < 13 ; j++){
                Card card = new Card(suit[i], rank[j]);
                this.addCardToDeck(card);
            }
        }
        return this.deckOfCards;
    }

//    public boolean cardsAreUniqueInDeck(){
//        this.populateDeck();
//        for (Card comparisonCard : this.deckOfCards) {
//            for (Card card : this.deckOfCards) {
//                if (card == comparisonCard) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }

    public ArrayList<Card> shuffler() {
        Collections.shuffle(this.populateDeck());
        return this.deckOfCards;
    }

    public String dealCard() {
        Card card = this.deckOfCards.remove(0);
        return "You have the " + card.getRank().toString() + " of " + card.getSuit().toString() + ". " + card.getRankValue() + " points to Gryffindor!";
    }

//    public void shuffleArray(ArrayList<Card> ar)
//    {
//        // If running on Java 6 or older, use `new Random()` on RHS here
//        Random rnd = new Random();
//        for (int i = ar.size() - 1; i > 0; i--)
//        {
//            int index = rnd.nextInt(i + 1);
//            // Simple swap
//            int a = ar[index];
//            ar[index] = ar[i];
//            ar[i] = a;
//        }
//    }
}