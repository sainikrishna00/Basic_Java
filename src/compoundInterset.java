import java.util.Scanner;

public class compoundInterset {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double principal;
        double rate;
        int timeCompound;
        int year;
        double amount;
        System.out.println("Enter the principal amount: ");
        principal = sc.nextDouble();
        System.out.println("Enter the interet rate (in %) : ");
        rate = sc.nextDouble() / 100;
        System.out.print("Enter the # of times compound per year: ");
        timeCompound = sc.nextInt();
        System.out.print("Enter the # of year : ");
        year = sc.nextInt();
        amount = principal * Math.pow(1 + rate / timeCompound , timeCompound * year);
        System.out.println("The amount after "+ year + " is : $" +amount);
        sc.close();
    }
}
