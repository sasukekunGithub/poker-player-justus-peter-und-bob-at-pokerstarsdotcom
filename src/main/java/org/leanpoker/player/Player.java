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

            System.out.println("SmallBlind" + myGame.smallBlind);
            System.out.println("Current_buy_in" + myGame.currentBuyIn);
            System.out.println("minimum_raise" + myGame.minimumRaise);

            return myGame.currentBuyIn + myGame.minimumRaise ;

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

