import java.util.Scanner;
import java.util.Random;

class NumberGame{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Number Guessing Game ");

        int score = 0;
        boolean playAgain = true;

        while(playAgain){
            int targetValue = random.nextInt(100)+1;
            int attempts = 0;
            int maxAttemts = 5;
            
            System.out.println("I have selected a number . Can you guess it ? ");

            while(attempts < maxAttemts){
                System.out.println("Enter your guessed number ");
                int userGuess = sc.nextInt();
                sc.nextLine();
                attempts++;

                if(userGuess == targetValue){
                    System.out.println("Congratulations! You Guessed the number " +targetValue+ " in " +attempts+ " attempts ");
                    score++;
                    break;
                }
                else if(userGuess < targetValue){
                    System.out.println("Too low! . Try again");
                }
                else if(userGuess > targetValue){
                    System.out.println("Too high! . Try again");
                }

            }

            if(attempts >= maxAttemts){
                System.out.println("Sorry! you run out of attempts. Your correct number was : " +targetValue);
            }
            System.out.println("Do you want to play again? (yes/no)");
            String playAgainInput = sc.next();
            playAgain = playAgainInput.equalsIgnoreCase("yes");

            System.out.println("Game Over! Your score : "+score);
        }
    }
}