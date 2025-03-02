package Queue;

import java.util.*;
import LinkedList.Node;

public class QueueLL {
    private Node front = null, rear = null; //front is actually the head
    private static int qSize = 0;

    boolean isEmpty() {
        return (front == null); //or rear == null (same functionality)
    }

    void enqueue(int x) {
        Node node = new Node(x);
        if(rear == null) {// if initally the queue is empty
            front = rear = node;
        }else{
            rear.next = node;
            rear = node;
        }
        qSize++;
    }

    int dequeue() {
        if (!isEmpty()) {
            int deleted_data = front.data;
            front = front.next;
            qSize--;
            if (front == null) rear = null;
            return deleted_data;
        }
        System.out.println("Queue is Currently Empty !!!");
        return -1;
    }

    int peek() {
        if (!isEmpty()) return front.data;
        System.out.println("Queue is Currently Empty !!!");
        return -1;
    }

    void display_Queue() {
        System.out.print("Queue Elements are ");
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
class QueueList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        QueueLL q=new QueueLL();
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
                if (top_data != -1) {
                    System.out.println("Front of queue Contains : " + top_data);
                }
            }else if (choice == 4) {
                q.display_Queue();//Display all queue elements
            } else if (choice == 5) {
                System.out.println("Process Terminated !!! ");
                break;
            }
        }
    }
}


