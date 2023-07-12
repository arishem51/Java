package TheGuessGame;

public class Player {
    int guessNum = 0;
    String name = "";

    static int randomNum(double num) {
        return (int) (Math.random() * num);
    }

    public void guess() {
        guessNum = randomNum(100);
    }
}
