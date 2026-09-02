package Java.MONOPOLY;


import java.util.Random;

public class dice {
    public int dice1;
    public int dice2;
    public int sum;
    public boolean diceRolled = false;


    public void rollDice(){
        Random random = new Random();
        int dice1 = random.nextInt(6) + 1;
        int dice2 = random.nextInt(6) + 1;
        sum = dice1 + dice2;
    }

    public void printDice(){
        if(diceRolled){

            System.out.println("Dice rolled: " + sum);
        }
    }


}
