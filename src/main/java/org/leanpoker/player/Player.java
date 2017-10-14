package org.leanpoker.player;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;


public class Player {

    static final String VERSION = "Default Java folding player";

    public static int betRequest(JsonElement request) {
        try {
            System.out.println("in bet");

            JsonObject jsonObject = request.getAsJsonObject();

            Game myGame = new Game(jsonObject);
            System.out.println("Game erfolgreich instantiiert");
            return myGame.bet();

        }
        catch (Exception e)
        {
            System.err.println("in bet in catch");
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            return 100;
        }
    }
    public static void showdown(JsonElement game){
        System.out.println("in showdown");
    }
}

