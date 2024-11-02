import java.util.Scanner;
public class GuessTheNumberPlayer extends DuoplayPlayer{
    private int attempts;

    GuessTheNumberPlayer(String playerName){
        this.playerName = playerName;
    }

    @Override
    public GameState move(Duoplay game) {
        GuessTheNumber guessTheNumberGame = (GuessTheNumber) game;
        Scanner scanriel = new Scanner(System.in);
        GameState currentState;

        System.out.print("Guess: ");
        int playerGuess = scanriel.nextInt();

        if(guessTheNumberGame.checkGuess(playerGuess)){
            currentState = GameState.WON;
        } else{
            currentState = GameState.IN_PROGRESS;
            attempts--;
        }

        return currentState;
    }
}
