package pack2;

public class keeper extends player {

    int keeperID;

    public keeper (int keeperID){
        this.keeperID=keeperID;
    }

    public boolean keepermethod (){

        player player_keeper = new player();
        player_keeper.setPlayerChance(70);

        if (player_keeper.issuccessful(this.keeperID))
            return true;
        else
            return false;


    }

}
