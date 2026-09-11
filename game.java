package Java.MONOPOLY;

import java.util.List;
import java.util.*;


public class game{
    private Settings settings;
    private Board board;
    private player players;
    private dice dice;
    private BoardPanel bPanel;
    
    public boolean startGame = false;
    public boolean turnOver = false;
    public boolean startTurn = false;
    public boolean endTurn = false;

    public List<player> numOfPlayers = new ArrayList();

    public game(){
    
    
    
    }

    public void addPlayers(player newPlayer){
        numOfPlayers.add(newPlayer);
    }

    public void turnSystem(){
        if(startGame){
            for(int i = 0; i<numOfPlayers.size();){
                switch(i){
                    case 0:
                        startTurn=true;
                        if(endTurn){
                            i++;
                        }
                        break;
                    case 1:
                        startTurn=true;
                        if(endTurn){
                            i++;
                        }
                        break;
                    case 2:
                        startTurn=true;
                        if(endTurn){
                            i++;
                        }
                        break;
                    case 3:
                        startTurn=true;
                        if(endTurn){
                            i++;
                        }
                        break;
                }
            }
        }
    }
}    


