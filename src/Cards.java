
public class Cards {
    private final static int HEART = 1;
    private final static int CLOVER = 2;
    private final static int SPADE = 3;
    private final static int DIAMOND = 4;

    private final static int ACE = 1;
    private final static int JACK = 11;
    private final static int QUEEN = 12;
    private final static int KING = 13;

    private int suit;
    private int value;
    private String color;

    public Cards(int suit, int value, String color) {
        this.suit = suit;
        this.value = value;
        this.color = color;
    }

    public String getColor(){ return this.color;}
    public void setClor(String color){ this.color = color; }

    public int getSuit(){ return this.suit;}
    public int getValue(){ return this.value;}

    public String getSuitToString(){
        switch (suit) {
            case SPADE:
                return "♠";
            case HEART:
                return "♡";
            case DIAMOND:
                return "♢";
            case CLOVER:
                return "♣";
            default:
                return "Joker";
        }
    }

    public String getValueToString() {
        if (suit == 0 ) {
            return "" + value;
        } else {
            switch (value) {
                case ACE:
                    return "ACE";
                case JACK:
                    return "JACK";
                case QUEEN:
                    return "QUEEN";
                case KING:
                    return "KING";
                default:
                    return value + "";
            }
        }
    }

    public String toString() {
        if (suit == 0) {
            return "XHOL #" + value;
        } else
            return getValueToString() + " " + getSuitToString() + " " +this.color;
    }

    public String cardToString() {
        return "Value : " + this.getValueToString() + ", Suit : " + this.getSuitToString() + " " +this.color;
    }

    public boolean equal(Object card){
        if(card instanceof Cards){
            return this.suit == ((Cards)card).getSuit();
        }
        return false;
    }
}
