public class Card {

    private FaceValue faceValue;
    private Suit suit;

    public Card(FaceValue faceValue, Suit suit) {
        this.faceValue = faceValue;
        this.suit = suit;
    }

    public FaceValue getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(FaceValue faceValue) {
        this.faceValue = faceValue;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        String value = "";
        switch (faceValue) {
            case ACE:
                value = "ACE";
                break;
            case TWO:
                value = "2";
                break;
            case THREE:
                value = "3";
                break;
            case FOUR:
                value = "4";
                break;
            case FIVE:
                value = "5";
                break;
            case SIX:
                value = "6";
                break;
            case SEVEN:
                value = "7";
                break;
            case EIGHT:
                value = "8";
                break;
            case NINE:
                value = "9";
                break;
            case TEN:
                value = "10";
                break;
            case JACK:
                value = "JACK";
                break;
            case QUEEN:
                value = "QUEEN";
                break;
            case KING:
                value = "KING";
                break;
        }
        return value + " OF " + suit.toString();
    }
}