package Stack;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class Stack_Queue {
    Queue<Integer> S ;
    public Stack_Queue(){
        S = new LinkedList<>();
    }

    public void push(int x) {
        S.add(x);
        int size = S.size();
        for (int i = 0; i < size - 1; i++) {
            S.add(S.remove());
        }
        System.out.printf("%d pushed into Stack \n", x);
    }
    public int top(){
        if(S.isEmpty())
            throw new RuntimeException("Queue is Empty!!!");
        return S.peek();
    }

    public int pop(){
        if(S.isEmpty())
            throw new RuntimeException("Queue is Empty!!!");
        return S.remove();
    }
    public void displayStackElements(){
        System.out.println("Stack Elements are "+S);
    }
}
//Main
public class UsingQueue {
    public static void main(String[] args) {
        Stack_Queue stack = new Stack_Queue();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an operation: 1:Push 2:Pop 3:Top 4:Display 5:Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter an integer to push:");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    try {
                        int poppedValue = stack.pop();
                        System.out.printf("%d popped from stack\n", poppedValue);
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        int topValue = stack.top();
                        System.out.printf("Top value is %d\n", topValue);
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    stack.displayStackElements();
                case 5 :
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

