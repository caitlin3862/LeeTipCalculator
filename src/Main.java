import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator!");
        // inputs
        System.out.print("How many people are in your group? ");
        int customers = scan.nextInt();
        System.out.print("What's the tip percentage? (0-100): ");
        int percent = scan.nextInt();
        System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
        double cost = scan.nextDouble();
        System.out.print("Enter the item: ");
        String item = scan.nextLine();
        System.out.println();
        double totalCost1 = cost;
        while (cost != -1) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            cost = scan.nextDouble();
            System.out.print("Enter the item: ");
            item = scan.nextLine();
            System.out.println();
            if (cost != -1) {
                totalCost1 = totalCost1 + cost;
            } else {
                totalCost1 = totalCost1;
            }
            }

        // outputs
        System.out.println("------------------------------");
        System.out.println("Total bill before tip: $" + totalCost1);
        System.out.println("Total percentage: " + percent + "%");

        double tip = totalCost1*((double)percent / 100);
        double tip2 = Math.round(tip * 100.0) / 100.0;
        System.out.println("Total tip: $" + tip2);

        double finalTip = totalCost1 + tip;
        double finalTip2 = Math.round(finalTip * 100.0) / 100.0;
        System.out.println("Total bill with tip: $" + finalTip2);

        double personNoTip = totalCost1 / customers;
        double personNoTip2 = Math.round(personNoTip * 100.0) / 100.0;
        System.out.println("Per person cost before tip: $" + personNoTip2);

        double personTip = tip / customers;
        double personTip2 = Math.round(personTip * 100.0) / 100.0;
        System.out.println("Tip per person: $" + personTip2);

        double costPerPerson = personTip + personNoTip;
        double costPerPerson2 = Math.round(costPerPerson * 100.0) / 100.0;
        System.out.println("Total cost per person: $"+ costPerPerson2);



            }
        }



