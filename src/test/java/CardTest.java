import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(SuitType.SPADES, RankType.KING);
    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.SPADES, card.getSuit());
    }

    @Test
    public void canGetRank(){
        assertEquals(RankType.KING, card.getRank());
    }

    @Test
    public void canGetValueOfRank(){
        assertEquals(10, card.getRankValue());
    }

    @Test
    public void canGetValueOfSuit(){
        assertEquals(4, card.getSuitValue());
    }


}