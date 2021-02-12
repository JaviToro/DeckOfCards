import java.util.Random;

public class Deck {

    private Card[] cards;

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    public Deck() {
        this.cards = new Card[52]; //Initializing a new cards array, a deck that will be composed by 52 cards
        int count = 0;
        for (Suit suit : Suit.values()) { //Adding all the cards to complete the deck
            for (FaceValue faceValue : FaceValue.values()) {
                Card card = new Card(faceValue, suit);
                this.cards[count] = card;
                count++;
            }
        }
    }

    public void shuffle() { //A shuffle method that randomly reorders the cards in the deck
        Random random = new Random();
        for (int i = this.size(); i > 0; i--) {
            int swapWith = random.nextInt(this.size() + 1);
            Card tmp = this.cards[swapWith];
            this.cards[swapWith] = this.cards[i];
            this.cards[i] = tmp;
        }
    }

    public Card dealOneCard() { //A method that will deal the top card of the deck
        if (this.isEmpty()) { //Checks if the deck is empty
            throw new IllegalArgumentException("The deck is currently empty. No more cards to deal.");
        } else { //If not, deals the top card and reduces the deck size
            int topCard = this.size();
            Card dealCard = this.cards[topCard];
            Card[] tmp = new Card[this.size()];
            for (int i = tmp.length - 1; i > 0; i--) {
                tmp[i] = this.cards[i];
            }
            this.cards = tmp;
            return dealCard;
        }
    }

    public void print() { //A simple printing method that will show all the cards contained by the deck
        if (this.isEmpty()) {
            System.out.println("The deck is currently empty.");
        } else {
            String deck = "";
            for (Card card : this.cards) {
                if (deck == "") {
                    deck = deck + card.toString();
                } else {
                    deck = deck + (", " + card.toString());
                }
            }
            System.out.println(deck);
        }
    }

    public boolean isEmpty() { //A method to check if the deck is empty
        if (this.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int size() { //A method to obtain the current number of cards
        return this.cards.length - 1;
    }

}