import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DeckTest {

    Deck deck;
    Card card1;

    @Before
    public void before(){
        deck = new Deck();
        card1 = new Card(SuitType.CLUBS, RankType.ACE);
    }

    @Test
    public void deckStartsEmpty(){
        assertEquals(0, deck.cardCount());
    }

    @Test
    public void canAddCardToDeck(){
        deck.addCardToDeck(card1);
        assertEquals(1, deck.cardCount());
    }

    @Test
    public void canPopulateDeckWith52UniqueCards(){
        deck.populateDeck();
        assertEquals(52, deck.cardCount());
    }

//    @Test
//    public void cardsInDeckAreUnique() {
//        assertEquals(true, deck.cardsAreUniqueInDeck());
//    }

    @Test
    public void canDealCardFromDeck() {
        deck.shuffler();
        boolean result = deck.dealCard().getClass().isInstance(card1);
//        assertTrue(result);
        assertEquals(51, deck.cardCount());
    }


}