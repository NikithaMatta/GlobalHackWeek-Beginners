import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};

        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Enter your choice (Rock, Paper, Scissors). Type 'Exit' to quit.");

        while (true) {
            System.out.print("Your choice: ");
            String userChoice = scanner.nextLine().trim();

            if (userChoice.equalsIgnoreCase("Exit")) {
                System.out.println("Thanks for playing! Goodbye!");
                break;
            }

            int computerIndex = random.nextInt(3); // 0, 1, or 2
            String computerChoice = choices[computerIndex];

            if (!userChoice.equalsIgnoreCase("Rock") && 
                !userChoice.equalsIgnoreCase("Paper") && 
                !userChoice.equalsIgnoreCase("Scissors")) {
                System.out.println("Invalid choice. Please choose Rock, Paper, or Scissors.");
                continue;
            }

            System.out.println("Computer chose: " + computerChoice);

            if (userChoice.equalsIgnoreCase(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((userChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors")) ||
                       (userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock")) ||
                       (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        }

        scanner.close();
    }
}
