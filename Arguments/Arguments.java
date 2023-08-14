package Arguments;

public class Arguments {
    public static void main(String[] args) {
        int argsLength = args.length;
        System.out.println("This is Arguments ");

        if (argsLength > 0) {
            for (int i = 0; i < argsLength; i++) {
                System.out.println("args[" + i + "]: " + args[i]);
            }
        }

    }
}
