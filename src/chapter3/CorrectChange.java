package chapter3;

import java.util.Scanner;

public class CorrectChange {
    public static void main(String[] args) {

        double penny = .01;
        double nickel = .05;
        double dime = .10;
        double quarter = .25;
        int dollar = 1;

        //find the unknown

        System.out.println("Enter the number of pennies you have");
        Scanner scanner = new Scanner(System.in);
        int num_of_penny = scanner.nextInt();

        System.out.println("Enter the number of nickels you have");
        int num_of_nickel = scanner.nextInt();

        System.out.println("Enter the number of dimes you have");
        int num_of_dime = scanner.nextInt();

        System.out.println("Enter the number of quarters you have");
        int num_of_quarter = scanner.nextInt();
        scanner.close();

        //sum of all the values

        double your_total = (num_of_penny * penny) + (num_of_nickel * nickel) +
                (num_of_dime * dime) + (num_of_quarter * quarter);

        //display results

        if(your_total == dollar){
            System.out.println("You Win!");
        }
        else if (your_total > dollar){
            double total_over = your_total - dollar;
            System.out.println("Sorry, you lose! You are over by $" + String.format("%.2f", total_over));
        }
        else {
            double total_short = dollar - your_total;
            System.out.println("Sorry, you lose! You are short $" + String.format("%.2f", total_short));

        }

    }

}
