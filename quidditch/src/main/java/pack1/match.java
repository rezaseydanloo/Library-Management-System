package pack1;
import pack2.*;


public class match {

    int score=0;
    seeker seekerobj;
    keeper keeperobj;
    chaser chaserobj;
    beater beaterobj;
    team   teamID = new team();


    public match(int  score){
        this.score=score;
    }




    public void playmatch(){


        for (int round = 1 ; round<=100 ; round++){

            print.roundmatch=round;

            //team 1

            if (seekerobj.seekermethod(teamID.membernameId.get("seeker team1"))){
                print.printgoldensnitch("team 1 ");
                break;
            }

            if ()







        }
    }
}
