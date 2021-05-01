package chapter2;

import java.util.Scanner;

public class FavoriteSeason {
    public static void main(String arg[]){

        //Select an adjective
        System.out.println("Enter an adjective:");
        Scanner scanner = new Scanner(System.in);
        String adj = scanner.next();

        //Select a season
        System.out.println("Enter a Season:");
        String season = scanner.next();

        //How many cups of coffee
        System.out.println("How many cups of coffee can you drink");
        int cupsOfCoffee = scanner.nextInt();

        //What did the user tell you
        System.out.println("On a(n) " + adj +" "+ season + " day, I drink a minimum of " +
                cupsOfCoffee + " cups of coffee.");

    }

}
