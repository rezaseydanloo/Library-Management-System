package pack2;

public class chaser extends player{

    int chaserID;

    public chaser (int chaserID){
        this.chaserID=chaserID;
    }

    public boolean chasermethod(){

        player player_chaser = new player();
        player_chaser.setPlayerChance(30);

        if (player_chaser.issuccessful(this.chaserID))
            return true;
        else
            return false;

    }

}
