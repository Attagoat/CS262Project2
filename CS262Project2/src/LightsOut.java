import java.util.Random;
public class LightsOut extends Duoplay{
    private int[][] boardArray;

    LightsOut(){
        super();
    }

    /**
     * Construcotr that takes two game players
     * @param player1 - Player 1 of the game
     * @param player2 - Player 2 of the game
     */
    LightsOut(LightsOutPlayer player1, LightsOutPlayer player2){
        super(player1, player2);
        this.boardArray = new int[10][10];

    }

    /**
     * Gives the intial Constructors for a player of the game
     * @param player1 - player 1 of the game
     * @param player2 - player 2 of the game
     * @param boardArraySize - the size of the board to be adjusted
     */
    LightsOut(DuoplayPlayer player1, DuoplayPlayer player2, int boardArraySize) {
        super(player1, player2);
        this.boardArray = new int[boardArraySize][boardArraySize];

    }

    /**
     * Randomizes the board of a game
     */
    public void randomize(){
        Random rand = new Random();
        for (int r = 0; r < boardArray.length; r++) {
            for (int c = 0; c < boardArray[r].length; c++) {
                boardArray[r][c] = rand.nextInt(0,2);
            }

        }
    }

    /**
     * Toggles the selection of the press and all neighbors
     * the structure of 1 - position of neighbors works because
     * 1 - 0 = 1
     * and
     * 1 - 1 = 0 therefore toggling the positions of the board in the right way.
     *
     * @param row- row the player input
     * @param col - column the player input
     */
    public void press(int row, int col){
        boardArray[row][col] = 1 - boardArray[row][col];

       if(isInBounds(row + 1, col)){
           boardArray[row +1][col] = 1 - boardArray[row + 1][col];
       }
       if(isInBounds(row - 1, col)){
           boardArray[row - 1][col] = 1 - boardArray[row - 1][col];
           }
       if(isInBounds(row, col + 1)){
           boardArray[row][col + 1] = 1 - boardArray[row][col + 1];
       }
       if(isInBounds(row, col - 1)){
           boardArray[row][col - 1] = 1 - boardArray[row][col - 1];
       }

    }

    /**
     * Helper Debugger method to make sure that everything is toggling right
     */
    public void allTrue(){
        for (int r = 0; r < boardArray.length; r++) {
            for (int c = 0; c < boardArray[r].length ; c++) {
                boardArray[r][c] = 1;

            }

        }
    }

    public boolean isDark(){
        boolean isDark = true;
        for (int r = 0; r < boardArray.length; r++) {
            for (int c = 0; c < boardArray[r].length ; c++) {
                if(boardArray[r][c] == 1){
                    isDark = false;
                }
            }

        }
        return isDark;
    }

    /**
     * Helper method for the toggle press method to see if a neighbor is in bounds
     * to avoid an ArrayOutOfBounds Exception
     *
     * @param row - row to change
     * @param col - column to change
     * @return true if we are in bounds.
     */
    public boolean isInBounds(int row, int col){
        int length = boardArray.length;
        return row >= 0 && row < length && col >= 0 && col < length;
    }


    /**
     * Converts the board of the game to a string
     *
     *
     * @return the game Boards String.
     */
    @Override
    public String toString(){
        String boardArrayString = " ";

        //append column names
        for (int c = 0; c < boardArray[0].length; c++) {
            boardArrayString += c;
        }
        boardArrayString += "\n";


        for (int r = 0; r < boardArray.length; r++) {
            boardArrayString += r;
            for (int c = 0; c < boardArray.length; c++) {
                if(boardArray[r][c] == 1){
                    boardArrayString += "X";
                } else {
                    boardArrayString += "_";
                }

            }
            boardArrayString += "\n";

        }
        return boardArrayString;
    }




}
