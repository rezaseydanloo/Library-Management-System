package pack2;

import pack1.isSuccessful;

import java.util.Random;

 class player implements isSuccessful {



    private int playerChance ;
    private int goal_team1;
    private int getGoal_team2;


    public void setGoal_team1(int goal_team1) {
        this.goal_team1 = goal_team1;
    }

    public void setGoal_team2(int getGoal_team2) {
        this.getGoal_team2 = getGoal_team2;
    }

    public int getGoal_team2() {
        return getGoal_team2;
    }

    public int getGoal_team1() {
        return goal_team1;
    }

    public void setPlayerChance(int playerChance) {
        this.playerChance = playerChance;
    }



    public boolean issuccessful(int playerID ) {

        Random pc = new Random();

        int chance = pc.nextInt(100)+1;

        if (chance>=1 && chance<=playerChance)
            return true;

        return false;

    }




}




