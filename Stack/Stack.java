import java.util.function.Function;

class Stack {
    private int stack[] = new int[10];
    private int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9) {
            System.out.println("Stack is full!");
        } else {
            stack[++tos] = item;
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Stack has no any item!");
            return 0;
        }
        return stack[tos--];
    }

    void logItem() {
        for (int i = 0; i < tos; i++) {
            System.out.println("Item in the Stack: " + stack[i]);
        }
    }

}

class TestStack {

    private static void loop(int num, Stack stack) {
        for (int i = 0; i < num; i++) {
            stack.push(i);
        }
    }

    public static void main(String args[]) {
        Stack myFirstStack = new Stack();
        Stack mySecondStack = new Stack();

        loop(10, myFirstStack);
        loop(20, mySecondStack);

        myFirstStack.logItem();
    }
}
