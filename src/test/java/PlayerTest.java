import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Deck deck;
    Card card;
    Card cardtwo;

    @Before
    public void before() {
        deck = new Deck();
        deck.populateDeck();
        card = new Card(SuitType.CLUBS, RankType.ACE);
        cardtwo = new Card(SuitType.HEARTS, RankType.KING);
        player = new Player("Baz");
    }

    @Test
    public void handStartsEmpty() {
        assertEquals(0, player.getHandSize());
    }

    @Test
    public void playerCanBeDealtCards() {
        player.addCardToHand(card);
        assertEquals(1, player.getHandSize());
    }

    @Test
    public void canGetHandValue() {
        player.addCardToHand(card);
        assertEquals(11, player.valueOFHand());
    }

    @Test
    public void canHaveMaxHandValue() {
        player.addCardToHand(card);
        player.addCardToHand(cardtwo);
        assertEquals(21, player.valueOFHand());
    }

    @Test
    public void canCountAcesCorrectly() {
        player.addCardToHand(card);
        player.addCardToHand(card);
        assertEquals(12, player.valueOFHand());
    }

    @Test
    public void canDetectBlackJack() {
        player.addCardToHand(card);
        player.addCardToHand(cardtwo);
        assertEquals(true, player.blackjack());
    }

}
