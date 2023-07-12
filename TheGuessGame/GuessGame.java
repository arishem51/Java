package TheGuessGame;

public class GuessGame {
    Player p1 = new Player();
    Player p2 = new Player();

    public void startGuess() {
        p1.guess();
        p2.guess();
    }

    public boolean isEqual(int guessNum, int expect) {
        return expect == guessNum;
    }

    public void startGame() {
        p1.name = "Player 1";
        p2.name = "Player 2";
        int guessCount = 0;
        int targetNum = (int) (Math.random() * 100);

        System.out.println("I'm thinking about of a number between 0 and 9 ... ");

        boolean shouldPlayTheGame = true;
        String winner = "No player";

        while (shouldPlayTheGame) {
            startGuess();
            guessCount = guessCount + 1;

            if (isEqual(p1.guessNum, targetNum)) {
                winner = p1.name;
            } else if (isEqual(p2.guessNum, targetNum)) {
                winner = p2.name;
            }

            if (winner == p1.name || winner == p2.name) {
                System.out.println("After " + guessCount + " guess ! " + "We have a winner is " + winner);
                shouldPlayTheGame = false;
            }
        }

    }

}
