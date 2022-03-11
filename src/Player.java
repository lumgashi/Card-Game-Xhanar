

import java.util.ArrayList;

public class Player {
    private ArrayList<Cards> handDeck;
    private String name;

    public Player(ArrayList<Cards> handDeck, String name) throws ExceptionClass {
        if(handDeck.size() > 4){
            throw  new ExceptionClass("The player must have only 4 cards on deckhand!");
        }
        this.handDeck = new ArrayList<>();
        this.name = name;
    }

    public ArrayList<Cards> getHandDeck(){
        return this.handDeck;
    }

    public void setHandDeck(Cards carddeck){
        handDeck.add(carddeck);
    }

}
