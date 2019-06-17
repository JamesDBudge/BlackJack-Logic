import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Dealer dealer;
    Player player1;
    Deck deck;
    Card card1;
    Card card2;

    @Before
    public void before() {
        deck = new Deck();
        deck.populateDeck();
        deck.shuffler();
        player1 = new Player("Baz");
//        dealer.addPlayer(player1);
        dealer = new Dealer(deck);
        card1 = new Card(SuitType.HEARTS, RankType.FOUR);
        card2 = new Card(SuitType.CLUBS, RankType.FIVE);
    }

    @Test
    public void startWithNoPlayers() {
        assertEquals(0, dealer.getPlayers());
    }

    @Test
    public void canAddPlayer() {
        dealer.addPlayer(player1);
        assertEquals(1, dealer.getPlayers());
    }

    @Test
    public void testSetup() {
        dealer.addPlayer(player1);
        dealer.dealCards();
        assertEquals(2, player1.getHandSize());
        assertEquals(2, dealer.getHandSize());
    }

}
