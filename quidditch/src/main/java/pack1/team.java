package pack1;

import com.sun.xml.internal.ws.client.ClientSchemaValidationTube;
import pack2.*;

import javax.print.attribute.HashPrintServiceAttributeSet;
import java.util.HashMap;
import java.util.List;

public class team {

    private int goal_team1 =0;
    private int getGoal_team2 =0;

    HashMap<String,Integer> membernameId = new HashMap<>();
    {
        membernameId.put("kteam1" , 111);
        membernameId.put("steam1" , 121);
        membernameId.put("c1team1", 131);
        membernameId.put("c2team1", 132);
        membernameId.put("c3team1", 133);
        membernameId.put("b1team1", 141);
        membernameId.put("b2team1", 142);

        membernameId.put("kteam2" , 211);
        membernameId.put("steam2" , 221);
        membernameId.put("c1team2", 231);
        membernameId.put("c2team2", 232);
        membernameId.put("c3team2", 233);
        membernameId.put("b1team2", 241);
        membernameId.put("b2team2", 242);
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

}
