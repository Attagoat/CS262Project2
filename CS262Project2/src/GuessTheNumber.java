import java.util.Random;
public class GuessTheNumber extends Duoplay {
    Random rand = new Random();
    private int winNumber;
    private int player1Attempts;
    private int player2Attempts;

    /**
     * Constructor for guess the number
     */
    GuessTheNumber() {
        super();
    }

    /**
     * Constructor with parameters for guess the number
     * @param player1 - player 1 of the game
     * @param player2 - player 2 of the game
     */
    GuessTheNumber(GuessTheNumberPlayer player1, GuessTheNumberPlayer player2) {
        super(player1, player2);
        this.winNumber = rand.nextInt(0, 101);


    }


    /**
     * Checks the guess to see if it's right, prints if it needs to be higher or lower
     * @param guess - number to gues
     * @return if it is correct
     */
    public boolean checkGuess(int guess){
        boolean isRight;
        if(guess == winNumber){
            isRight = true;
        }
        else{
            if(guess < winNumber){
                System.out.println("Guess Higher!");
            } else {
                System.out.println("Guess Lower!");
            }
            isRight = false;
        }

        return isRight;
    }

    /**
     * ToString method so when printing the game it doesn't mess up and show memory addresses
     * Also a nice way to print out the game
     * @return the game being played
     */
    @Override
    public String toString(){
        return "Guess a number between 0-100!";
}

}