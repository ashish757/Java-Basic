import java.util.Random;
import java.util.Scanner;

public class rockPaperScissor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        String ROCK = "r";
        String PAPER = "p";
        String SCISSOR = "s";
        int bot = 0;
        int user = 0;

        String[] gameElements = {ROCK, PAPER, SCISSOR};
        

        for (int i = 0; i < 6; i++) {
            

            String userChoice = input.next();
            
            String BotChoice = gameElements[random.nextInt(3)];
            System.out.println(BotChoice);

            // System.out.println(userChoice);
            System.out.println();

            if (BotChoice.equals(userChoice)) {
                System.out.println("Tie");
            } 
            else if (BotChoice.equals(ROCK)) {
                if (userChoice.equals(PAPER)) {
                    System.out.println("You Won!!");
                    user++;
                    continue;
                }
                else if (userChoice.equals(SCISSOR)) {
                    System.out.println("You Lost!!");
                    bot++;
                    continue;
                }

            } 
            else if (BotChoice.equals(PAPER)) {
                if (userChoice.equals(SCISSOR)) {
                    System.out.println("You Won!!");
                    user++;
                    continue;
                }
                else if (userChoice.equals(ROCK)) {
                    System.out.println("You Lost!!");
                    bot++;
                    continue;
                }
            }
            else {
                // botchoice.equals(scissor
                if (userChoice.equals(ROCK)) {
                    System.out.println("You Won!!");
                    user++;
                    continue;
                }
                else if (userChoice.equals(PAPER)) {
                    System.out.println("You Lost!!");
                    bot++;
                    continue;
                }

            }
            
        }

        System.out.println("You : " + user);
        System.out.println("Bot : " + bot);

        input.close();
    }
}
