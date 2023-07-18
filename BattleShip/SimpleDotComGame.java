package BattleShip;

import java.util.ArrayList;

public class SimpleDotComGame {

    public static void main(String[] arg) {
        int numOfGuess = 0;

        GameHelper helper = new GameHelper();
        SimpleDotCom theDotCom = new SimpleDotCom();

        int randomNum = (int) (Math.random() * 5);

        ArrayList<String> locations = new ArrayList<String>();
        locations.add(Integer.toString(randomNum));
        locations.add(Integer.toString(randomNum + 1));
        locations.add(Integer.toString(randomNum + 2));

        theDotCom.setLocationCells(locations);

        System.out.println(locations);

        boolean isAlive = true;

        while (isAlive) {
            String guess = helper.getUserInput("Enter a number");
            String result = theDotCom.checkYourself(guess);
            numOfGuess++;
            System.out.println(result);
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuess + " guess");
            }
        }
    }
}
