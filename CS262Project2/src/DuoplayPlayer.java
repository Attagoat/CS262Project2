public abstract class DuoplayPlayer {
    protected String playerName;

    DuoplayPlayer() {
        playerName = "Default Name";

    }

    DuoplayPlayer(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName(){
        return playerName;
    }

    public abstract GameState move(Duoplay game);
}

