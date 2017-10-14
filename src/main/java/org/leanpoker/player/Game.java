package org.leanpoker.player;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**
 * Created by sebmaster on 14.10.17.
 */
public class Game {
    int smallBlind;
    int currentBuyIn;
    int minimumRaise;

    public Game(JsonObject jsonObject) {
        smallBlind = jsonObject.get("small_blind").getAsInt();
        currentBuyIn = jsonObject.get("current_buy_in").getAsInt();
        minimumRaise = jsonObject.get("minimum_raise").getAsInt();

    }
}
