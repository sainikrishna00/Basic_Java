import java.util.Random;
import java.util.Scanner;
public class Do_while {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("number gussing game!");
        Random random = new Random();
        int guess;
        int attempt = 0;
        int randomNum = random.nextInt(1,11);
        System.out.println("Guess a number between 1 - 10");
        do{
            System.out.println("enter a guess");
            guess = sc.nextInt();
            if(guess > 10){
                System.out.println("Guess a number between 1 - 10");
            }
            attempt++;
        }while(guess != randomNum);
        System.out.printf("nice! you won in your %dth attempts!", attempt);
        sc.close();
    }
}
