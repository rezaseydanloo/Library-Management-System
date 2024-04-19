package pack2;




public class seeker extends player {

    int seekerID;

    public seeker(int seekerID){
        this.seekerID=seekerID;
    }

    public boolean seekermethod() {

        player player_seeker = new player();

        player_seeker.setPlayerChance(5);

        if (player_seeker.issuccessful(this.seekerID))
            return true;
        else
            return false;


    }
}
