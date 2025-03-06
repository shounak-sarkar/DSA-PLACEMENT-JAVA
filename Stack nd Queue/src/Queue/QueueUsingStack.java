package Queue;
import java.util.Stack;
import java.util.Scanner;
class QueueStack{
    Stack<Integer> q;
    public QueueStack(){
        q = new Stack<>();
    }

    public void enqueue(int x){
        Stack<Integer> q2=new Stack<>();
        if(q.isEmpty() ) {
            q.push(x);
            System.out.printf("\n %d pushed into the Queue ",x);
        }
        else{
            // move all elements from q to q2
            while(!q.isEmpty()){
                q2.push(q.pop());
            }
            //push the new element to q
            q.push(x);
            System.out.printf("\n%d pushed into the Queue", x);

            // move all elements from q2 to q
            while(!q2.isEmpty()){
                q.push(q2.pop());
            }
        }
    }
    public void display_Queue() {
        System.out.println("\nQueue elements: " + q);
    }

    public int peek() {
        if (q.isEmpty()) {
            throw new RuntimeException("Queue is empty!");
        }
        return q.peek();
    }

    public int dequeue(){
        if(q.isEmpty())
            throw new RuntimeException("Queue is Empty!!!");
        return q.pop();
    }
}



public class QueueUsingStack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        QueueStack q = new QueueStack();

        System.out.println("1 to Enqueue 2 to Dequeue 3 to Peek 4 to Display 5 to Exit ");
        while (true) {
            System.out.print("enter choice : ");
            int choice = sc.nextInt();
            if (choice == 1) { //enqueue
                System.out.print("Enter Data to be Enqueue ");
                int data = sc.nextInt();
                q.enqueue(data);
            } else if (choice == 2) { //dequeue
                int popped_data=q.dequeue();
                if (popped_data != -1) {
                    System.out.println("Value Popped: " + popped_data);
                }
            } else if (choice == 3) {//Peek
                int top_data=q.peek();
                System.out.println("Front of queue Contains : " + top_data);
            }else if (choice == 4) {
                q.display_Queue();//Display all queue elements
            } else if (choice == 5) {
                System.out.println("Process Terminated !!! ");
                break;
            }
        }
    }
}
