package Echo;

import java.util.Scanner;

public class Echo {
    public static void printLine(String args) {
        System.out.println(args);
    }

    public static String getNextLine(Scanner args) {
        return args.nextLine();
    }

    public static void main(String[] args) {
        String line;
        Scanner scanner = new Scanner(System.in);
        printLine("Type something: ");
        line = getNextLine(scanner);
        printLine("You said: " + line);
    }
}
