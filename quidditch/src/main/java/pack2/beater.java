package pack2;

public class beater extends player{


    public boolean beatermethod (int beaterId){

        player player_beater = new player();
        player_beater.setPlayerChance(40);

        if (player_beater.issuccessful(beaterId))
            return true;
        else
            return false;


    }



}
