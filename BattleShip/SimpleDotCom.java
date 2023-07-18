package BattleShip;

public class SimpleDotCom {
    int[] locationCells;
    int numOfHits;

    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";

        for (int cell : locationCells) {
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }
        }

        if (numOfHits == locationCells.length) {
            result = "kill";
        }
        System.out.println(result);
        return result;
    }

    void setLocationCells(int[] newLocationCells) {
        locationCells = newLocationCells;
    }
}

// class SimpleDotComTestDrive {
// public static void main(String[] args) {
// SimpleDotCom dot = new SimpleDotCom();

// int[] locations = { 2, 3, 4 };

// dot.setLocationCells(locations);

// String userGuess = "2";

// String result = dot.checkYourself(userGuess);

// String testResult = "failed";

// if (result.equals("hit")) {
// testResult = "passed";
// }
// System.out.println(testResult);
// }
// }
