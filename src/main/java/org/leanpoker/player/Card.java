package org.leanpoker.player;

/**
 * Created by sebmaster on 14.10.17.
 */
public class Card {
    public int rank;
    public int cardsuit;



    public Card(String rank, String suit) {
        switch(rank)
        {
            case "J":
                this.rank = 11;
                break;
            case "Q":
                this.rank = 12;
                break;
            case "K":
                this.rank = 13;
                break;
            case "A":
                this.rank = 14;
                break;
            default:
                this.rank = Integer.getInteger(rank);

        }
        Suit a = Suit.valueOf(suit);
        this.cardsuit = a.ordinal();
    }

    enum Suit{
        hearts,
        clubs,
        spades,
        diamonds
    }

}
