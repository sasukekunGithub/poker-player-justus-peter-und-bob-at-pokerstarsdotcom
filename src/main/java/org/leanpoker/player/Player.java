package org.leanpoker.player;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

import java.util.Map;

public class Player {

    static final String VERSION = "Default Java folding player";

    public static int betRequest(JsonElement request) {
        JsonArray asJsonArray = request.getAsJsonObject().getAsJsonArray("Game state");
        int minimumraise = asJsonArray.getAsJsonObject().get("minimum_raise").getAsInt();
        int currentbuyin = asJsonArray.getAsJsonObject().get("current_buy_in").getAsInt();

        return currentbuyin+minimumraise+1;
    }

    public static void showdown(JsonElement game) {
    }
}

