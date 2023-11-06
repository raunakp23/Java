import java.util.Scanner;
public class atm {
    private static Scanner scanner = new Scanner(System.in);
    private static double balance = 0;
    public static void main(String[] args) {
        while (true) {
            System.out.println("Please choose an option:");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Quit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Your balance is: $" + balance);
                    break;
                case 2:
                    System.out.println("How much money would you like to deposit?");
                    double amount = scanner.nextDouble();
                    balance += amount;
                    System.out.println("Your new balance is: $" + balance);
                    break;
                case 3:
                    System.out.println("How much money would you like to withdraw?");
                    amount = scanner.nextDouble();
                    if (amount > balance) {
                        System.out.println("Insufficient funds.");
                    } else {
                        balance -= amount;
                        System.out.println("Your new balance is: $" + balance);
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using our ATM.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}