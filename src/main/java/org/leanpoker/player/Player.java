package org.leanpoker.player;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

import java.util.Map;

public class Player {

    static final String VERSION = "Default Java folding player";

    public static int betRequest(JsonElement request) {
        try {
            JsonArray asJsonArray = request.getAsJsonObject().getAsJsonArray("Game");
            System.out.println("Heureka");
            int minimum_raise = asJsonArray.getAsJsonObject().get("minimum_raise").getAsInt();
            System.out.println("Heureka2");
            int current_buyin = asJsonArray.getAsJsonObject().get("current_buy_in").getAsInt();
            System.out.println("Heureka3");

            
            return current_buyin + minimum_raise + 1;

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            return 1000;
        }
    }
    public static void showdown(JsonElement game) {
    }
}

