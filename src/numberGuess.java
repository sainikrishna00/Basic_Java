import java.util.Random;
import java.util.Scanner;

public class numberGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int bestScore = Integer.MAX_VALUE;
        boolean playAgain;
        System.out.println("=== WELCOME TO THE ULTIMATE NUMBER GUESSING GAME! ===");
        do {
            System.out.println("\n Select your difficulty : ");
            System.out.println("1. Easy (1-50, Unlimited tries)");
            System.out.println("2. Medium (1-100, 10 tries)");
            System.out.println("3. Hard (1-100, 6 tries)");
            System.out.print("Enter choice (1-3): ");
            int choice = sc.hasNextInt() ? sc.nextInt() : 2;
            int min = 1;
            int max = (choice == 1) ? 50 : 100;
            int maxAttemps = (choice == 1) ? Integer.MAX_VALUE : (choice == 2) ? 10 : 6;
            int randomNum = random.nextInt(min, max + 1);
            int attempt = 0;
            int guess= 0;
            boolean won = false;
            int currentMin = min;
            int currentMax = max;
            System.out.printf("\nI'm thinking of a number between %d and %d.", min, max);
            if(maxAttemps != Integer.MAX_VALUE){
                System.out.printf("you have %d attempts to guess it!\n" , maxAttemps);
            }else{
                System.out.println("Take as many tries as you need!\n");
            }
            // main game loop
            do{
                System.out.printf("[attempt %d%s] Current Range (%d - %d) -> Enter guess :" ,(attempt + 1),(maxAttemps == Integer.MAX_VALUE ? "∞" : String.valueOf(maxAttemps)),currentMin, currentMax);
                while(!sc.hasNextInt()){
                    System.out.println("❌ Invalid input! Please enter a valid number.");
                    System.out.print("enter guess :  ");
                    sc.next();
                }
                guess = sc.nextInt();
                attempt++;
                if(guess < min || guess > max){
                    System.out.println("⚠ Out of bounds! Keep it between %d and %d.\\n\", min, max");
                }else if(guess == randomNum){
                    won = true;
                }else if(guess< randomNum){
                    System.out.println("📉 TOO LOW!");
                }else{
                    System.out.println("📈 TOO HIGH!");
                    if(guess <= currentMax) currentMax = guess-1;
                }
            } while(!won && attempt < maxAttemps);
            if (won) {
                System.out.printf("\n🎉 CONGRATULATIONS! You won in %d attempts!\n", attempt);
                if (attempt < bestScore) {
                    bestScore = attempt;
                    System.out.printf("🏆 NEW HIGH SCORE! Best run: %d attempts\n", bestScore);
                } else {
                    System.out.printf("⭐ Current Best Score: %d attempts\n", bestScore);
                }
            } else {
                System.out.printf("\n💥 GAME OVER! You ran out of attempts. The number was: %d\n", randomNum);
            }
            System.out.println("\nWould you like to play another round? (yes/no): ");
            String response = sc.next().trim().toLowerCase();
            playAgain = response.startsWith("y");
        } while (playAgain);
        System.out.println("\nThanks for playing! Final Best Score: " +
                (bestScore == Integer.MAX_VALUE ? "N/A" : bestScore + " attempts"));
        sc.close();
    }
}
