 
import java.util.Random;

public class dice {
    public int dice1;
    public int dice2;
    public boolean diceRolled = false;


    public dice(){
        rollDice();
        printDice();
        


    }

    public int rollDice(){
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    public void printDice(){
        if(diceRolled){
            System.out.println("Dice rolled: " + dice1 + " and " + dice2);
        }
    }


}
