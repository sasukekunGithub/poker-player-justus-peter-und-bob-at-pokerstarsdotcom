package org.leanpoker.player;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by sebmaster on 14.10.17.
 */
public class Game {
    int smallBlind;
    int currentBuyIn;
    int minimumRaise;
    int round;
    int ourLastBet;
    List<Card> allCardsInGame;
    Card[] ourHand;

    public Game(JsonObject jsonObject) {
        smallBlind = jsonObject.get("small_blind").getAsInt();
        currentBuyIn = jsonObject.get("current_buy_in").getAsInt();
        minimumRaise = jsonObject.get("minimum_raise").getAsInt();
        round = jsonObject.get("round").getAsInt();


        JsonArray players = jsonObject.get("players").getAsJsonArray();
        JsonObject ourPlayer = players.get(jsonObject.get("in_action").getAsInt()).getAsJsonObject();
        ourLastBet = ourPlayer.get("bet").getAsInt();

        allCardsInGame = new ArrayList<Card>();
        JsonArray ourCards = ourPlayer.get("hole_cards").getAsJsonArray();
        System.out.println("Card size " + ourCards.size() + " Round " + round);
        for (int i = 0; i < ourCards.size(); i++) {
            JsonObject oneCard = ourCards.get(i).getAsJsonObject();
            System.out.println("One Card ermittelt");
            String rank = oneCard.get("rank").getAsString();
            String suit = oneCard.get("suit").getAsString();
            allCardsInGame.add(new Card(rank, suit));
            System.out.println("Card addded");
        }


        System.out.println("SmallBlind" + smallBlind);
        System.out.println("Current_buy_in" + currentBuyIn);
        System.out.println("minimum_raise" + minimumRaise);
        System.out.println("round" + round);

    }

    public int bet() {
        if (allCardsInGame.size() == 2 && (allCardsInGame.get(0).rank == allCardsInGame.get(1).rank)) {
            System.out.println("raise");
            return currentBuyIn - ourLastBet + minimumRaise + minimumRaise;
        } else {
            System.out.println("bet");
            return currentBuyIn - ourLastBet + minimumRaise;

        }
    }
}
