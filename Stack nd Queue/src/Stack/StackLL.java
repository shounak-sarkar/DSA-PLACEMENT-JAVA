package Stack;
import java.util.Scanner;
import LinkedList.Node;

public class StackLL {
    private static Node top = null;
    private static int size = 0;

    public static boolean isEmpty() {
        return top == null;
    }

    public static void push(int data) {
        Node node = new Node(data);
        node.next = top;
        top = node;
        size++;
    }

    public static int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow !!! ");
            return -1;
        }
        int popped_data = top.data;
        top = top.next;
        size--;
        return popped_data;
    }

    public static int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty !!! ");
            return -1;
        }
        return top.data;
    }

    public static void display_Stack() {
        if(top==null){
            System.out.println("Stack is Empty !!! ");
            return;
        }
        System.out.println("Stack Elements are : ");
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void printSize() {
        System.out.println("Size of the Stack is " + size);
    }
}
class main{
    public static void main(String[] args) {
        StackLL st=new StackLL();
        Scanner sc = new Scanner(System.in);
        System.out.println("1 to Push 2 to Pop 3 to Peek 4 to Display 5 to Exit ");
        while (true) {
            System.out.print("enter choice : ");
            int choice = sc.nextInt();
            if (choice == 1) { //Push
                System.out.print("Enter Data to be Pushed ");
                int data = sc.nextInt();
                st.push(data);
            } else if (choice == 2) { //Pop
                int popped_data=st.pop();
                if (popped_data != -1) {
                    System.out.println("Value Popped: " + popped_data);
                }
            } else if (choice == 3) {//Peek
                int top_data=st.peek();
                if (top_data != -1) {
                    System.out.println("Top of Stack Contains : " + top_data);
                }
            }else if (choice == 4) {
                st.display_Stack();//Display all Stack elements
            } else if (choice == 5) {
                System.out.println("Process Terminated !!! ");
                break;
            }
        }
    }
}

