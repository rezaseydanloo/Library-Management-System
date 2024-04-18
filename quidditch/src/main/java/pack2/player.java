package pack2;

import pack1.isSuccessful;

import java.util.Random;

 class player implements isSuccessful {




    protected String keeperteam1  = "111";
    protected String seekerteam1  = "121";
    protected String chaser1team1 = "131";
    protected String chaser2team1 = "132";
    protected String chaser3team1 = "133";
    protected String beater1team1 = "141";
    protected String beater2team1 = "142";
    protected String keeperteam2  = "211";
    protected String seekerteam2  = "221";
    protected String chaser1team2 = "231";
    protected String chaser2team2 = "232";
    protected String chaser3team2 = "233";
    protected String beater1team2 = "241";
    protected String beater2team2 = "242";




    private int playerChance ;
    private int goal_team1;
    private int getGoal_team2;


    public void setGoal_team1(int goal_team1) {
        this.goal_team1 = goal_team1;
    }

    public void setGetGoal_team2(int getGoal_team2) {
        this.getGoal_team2 = getGoal_team2;
    }

    public int getGetGoal_team2() {
        return getGoal_team2;
    }

    public int getGoal_team1() {
        return goal_team1;
    }

    public void setPlayerChance(int playerChance) {
        this.playerChance = playerChance;
    }








    public boolean issuccessful(String playerID ) {

        Random pc = new Random();

        int chance = pc.nextInt(100)+1;

        if (chance>=1 && chance<=playerChance)
            return true;

        return false;

    }




}




