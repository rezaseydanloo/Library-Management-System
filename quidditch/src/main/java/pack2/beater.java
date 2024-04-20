package pack2;

public class beater extends player{

    int beaterId ;

    public beater(int beaterId){
        this.beaterId=beaterId;
    }

    public boolean beatermethod (){


        player player_beater = new player();
        player_beater.setPlayerChance(40);

        if (player_beater.issuccessful(this.beaterId))
            return true;
        else
            return false;


    }



}
