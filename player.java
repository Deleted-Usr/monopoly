package Java.MONOPOLY;

import java.util.List;
import java.util.ArrayList;

public class player
{

    private int money = 0;
    private String playerName;
    private int position;
    private final List<property> properties = new ArrayList<>();

    public player(int money, int position)
    {
        this.playerName = playerName;
        this.money = money;
        this.position = position;
    }

    public int getPlayerPosition(){
        return position;
    }

    public int getMoney(){
        return money;
    }

    public void setName(){
        this.playerName = playerName;
    }
    
    


}