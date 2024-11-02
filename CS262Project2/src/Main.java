public class Main {
    public static void main(String[] args) {
        LightsOutPlayer player1 = new LightsOutPlayer("Atticus");
        LightsOutPlayer player2 = new LightsOutPlayer("Joshua");
        LightsOut lightsOutGame = new LightsOut(player1, player2, 4);

        lightsOutGame.randomize();
        lightsOutGame.play();
    }
}