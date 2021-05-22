package onYourOwn;

import java.util.Scanner;

public class PhoneBillCalculator {

    Double overageCost = .25;
    Double tax = .15;
    Double totalOverageCost;
    Double planFee;
    Double taxTotal;
    public PhoneBillCalculator(){
          }
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        PhoneBillCalculator billCalculator = new PhoneBillCalculator();

        billCalculator.calculateOverage();
        billCalculator.calculateTax();
        billCalculator.calculateTotal();
    }

    void calculateOverage(){
        System.out.println("What is your base plan cost? ");
        double planFee =  scanner.nextDouble();
        this.planFee = planFee;
        System.out.println("How many minutes are you over?");
        int minutesOver = scanner.nextInt();
        double totalOverageCost = minutesOver * overageCost;
        this.totalOverageCost = totalOverageCost;

        scanner.close();
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + String.format("%.2f", planFee)) ;
        System.out.println("Overage: $" +String.format("%.2f",totalOverageCost ));

    }
    void calculateTax() {
        Double taxTotal = (totalOverageCost + planFee) * tax;
        this.taxTotal = taxTotal;
        System.out.println("Tax: $" + String.format("%.2f", taxTotal));
    }

    void calculateTotal() {
        double total = planFee + totalOverageCost + taxTotal;
        System.out.println("Total: $" + String.format("%.2f",total));
    }
}
