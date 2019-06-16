public class Runner {
    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println(deck.shuffler());
        for (int i=0; i < 52; i++) {
            System.out.println(deck.dealCard());
        }
    }
}
