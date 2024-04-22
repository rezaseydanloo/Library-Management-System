package pack1;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;

public class print {

    static int roundmatch = 0;
    static int score = 0;


    // print method after each goal team 1
    static void print_team1 (){

        team team_goal = new team();

        System.out.println("suiiiiii------ team 1");
        System.out.println("number of goal team 1 : " + team_goal.getGoal_team1());
        System.out.println("number of goal team 2 : " + team_goal.getGoal_team2());
        System.out.println("----------------------------------------");
        System.out.print("round : " + roundmatch + " score : " + score);
        System.out.println("\n");


    }

    // print method after each goal team 2
    static void print_team2 (){

        team team_goal = new team();

        System.out.println("suiiiiii------ team 2");
        System.out.println("number of goal team 1 : " + team_goal.getGoal_team1());
        System.out.println("number of goal team 2 : " + team_goal.getGoal_team2());
        System.out.println("----------------------------------------");
        System.out.print("round : " + roundmatch + " score : " + score);
        System.out.println("\n");


    }

    static void printgoldensnitch (String winner , int seekerID){

        team team_goal = new team();

        System.out.println("golen snitch has been been found by " + winner);
        System.out.print("round : " + roundmatch + " score : " + score);
        System.out.println("\n");
    }


}
