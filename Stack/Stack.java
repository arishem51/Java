interface StackTypeVariables {
    final int DEFAULT_INITIALIZE = -1;
    final int MAXIMUM_STACK_SIZE = 9;
}

interface StackType extends StackTypeVariables {
    void push(int item);

    int pop();
}

class Stack implements StackType {
    private int stack[];
    private int tos;

    Stack(int size) {
        stack = new int[size];
        tos = DEFAULT_INITIALIZE;
    }

    public void push(int item) {
        if (tos == MAXIMUM_STACK_SIZE) {
            System.out.println("Stack is full!");
        } else {
            stack[++tos] = item;
        }
    }

    public int pop() {
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
        Stack myFirstStack = new Stack(5);
        Stack mySecondStack = new Stack(9);

        loop(5, myFirstStack);
        loop(9, mySecondStack);

        myFirstStack.logItem();
    }
}
