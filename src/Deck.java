


import java.util.ArrayList;

public class Deck {
    private Cards[] pack;
    private int usedCards;

    public Deck(){
        pack = new Cards[52];
        int created = 0;
        for(int suit = 1;suit <= 4;suit++){
            for(int values = 1;values <=13;values++){
                if(suit == 1 || suit == 4){
                    pack[created] = new Cards(suit,values,"red");
                    created++;
                }else{
                    pack[created] = new Cards(suit,values,"black");
                    created++;
                }
            }
        }
    }

    //shuffle all cards inside pack
    public void shuffle() {
        for (int lastIndex = pack.length - 1; lastIndex > 0; lastIndex--) {
            int rand = (int) (Math.random() * (lastIndex + 1));
            Cards temp = pack[lastIndex];// letra e i-te
            pack[lastIndex] = pack[rand];// letra e i-te është letra rastes.
            pack[rand] = temp;// letra e rast. është e i-ta
        }
        usedCards = 0;
    }

    //show pack's cards
    public void showCards(){
        for(int i = 0;i < pack.length;i++){
            System.out.println(pack[i]);
        }
    }

    //method to check if we have cards left
    public boolean hasMoreCards() { return usedCards != pack.length; }
    /*public void cardsLeftInDeck() {
        System.out.println("Until now there are :"+usedCards+" used cards out of["+pack.length+"]");;
    }*/


    //make a hand cards for player1
    public ArrayList<Cards> player1Deck() {
        ArrayList<Cards> playerDeck = new ArrayList<>();
        for(int i = 0;i <= 3;i++){
            playerDeck.add(pack[i]);
            // pack[i] = null;
            usedCards++;
        }
        return playerDeck;
    }

    //make  a hand cards for player 2
    public ArrayList<Cards> player2Deck() {
        ArrayList<Cards> playerDeck = new ArrayList<>();
        for(int i = 4;i <= 7;i++){
            playerDeck.add(pack[i]);
            // pack[i] = null;
            usedCards++;
        }
        return playerDeck;
    }

    //get the next card on pack
    public Cards nextCard() {
        if (hasMoreCards()) {
            usedCards++;
            return pack[usedCards - 1];
        } else {
            System.out.println("Ska me letra.");
            return null;
        }
    }



}
