import java.util.Random;
import java.util.Scanner;
public class numberguessing {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        Random random=new Random();
        int min=1;
        int max=100;
        int number_of_attempts=5;
        int score=0;
        int guess;
        System.out.println("Welcome to the Number Guessing Game");
        do{
            int random_num=random.nextInt(max-min+1)+min;
            int round_attempts=0;
            System.out.println("Guess the number between 1 to 100");
            while(true)
            {
                System.out.print("Enter your guess : ");
                guess = ip.nextInt();
                round_attempts++;
                if (guess == random_num) {
                    System.out.println("Congratulations! You guessed the correct number in " + round_attempts + " attempts.");
                    score += number_of_attempts - round_attempts + 1;
                    break;
                } else if (guess < random_num) {
                    System.out.println("Your guess is too low! Try again.");
                } else {
                    System.out.println("Your guess is too high! Try again.");
                }
                if (round_attempts == number_of_attempts) {
                    System.out.println("Sorry, the chances are over. The correct number was: " + random_num);
                    break;
                }
            }
            System.out.print("Would you like to play again(yes/no): ");
            String option = ip.next().toLowerCase();
            if (option.equals("no")) {
                break;
            }
        } while (true);
        System.out.println("Thank you for playing. Your total score is: " + score);
        ip.close();
    }
}
