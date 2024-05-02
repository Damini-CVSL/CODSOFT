import java.util.Scanner;

public class ATMInterface {

    private static double balance = 1000.0; // Initial balance

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();
            int choice = getUserChoice(scanner);

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit(scanner);
                    break;
                case 3:
                    withdraw(scanner);
                    break;
                case 4:
                    exitProgram();
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid option (1/2/3/4).");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("Welcome to Banking App");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("Select an option (1/2/3/4): ");
    }

    private static int getUserChoice(Scanner scanner) {
        return scanner.nextInt();
    }

    private static void checkBalance() {
        System.out.println("Your balance is: $" + balance);
    }

    private static void deposit(Scanner scanner) {
        System.out.print("Enter the deposit amount: $");
        double depositAmount = scanner.nextDouble();
        if (isValidAmount(depositAmount)) {
            balance += depositAmount;
            System.out.println("Deposited $" + depositAmount + " successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    private static void withdraw(Scanner scanner) {
        System.out.print("Enter the withdrawal amount: $");
        double withdrawalAmount = scanner.nextDouble();
        if (isValidWithdrawal(withdrawalAmount)) {
            balance -= withdrawalAmount;
            System.out.println("Withdrawn $" + withdrawalAmount + " successfully.");
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    private static boolean isValidAmount(double amount) {
        return amount > 0;
    }

    private static boolean isValidWithdrawal(double withdrawalAmount) {
        return withdrawalAmount > 0 && withdrawalAmount <= balance;
    }

    private static void exitProgram() {
        System.out.println("Thank you for using Banking App. Goodbye!");
        System.exit(0);
        
    }   
}