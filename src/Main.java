import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator!");
        //inputs
        System.out.println("How many people are in your group? ");
        int customers = scan.nextInt();
        System.out.println("What's the tip percentage? (0-100): ");
        int percent = scan.nextInt();

        System.out.println("Eneter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
        double cost = scan.nextDouble();
        if (cost != -1) {
            while (cost != -1) {
                System.out.println("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
                double cost = scan.nextDouble();
        } else {
            System.out.println("------------------------------");
            }
        }
        //outputs
        }
    }
