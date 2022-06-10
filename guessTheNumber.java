import java.util.Random;
import java.util.Scanner;

class Game {
    private int randomNumber ;
    private int userInput ;
    private int trial = 0;
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();

    public Game() {
        System.out.println("Initializing......");
    }

    public void startGame() {
        System.out.println("Game started....");
        randomNumber = getRandom();
        
        while(true) {
            userInput = getInput();
            trial++;

            if (randomNumber == userInput) {
                System.out.println("You won in " + trial + " trials");
                break;
            } else if (randomNumber < userInput) {
                System.out.println("The original number is samller then " + userInput);
                System.out.println("You need to guess a smaller number.");
            } else if (randomNumber > userInput) {
                System.out.println("The original number is greater then " + userInput);
                System.out.println("You need to guess a greater number.");
            }


            System.out.println();
        }
    }
    
    private int getRandom() {
        int randomNumber = random.nextInt(100);
        return randomNumber;
    }
    private int getInput() {
        System.out.print("Your Guess : ");
        int input = scanner.nextInt();
        return input;
    }
}

class guessTheNumber {
    public static void main(String[] args) {
        Game game = new Game();
        game.startGame();
        
    }
}
