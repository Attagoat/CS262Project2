import java.util.Scanner;
public class LightsOutPlayer extends DuoplayPlayer{
    LightsOutPlayer(String playerName){
        super(playerName);
    }

    @Override
    public GameState move(Duoplay game) {
        Scanner scanriel = new Scanner(System.in);
        LightsOut lightsOutgame = (LightsOut) game;
        GameState currentState;

        System.out.print("Enter the Row:");
        int row = scanriel.nextInt();
        System.out.println();
        System.out.print("Enter the Column: ");
        int col = scanriel.nextInt();

        lightsOutgame.press(row, col);


        if(lightsOutgame.isDark()){
            currentState = GameState.WON;
        } else {
           currentState = GameState.IN_PROGRESS;
        }

        return currentState;
    }
}
