package org.leanpoker.player;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
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

    public Game(JsonObject jsonObject) {
        smallBlind = jsonObject.get("small_blind").getAsInt();
        currentBuyIn = jsonObject.get("current_buy_in").getAsInt();
        minimumRaise = jsonObject.get("minimum_raise").getAsInt();
        minimumRaise = jsonObject.get("round").getAsInt();
        JsonArray players = jsonObject.get("players").getAsJsonArray();
        JsonObject ourPlayer = players.get(jsonObject.get("in_action").getAsInt()).getAsJsonObject();
        ourLastBet = ourPlayer.get("bet").getAsInt();


        System.out.println("SmallBlind" + smallBlind);
        System.out.println("Current_buy_in" + currentBuyIn);
        System.out.println("minimum_raise" + minimumRaise);
        System.out.println("round" + round);

    }
}
