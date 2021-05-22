package onYourOwn;

import java.util.Random;


public class RollTheDieGame {
    public static void main(String[] args) {

        //initialize the random dice roll
        int maxNumOfRolls = 5;
        int maxNumOfSpaces = 20;


        //Create loop to iterate through the number o said items and accumulate running total of spaces
            for(int i = 0;  i < maxNumOfRolls; i++ ){
                int totalSpacesMoved = 0;
                for(int r = 0; r <maxNumOfSpaces; r++){
                    Random random = new Random();
                    int die = random.nextInt(6) + 1;
                    totalSpacesMoved = die + totalSpacesMoved;
                    System.out.println("Roll #" + (r+1) + " You've rolled a " + die + " . "  +
                            "You are now on space " + totalSpacesMoved  + "and have " + (maxNumOfSpaces - totalSpacesMoved) + "more to go");
                }

if(totalSpacesMoved < 20){
    System.out.println("Try your luck again");
}
else{ System.out.println("Congrats! You're a Winner!");

            }
    }
}
}
