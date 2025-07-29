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
        System.out.println("Welcome To The Simple Expense Tracker!\n");
        System.out.println("1. Manage Expenses");
        System.out.println("2. View Expenses");
        System.out.println("3. Calculate Total Expenses");
        System.out.println("\"Menu\" to display menu");
        System.out.println("\"Exit\" to exit\n");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Main Expense Tracker Console Menu Functionality
        while (true) {
            displayMenu();
            System.out.print("Choose: ");
            String choice = input.nextLine();
            if (choice.equals("exit")) {
                break;
            } else if (choice.equals("repeat")) {
                clearTerm();
            }
        }
    }
}
