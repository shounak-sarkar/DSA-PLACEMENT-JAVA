package Stack;
import java.util.Scanner;
import java.util.Stack;
class Pair {
    int x, y;
    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
class MinimumStack {
    Stack < Pair > st;
    public MinimumStack() {
        st = new Stack < > ();
    }

    public void push(int x) {
        int min;
        if (st.isEmpty()) {
            min = x;
        } else {
            min = Math.min(st.peek().y, x);
        }
        st.push(new Pair(x, min));
    }

    public void pop() {
        st.pop();
    }

    public int top() {
        return st.peek().x;
    }

    public int getMin() {
        return st.peek().y;
    }
}
public class MinStack{
public static void main(String[] args) {
    MinimumStack minStack = new MinimumStack();
    Scanner scanner = new Scanner(System.in);

    while (true) {
        System.out.println("\nChoose an operation:");
        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. Top");
        System.out.println("4. Get Min");
        System.out.println("5. Exit");
        System.out.print("Enter choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter value to push: ");
                int value = scanner.nextInt();
                minStack.push(value);
                System.out.println(value + " pushed onto the stack.");
                break;

            case 2:
                if (!minStack.st.isEmpty()) {
                    minStack.pop();
                    System.out.println("Top element popped.");
                } else {
                    System.out.println("Stack is empty! Cannot pop.");
                }
                break;

            case 3:
                if (!minStack.st.isEmpty()) {
                    System.out.println("Top element: " + minStack.top());
                } else {
                    System.out.println("Stack is empty!");
                }
                break;

            case 4:
                if (!minStack.st.isEmpty()) {
                    System.out.println("Minimum element: " + minStack.getMin());
                } else {
                    System.out.println("Stack is empty!");
                }
                break;

            case 5:
                System.out.println("Exiting program...");
                scanner.close();
                return;

            default:
                System.out.println("Invalid choice! Please try again.");
        }
    }
}
}
