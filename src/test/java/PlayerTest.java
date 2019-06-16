import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Deck deck;
    Card card;

    @Before
    public void before() {
        deck = new Deck();
        card = new Card(SuitType.CLUBS, RankType.ACE);
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

}
