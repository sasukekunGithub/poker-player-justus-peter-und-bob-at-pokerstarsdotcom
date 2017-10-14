package org.leanpoker.player;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;


/**
 * Created by sebmaster on 14.10.17.
 */
public class Game {
    int smallBlind;
    int currentBuyIn;
    int minimumRaise;
    int round;
    int ourLastBet;
    Card[] ourHand;

    public Game(JsonObject jsonObject) {
        smallBlind = jsonObject.get("small_blind").getAsInt();
        currentBuyIn = jsonObject.get("current_buy_in").getAsInt();
        minimumRaise = jsonObject.get("minimum_raise").getAsInt();
        minimumRaise = jsonObject.get("round").getAsInt();
        JsonArray players = jsonObject.get("players").getAsJsonArray();
        JsonObject ourPlayer = players.get(jsonObject.get("in_action").getAsInt()).getAsJsonObject();
        ourLastBet = ourPlayer.get("bet").getAsInt();

        JsonArray ourCards = ourPlayer.get("hole_cards").getAsJsonArray();

        for(int i=0; i<ourCards.size();i++) {

            JsonObject oneCard = ourCards.get(i).getAsJsonObject();
            String rank = oneCard.get("rank").getAsString();
            String suit = oneCard.get("suit").getAsString();
            Card card = new Card(rank, suit);
            System.out.println("Card " + i +" "+  card.rank);
            System.out.println("Card " + i +" "+  card.cardsuit);

        }


        System.out.println("SmallBlind" + smallBlind);
        System.out.println("Current_buy_in" + currentBuyIn);
        System.out.println("minimum_raise" + minimumRaise);
        System.out.println("round" + round);

    }
}
