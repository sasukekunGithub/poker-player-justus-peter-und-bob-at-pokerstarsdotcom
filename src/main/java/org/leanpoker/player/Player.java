package org.leanpoker.player;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;


public class Player {

    static final String VERSION = "Default Java folding player";

    public static int betRequest(JsonElement request) {
        try {
            JsonArray asJsonArray = request.getAsJsonObject().getAsJsonArray("Game");
            for (int i =0;i<asJsonArray.size(); i++) {
                System.out.print(asJsonArray.get(i).getAsString());


            } return 1000;

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            return 1000;
        }
    }
    public static void showdown(JsonElement game) {
        try {
            JsonArray asJsonArray = game.getAsJsonObject().getAsJsonArray("Game");
            for (int i =0;i<asJsonArray.size(); i++) {
                System.out.print(asJsonArray.get(i).getAsString());


            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());

        }
    }
}

