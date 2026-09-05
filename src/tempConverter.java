import java.util.Scanner;

public class tempConverter {
    static void main() {
        double temp;
        double newTemp;
        String unit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature : ");
        temp = sc.nextDouble();
        System.out.println("convert to celcius or Fahrenheit ? (C or F):");
        unit = sc.next().toUpperCase();
        newTemp = (unit.equals("C")) ? (temp - 32) * 5/9 : (temp * 9 / 5) + 32;
        System.out.printf("%.2f°%s", newTemp,unit);
        sc.close();
    }
}