public class DeckTest {

    public static void main(String[] args) {
        System.out.println("Creating a new deck.");
        Deck deck = new Deck();

        System.out.println("Printing the deck before shuffling:");
        deck.print();

        System.out.println("\nShuffling the deck.");
        deck.shuffle();

        System.out.println("Printing the deck after shuffling:");
        deck.print();

        System.out.println("\nShuffling the deck again.");
        deck.shuffle();

        System.out.println("Printing the deck after shuffling again:");
        deck.print();

        System.out.println("\nDealing the 52 cards of the deck:");
        for (int i = 51; i > 0; i--) {
            Card card = deck.dealOneCard();
            System.out.println("Card dealt. You got " + card.toString() + ". " + (deck.size()) + " remaining cards.");
        }

        System.out.println("\nTrying to deal one more card:");
        try {
            deck.dealOneCard();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("\nPrinting the deck after dealing all the cards:");
        deck.print();
    }
}
