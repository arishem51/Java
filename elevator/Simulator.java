import java.util.Random;
import java.util.Scanner;

public class Simulator {
    public static void main(String[] args) {
        int userChoice;
        int requestFloor;
        Elevator elevator = new Elevator();
        while (true) {
            try {
                System.out.println("\nPlease choose elevator options: ");
                System.out.println("1: Move the elevator to the random floor ");
                System.out.println("0: Exit simulator\n");
                Scanner sc = new Scanner(System.in);
                userChoice = sc.nextInt();
                switch (userChoice) {
                    case 1:
                        System.out.print("Type the request floor: ");
                        requestFloor = sc.nextInt();
                        System.out.println("\n");
                        elevator.move(requestFloor);
                        break;
                    case 0:
                    default:
                        System.out.println("Exit simulator!");
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
