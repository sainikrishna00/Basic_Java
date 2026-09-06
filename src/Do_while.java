import java.util.Random;
import java.util.Scanner;
public class Do_while {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("number gussing game!");
        Random random = new Random();
        int guess;
        int attempt = 0;
        int min = 1;
        int max = 100;
        int randomNum = random.nextInt(min,max+1);
        System.out.printf("Guess a number between %d - %d" , min , max);
        do{
            System.out.println("enter a guess");
            guess = sc.nextInt();
            if(guess > max){
                System.out.printf("Guess a number between %d - %d" , min , max);
            }
            if(guess < randomNum){
                System.out.println("TOO LOW!");
            }else if (guess > randomNum){
                System.out.println("TOO HIGH!");
            }
            attempt++;
        }while(guess != randomNum);
        System.out.printf("nice! you won in your %dth attempts!", attempt);
        sc.close();
    }
}
