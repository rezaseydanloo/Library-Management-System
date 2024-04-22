package pack2;

public class keeper extends player {


    public boolean keepermethod (int keeperID){

        player player_keeper = new player();
        player_keeper.setPlayerChance(70);

        if (player_keeper.issuccessful(keeperID))
            return true;
        else
            return false;


    }

}
