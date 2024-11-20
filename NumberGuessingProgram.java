import java.util.Random;
import java.util.Scanner;

public class NumberGuessingProgram {

    public static void main(String[] args) {
        
        Random rand = new Random();
        try (Scanner sc = new Scanner(System.in)) {
            int randomNumber = rand.nextInt(100) + 1;
            
            while (true) {
                System.out.println("Enter your guess (1 - 100): ");
                
                int playerGuess = sc.nextInt();
                
                if (playerGuess == randomNumber) {
                    System.out.println("Correct!");
                    break;
                }
                else if (randomNumber > playerGuess) {
                    System.out.println("Nope! Number is higher. Guess again!");
                }
                else {
                    System.out.println("Nope! Number is lower! Guess again!");
                }
            }
        }
        
    }

}