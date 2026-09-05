import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1;
        double num2;
        boolean validoperation = true;
        double result = 0.0;
        System.out.println("enter num1 : ");
        num1 = sc.nextDouble();
        System.out.println("enter num2 : ");
        num2 = sc.nextDouble();
        System.out.println("enter operator : ");
        System.out.println("1 : +\n2 : -\n3 : *\n4 : /\n5 : ^");
        int op = sc.nextInt();
        switch (op) {
            case (1) -> result = num1 + num2;
            case (2) -> result = num1 - num2;
            case (3) -> result = num1 * num2;
            case (4) -> {
                if (num2 == 0) {
                    System.out.println("cannot divide by zero!");
                } else {
                    result = num1 / num2;
                }
            }
            case (5) -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("invalid operator!");
                validoperation = false;
            }
        }
        if (validoperation) {
            System.out.println(result);
        }
        sc.close();
    }
}
