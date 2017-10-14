package org.leanpoker.player;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;


public class Player {

    static final String VERSION = "Default Java folding player";

    public static int betRequest(JsonElement request) {
        try {
            System.out.print("in bet");

            JsonObject jsonObject = request.getAsJsonObject();
            JsonElement small_blind = jsonObject.get("small_blind");
            JsonElement current_buy_in = jsonObject.get("current_buy_in");
            System.out.print(small_blind.getAsString());

            return 1000;

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            return 1000;
        }
    }
    public static void showdown(JsonElement game) {
        System.out.print("in showdown");
    }
}

