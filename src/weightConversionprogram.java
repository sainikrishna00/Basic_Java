import java.util.Scanner;

public class weightConversionprogram {
    public static void main(){
        //WEIGHT CONVERSION PROGRAM
        //Declare variables
        //welcome message
        //prompt for user choice
        //option 1 convert lbs to kgs
        //option 2 kgs to lbs
        //else not a valid choice
        double kilogram;
        double lbs;
        System.out.println("WELCOME!");
        System.out.println("press 1 : kgs to lbs");
        System.out.println("press 2 : lbs to kgs");
        Scanner sc = new Scanner(System.in);
        double press = sc.nextDouble();
        if(press == 1){
            System.out.println("Please enter your weight in kgs");
            kilogram = sc.nextDouble();
            //cal weight
            double cal = kilogram * 2.20462;
            System.out.printf("your weight is %.2f lbs" , cal);
        } else if (press == 2) {
            System.out.println("Please enter your weight in lbs");
            lbs = sc.nextDouble();
            //cal weight
            double calc = lbs * 0.45359237;
            System.out.printf("your weight is %.2f kilogram" , calc);
        }else{
            System.out.println("invalid input");
        }
    }
}
