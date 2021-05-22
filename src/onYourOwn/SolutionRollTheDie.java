package onYourOwn;

import java.util.Random;

public class SolutionRollTheDie {
    public static void main(String[] args){
        int maxNumOfSpaces = 20;
        int currentSpace = 0;
        int maxNumOfRolls = 5;
        Random random = new Random();

        System.out.println("Welcome to Roll the Die! Let's begin...");

        for(int i=1; i<=maxNumOfRolls; i++){
            int die = random.nextInt(6) + 1;
            currentSpace = currentSpace +die;

            System.out.printf("Roll #%d: You've rolled a %d. %n", i, die);

            if(currentSpace == maxNumOfSpaces) {
                System.out.println("You're on space " + currentSpace + ". Congrats, you win");
                break;
            }
           else if (currentSpace > maxNumOfSpaces){
                System.out.print("Unfortunately, that takes you past  " + maxNumOfSpaces + " spaces." +
                        " You lose!");
                break;
                }
            else if (i == maxNumOfRolls && currentSpace < maxNumOfSpaces ){
                System.out.println("You're on space " + currentSpace + ".");
                System.out.println("Unfortunately, you didn't make it to all " + maxNumOfSpaces +
                        " spaces. You lose!");
                }
            else{
                int spacesToGO = maxNumOfSpaces - currentSpace;
                System.out.println("You are now on space " +currentSpace +
                        " an have " + spacesToGO + " more to go.");
                }
System.out.println();

        }
    }
}

