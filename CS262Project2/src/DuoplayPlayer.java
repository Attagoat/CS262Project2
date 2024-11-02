public abstract class DuoplayPlayer {
    protected String playerName;

    /**
     * Constructor that gives player a default name
     */
    DuoplayPlayer() {
        playerName = "Default Name";

    }

    /**
     * constructor gives player given player name
     * @param playerName name of the player
     */
    DuoplayPlayer(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName(){
        return playerName;
    }

    /**
     *
     * @param game the game being played can be casted later into the game being pllayed
     * @return gamestate after moving
     */
    public abstract GameState move(Duoplay game);
}

