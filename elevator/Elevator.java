import java.util.Timer;
import java.util.TimerTask;

public class Elevator {
    private int currentFloor;
    Timer timer = new Timer();
    private int ONE_SECOND = 1000;

    public Elevator() {
        this.currentFloor = 0;
    }

    private void scheduleElevator(int requestFloor) {
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (requestFloor > currentFloor) {
                    currentFloor++;
                } else {
                    currentFloor--;
                }
                System.out.println("Has go to the " + currentFloor + " floor!");
                if (currentFloor != requestFloor) {
                    scheduleElevator(requestFloor);
                } else {
                    System.out.println("Current floor: " + currentFloor + " - Elevator has finished moving!\n");
                }
            }
        }, ONE_SECOND);
    }

    public void move(int requestFloor) throws Exception {
        if (requestFloor < 0) {
            throw new Exception("The elevator cann't go to that floor");
        }
        System.out.println("Elevator is moving!");
        System.out.println("Elevator will go to the " + requestFloor + " - Current floor: " + this.currentFloor);
        scheduleElevator(requestFloor);

    }

}