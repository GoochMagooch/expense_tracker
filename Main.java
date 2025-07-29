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
                try {
                    int menuChoice = Integer.parseInt(choice);
                    switch (menuChoice) {
                    case 1:
                        loop = false;
                        System.out.println("Test complete. Goodbye!");
                        break;
                    case 2:
                        displayMenu();
                        break;
                    default:
                        loop = false;
                        System.out.println("Error: Enter valid number!");
                    }
                } catch (InputMismatchException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
