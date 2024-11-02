public abstract class Duoplay {
    protected DuoplayPlayer player1;
    protected DuoplayPlayer player2;
    protected GameState currentState;

    /**
     * Constructor for Duoplay
     */
    Duoplay(){
        super();

    }

    /**
     * Constructor with parameters for DuoPlay
     *
     * @param player1 - Constructor for Player 1
     * @param player2 - Constructor for player 2
     */
    Duoplay(DuoplayPlayer player1, DuoplayPlayer player2){
        this.player1 = player1;
        this.player2 = player2;
        this.currentState = GameState.IN_PROGRESS;

    }


    /**
     * General purpose method for playing games
     */
    public void play(){
        DuoplayPlayer currentPlayer = player1;
        while(this.currentState == GameState.IN_PROGRESS){ // while the game is in progress

            System.out.println(this);// references the ToString method of the game we are currently playing
            System.out.println("Player " + currentPlayer.getPlayerName() + "'s move"); // shows p;layer move
            currentState = currentPlayer.move(this);//this defines the current game that is running.


            if(currentState == GameState.WON){
                System.out.println(currentPlayer.getPlayerName() + " Won Congrats!");// if the state has been adjusted to 1 it prints out the player who win

            } else if(currentState == GameState.DRAW){
                System.out.println("It's a draw!"); //if it's a draw it prints out the draw
            }

            if(currentPlayer == player1){ // switches player turns
                currentPlayer = player2;
            } else {
                currentPlayer = player1;
            }

        }



    }
}
