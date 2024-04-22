package pack2;

public class chaser extends player{


    public boolean chasermethod(int chaserID){

        player player_chaser = new player();
        player_chaser.setPlayerChance(30);

        if (player_chaser.issuccessful(chaserID))
            return true;
        else
            return false;

    }

}
