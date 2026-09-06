
import java.util.Scanner;

public class BankingSystem {
    static void main() {
        //Declare variable

        Scanner sc = new Scanner(System.in);
        double am = 0;
        double balance = 0;
        boolean isRunning = true;
        int choice;

        //Display Menu
        while (isRunning) {
            System.out.println("*******************");
            System.out.println("SAINI BANK");
            System.out.println("1.Show Balance");
            System.out.println("2.Deposite");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            System.out.println("*******************");
            //Get and Process User Choice
            System.out.println("Enter your choice (1-4) : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> showbal(balance);
                case 2 -> balance = Deposit(sc, balance);
                case 3 -> balance = withdraw(sc, balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid Choice");
            }
        }
        System.out.println("thanks for visit!");
        sc.close();
    }

    private static double withdraw(Scanner sc, double balance) {
        System.out.println("WITHDRAW");
        System.out.println("Enter Amount!");
        double wd = sc.nextDouble();
        if (wd > balance || balance == 0) {
            System.out.println("Insufficent Balance!");
        } else {
            balance -= wd;
            System.out.println("WITHDRAW SUCCUSSFULLY!");
        }
        return balance;
    }

    static double Deposit(Scanner sc, double balance) {
        System.out.println("DEPOSITE");
        System.out.println("Enter Amount!");
        double am = sc.nextDouble();
        if (am > 0) {
            balance += am;
            System.out.println("DEPOSITED SUCCESSFULLY!");
        } else {
            System.out.println("Invalid amount.");
        }
        return balance;
    }

    private static void showbal(double balance) {
        System.out.println("BANK BALANCE");
        System.out.printf("$%.2f\n", balance);
    }
}