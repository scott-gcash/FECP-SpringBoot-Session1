// Core/Zoo.java
package org.example.modules;

import java.util.Objects;
import java.util.Scanner;

/**
 * The main class for the Zoo Administration Module.
 * This class handles the setup, opening, closing, and staff management of the zoo.
 * It provides a text-based interface for the Zoo Authorize Person.
 */
public class AdminModule {

    private static boolean isZooOpen = false; // Tracks if the zoo is currently open
    private static final Scanner scanner = new Scanner(System.in); // Scanner for user input
    private static final String adminUsername = "admin";
    private static final String adminPassword = "adminadmin";

    public static void start() {
        String username;
        String password;
        boolean loggedIn = false;

        while (!loggedIn) {
            System.out.println("\n--- Administrator Login ---");
            System.out.print("Enter username: ");
            username = scanner.nextLine();
            System.out.print("Enter password: ");
            password = scanner.nextLine();

            if (Objects.equals(username, adminUsername) && Objects.equals(password, adminPassword)) {
                System.out.println("Login Successful. Welcome!");
                loggedIn = true;
                displayAdminMenu();
            } else {
                System.out.println("Invalid Credentials. Please try again.");
            }
        }
    }

    /**
     * Displays the main administration menu and handles user input.
     */
    private static void displayAdminMenu() {
        int choice;
        do {
            System.out.println("\n--- Administrator Main Menu ---");
            System.out.println("1. Setup Zoo (Staff & Settings)");
            System.out.println("2. Handler (Manage Staff)");
            System.out.println("3. Open Zoo");
            System.out.println("4. Close Zoo");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(scanner.nextLine()); // Read user choice

                switch (choice) {
                    case 1:
                        setupZoo();
                        break;
                    case 2:
                        handleStaff();
                        break;
                    case 3:
                        openZoo();
                        break;
                    case 4:
                        closeZoo();
                        break;
                    case 5:
                        System.out.println("Exiting Zoo Administration Module. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                choice = 0; // Set to 0 to re-display menu
            }
        } while (choice != 5);
    }

    /**
     * Placeholder method for setting up zoo staff and general settings.
     * In a real application, this would involve more detailed configuration.
     */
    private static void setupZoo() {
        System.out.println("Currently, this is a placeholder.");
        System.out.println("(Press Enter to return to main menu)");
        scanner.nextLine(); // Wait for user to press Enter
    }

    /**
     * Placeholder method for managing zoo staff (Handler module).
     * This could involve assigning tasks, viewing schedules, etc.
     */
    private static void handleStaff() {
        System.out.println("Currently, this is a placeholder.");
        System.out.println("(Press Enter to return to main menu)");
        scanner.nextLine();
    }

    /**
     * Opens the zoo for visitors.
     * This method changes the zoo's operational status.
     */
    private static void openZoo() {
        if (!isZooOpen) {
            isZooOpen = true;
            System.out.println("\n--- Zoo Status: OPEN ---");
            System.out.println("The zoo is now open for visitors. Welcome!");
        } else {
            System.out.println("\n--- Zoo Status: Already Open ---");
            System.out.println("The zoo is already open.");
        }
        System.out.println("(Press Enter to return to main menu)");
        scanner.nextLine(); 
    }

    /**
     * Closes the zoo to visitors.
     * This method changes the zoo's operational status.
     */
    private static void closeZoo() {
        if (isZooOpen) {
            isZooOpen = false;
            System.out.println("\n--- Zoo Status: CLOSED ---");
            System.out.println("The zoo is now closed. Thank you for visiting!");
        } else {
            System.out.println("\n--- Zoo Status: Already Closed ---");
            System.out.println("The zoo is already closed.");
        }
        System.out.println("(Press Enter to return to main menu)");
        scanner.nextLine(); // Wait for user to press Enter
    }
}
