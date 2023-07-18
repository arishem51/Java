package BattleShip;

import java.util.ArrayList;

public class SimpleDotCom {
    ArrayList<String> locationCells = new ArrayList<String>();
    int numOfHits;

    void setLocationCells(ArrayList<String> newLocationCells) {
        locationCells = newLocationCells;
    }

    public String checkYourself(String stringGuess) {
        String result = "miss";
        int index = locationCells.indexOf(stringGuess);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }
        return result;
    }

}

class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();

        ArrayList<String> locations = new ArrayList<String>();
        locations.add(Integer.toString(1));
        locations.add(Integer.toString(2));
        locations.add(Integer.toString(3));

        dot.setLocationCells(locations);

        String userGuess = "2";

        String result = dot.checkYourself(userGuess);

        String testResult = "failed";

        if (result.equals("hit")) {
            testResult = "passed";
        }
        System.out.println(testResult);
    }
}
