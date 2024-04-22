package pack2;

import pack1.isSuccessful;

import java.util.Random;

 class player implements isSuccessful {


     private int playerChance;

     public void setPlayerChance(int playerChance) {
         this.playerChance = playerChance;
     }

     public boolean issuccessful(int playerID ) {

        Random pc = new Random();

        int chance = pc.nextInt(100)+1;

        if (chance>=1 && chance<=playerChance)
            return true;

        return false;

    }
}




