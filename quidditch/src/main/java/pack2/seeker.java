package pack2;

public class seeker extends player {


    public boolean seekermethod(int seekerID) {

        player player_seeker = new player();
        player_seeker.setPlayerChance(5);

        if (player_seeker.issuccessful(seekerID))
            return true;
        else
            return false;


    }
}
