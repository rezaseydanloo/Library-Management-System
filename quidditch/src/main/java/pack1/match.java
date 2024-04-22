package pack1;
import pack2.*;


public class match {

    int score;
    seeker seekerobj;
    keeper keeperobj;
    chaser chaserobj;
    beater beaterobj;
    team teamobj = new team();


    public match(int  score){
        this.score=score;
    }


    public void playmatch(){


        for (int round = 1 ; round<=100 ; round++){
            print.roundmatch=round;


            //team 1
            if (seekerobj.seekermethod(teamobj.membernameId.get("steam1"))){
                print.score=150;
                print.printgoldensnitch("team 1 " , teamobj.membernameId.get("steam1"));
                break;
            }

            if (keeperobj.keepermethod(teamobj.membernameId.get("kteam1"))) {
                if (chaserobj.chasermethod(teamobj.membernameId.get("c1team1")) && chaserobj.chasermethod(teamobj.membernameId.get("c2team1"))
                        || chaserobj.chasermethod(teamobj.membernameId.get("c2team1")) && chaserobj.chasermethod(teamobj.membernameId.get("c3team1"))
                        || chaserobj.chasermethod(teamobj.membernameId.get("c1team1")) && chaserobj.chasermethod(teamobj.membernameId.get("c3team1"))) {
                    if (beaterobj.beatermethod(teamobj.membernameId.get("b1team1")) || beaterobj.beatermethod(teamobj.membernameId.get("b2team1"))) {

                        teamobj.setGoal_team1(teamobj.getGoal_team1() + 1);
                        print.print_team1();
                    }
                }
            }


            //team 2
            if (seekerobj.seekermethod(teamobj.membernameId.get("steam2"))){
                print.score=150;
                print.printgoldensnitch("team 2 " , teamobj.membernameId.get("steam2"));
                break;
            }

            if (keeperobj.keepermethod(teamobj.membernameId.get("kteam2"))) {
                if (chaserobj.chasermethod(teamobj.membernameId.get("c1team2")) && chaserobj.chasermethod(teamobj.membernameId.get("c2team2"))
                        || chaserobj.chasermethod(teamobj.membernameId.get("c2team2")) && chaserobj.chasermethod(teamobj.membernameId.get("c3team2"))
                        || chaserobj.chasermethod(teamobj.membernameId.get("c1team2")) && chaserobj.chasermethod(teamobj.membernameId.get("c3team2"))) {
                    if (beaterobj.beatermethod(teamobj.membernameId.get("b1team2")) || beaterobj.beatermethod(teamobj.membernameId.get("b2team2"))) {

                        teamobj.setGoal_team1(teamobj.getGoal_team1() + 1);
                        print.print_team2();

                    }
                }
            }
        }
    }
}
