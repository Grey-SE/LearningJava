import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Number Guessing Game

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //Declare variables

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1);

        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d-%d: \n", min, max);

        do{
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("Too low, try again");
            }
            else if (guess > randomNumber) {
                System.out.println("Too high, try again");
            }
            else {
                System.out.println("Correct! The number was "+ randomNumber + " by doing a total number of attempts of " + attempts);

            }
        } while (guess != randomNumber);

        scanner.close();


    }
}
