public class Main {
    public static void main(String[] args) {
        LightsOutPlayer lightsOutPlayer1 = new LightsOutPlayer("Atticus");
        LightsOutPlayer lightsOutPlayer2 = new LightsOutPlayer("Joshua");
        LightsOut lightsOutGame = new LightsOut(lightsOutPlayer1, lightsOutPlayer2, 1);


        lightsOutGame.randomize();
        lightsOutGame.play();

        GuessTheNumberPlayer guessNumplayer1 = new GuessTheNumberPlayer("Atticus");
        GuessTheNumberPlayer guessNumPlayer2 = new GuessTheNumberPlayer("Joshua");
        GuessTheNumber guessTheNumberGame = new GuessTheNumber(guessNumplayer1, guessNumPlayer2);

        guessTheNumberGame.play();


    }
}