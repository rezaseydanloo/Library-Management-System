package pack1;

import com.sun.xml.internal.ws.client.ClientSchemaValidationTube;
import pack2.*;

import javax.print.attribute.HashPrintServiceAttributeSet;
import java.util.HashMap;
import java.util.List;

public class team {



    private int goal_team1;
    private int getGoal_team2;



    HashMap<String,Integer> membernameId = new HashMap<>();
    {
        membernameId.put("keeper team1" , 111);
        membernameId.put("seeker team1", 121);
        membernameId.put("chaser1 team1", 131);
        membernameId.put("chaser2 team1", 132);
        membernameId.put("chaser3 team1", 133);
        membernameId.put("beater1 team1", 141);
        membernameId.put("beater2 team1", 142);

        membernameId.put("keeper team2" , 211);
        membernameId.put("seeker team2", 221);
        membernameId.put("chaser1 team2", 231);
        membernameId.put("chaser2 team2", 232);
        membernameId.put("chaser3 team2", 233);
        membernameId.put("beater1 team2", 241);
        membernameId.put("beater2 team2", 242);
    }




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


    public boolean teamplay(boolean status) {

        if (status == true) {




        }


    }
}
