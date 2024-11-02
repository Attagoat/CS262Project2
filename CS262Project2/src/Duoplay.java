public abstract class Duoplay {
    protected DuoplayPlayer player1;
    protected DuoplayPlayer player2;
    protected GameState currentState;

    Duoplay(){
        super();

    }

    Duoplay(DuoplayPlayer player1, DuoplayPlayer player2){
        this.player1 = player1;
        this.player2 = player2;
        this.currentState = GameState.IN_PROGRESS;






    }

    public void play(){
        DuoplayPlayer currentPlayer = player1;
        while(this.currentState == GameState.IN_PROGRESS){

            System.out.println(this);
            System.out.println("Player " + currentPlayer.getPlayerName() + "'s move");
            currentState = currentPlayer.move(this);


            if(currentState == GameState.WON){
                System.out.println(currentPlayer + "Won Congrats!");

            } else if(currentState == GameState.DRAW){
                System.out.println("It's a draw!");
            }

            if(currentPlayer == player1){
                currentPlayer = player2;
            } else {
                currentPlayer = player1;
            }

        }



    }
}
