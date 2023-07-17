package ElectricGuitar;

public class ElectricGuitar {
    private String brand;
    private int numOfPickups;
    private boolean rockStartUsesIt;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String newBrand) {
        brand = newBrand;
    }

    int getNumOfPickups() {
        return numOfPickups;
    }

    void setNumOfPickups(int num) {
        numOfPickups = num;
    }

    boolean getRockStartUsesIt() {
        return rockStartUsesIt;
    }

    void setRockStartUsesIt(boolean answer) {
        rockStartUsesIt = answer;
    }
}
