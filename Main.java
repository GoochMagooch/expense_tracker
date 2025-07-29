import java.io.IOException;
import java.util.Scanner;

public class Main {

    // Method 1: Clear Terminal
    public static void clearTerm() {
        try {
            ProcessBuilder cls = new ProcessBuilder("clear");
            cls.inheritIO().start().waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Method 2: Display Expense Tracker Console Menu
    public static void displayMenu() {
        clearTerm();
        System.out.println("Welcome To The Simple Expense Tracker!\n");
        System.out.println("1. Manage Expenses");
        System.out.println("2. View Expenses");
        System.out.println("3. Calculate Total Expenses");
        System.out.println("\"Menu\" to display menu");
        System.out.println("\"Exit\" to exit\n");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean loop = true;

        // Main Console Menu Loop
        while (loop == true) {
            displayMenu();
            System.out.print("Choose: ");
            String choice = input.nextLine();
            switch (choice.toLowerCase()) {
                case "exit":
                    loop = false;
                    System.out.println("Exiting Expense Tracker. Goodbye!");
                    break;
                case "menu":
                    displayMenu();
                    break;
                default:
                    System.out.println("Loop successfully broken!");
                    break;
            }
        }
    }
}
