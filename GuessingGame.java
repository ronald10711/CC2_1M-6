import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

    public static void main(String[] args) {

        Random randomNumber = new Random();
        Scanner sc = new Scanner(System.in);
        int numberGuess = randomNumber.nextInt(100);
	System.out.println(numberGuess);
	System.out.println("You have 5 Tries");
        System.out.println("Guess a number (1-100): ");
        int Tries = 0;

        int guess;
        boolean win = false;

        while (win == false) {

            Tries++;
	    System.out.print("Your "+Tries+ " try:");
            guess = sc.nextInt();


            if (guess == numberGuess) {
                System.out.println("You Win");
                System.out.println(Tries + " Tries before you guess the number");

                win = true;
            } else if (guess < numberGuess) {
                System.out.println("Guess :" + Tries);
                System.out.println("Higher!");

            } else if (guess > numberGuess) {
                System.out.println("Lower!");
            }
            if (guess != numberGuess && Tries == 5) {
                System.out.println("You lose. The number was : " +numberGuess);
		System.out.println("You run out of tries.");
                System.out.println("Sad.");
                break;
            }
        }

    }
}