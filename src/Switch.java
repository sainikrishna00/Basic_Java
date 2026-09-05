import java.util.Scanner;

public class Switch {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double num1;
        double num2;
        System.out.println("enter num1 : ");
        num1 = sc.nextDouble();
        System.out.println("enter num2 : ");
        num2 = sc.nextDouble();
        System.out.println("enter operator : ");
        System.out.println("1 : +\n2 : -\n3 : *\n4 : /");
        int op = sc.nextInt();
        switch (op) {
            case (1) -> System.out.println(num1 + num2);
            case (2) -> System.out.println(num1 - num2);
            case (3) -> System.out.println(num1 * num2);
            case (4) -> {
                if (num2 == 0) {
                    System.out.println("cannot divide by zero!");
                } else {
                    System.out.println(num1 / num2);
                }
            }
            default -> System.out.println("invalid input");
        }
        sc.close();
    }
}
