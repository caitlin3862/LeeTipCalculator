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
        double totalCost1 = cost;
        while (cost != -1) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            cost = scan.nextDouble();
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

        System.out.println("Total tip: $" + tip);

            }
        }



