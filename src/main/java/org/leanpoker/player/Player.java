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



            return myGame.currentBuyIn - myGame.ourLastBet + myGame.minimumRaise;

        }
        catch (Exception e)
        {
            System.err.println("in bet in catch");
            System.out.println(e.getMessage());
            return 0;
        }
    }
    public static void showdown(JsonElement game){
        System.out.println("in showdown");
    }
}

