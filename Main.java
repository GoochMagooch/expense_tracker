import java.io.IOException;
import java.util.InputMismatchException;
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

        displayMenu();
        // Main Console Menu Loop
        while (loop == true) {

            System.out.print("Choose: ");
            String choice = input.nextLine();

            switch (choice.toLowerCase()) {
            case "exit":
                loop = false;
                displayMenu();
                System.out.println("Exiting Expense Tracker. Goodbye!");
                break;
            case "menu":
                displayMenu();
                break;
            default:
                try {
                    switch (Integer.parseInt(choice)) {
                        case 1:
                            // Manage Expenses Console
                            loop = false;
                            displayMenu();
                            System.out.println("Test complete. Goodbye!");
                            break;
                        case 2:
                            // View Expenses
                            displayMenu();
                            break;
                        case 3:
                            // Calculate Expenses
                            break;
                        default:
                            loop = false;
                            displayMenu();
                            System.out.println("Error: Enter valid number!");
                            break;
                        }
                } catch (NumberFormatException e) {
                    displayMenu();
                    System.out.println("Error: test complete");
                }
            }
        }
    }
}
