package Queue;
import LinkedList.Node;
import java.util.Scanner;
public class CircularQueueLL {
    private Node front=null;
    private Node rear=null;
    private static int cqSize=0;

    public boolean isEmpty(){
        return front==null;
    }

    public void enqueue(int data){
        Node node=new Node(data);
        if (node==null) {
            System.out.println("Queue Overflow");
            return;
        }
        node.next=null;

        if(isEmpty()){
            front=node;
            rear=node;
            node.next=node; //circular for single node
        }else{
            node.next=front;
            rear.next=node;
            rear=node;
        }
    }

    public int dequeue(){
        if (isEmpty()) {
            System.out.println("Queue is empty !!! ");
            return -1;
        }
        int deletedData=front.data;
        //if only one node
        if (front == rear){
            front = null;
            rear = null;
        }else {
            front = front.next;
            rear.next = front;
        }
        return deletedData;
    }
    public int peek() {
        if (!isEmpty()) return front.data;
        System.out.println("Queue is Currently Empty !!!");
        return -1;
    }

    public void display_Queue() {
        System.out.print("Circular Queue Elements are ");
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        do{
            System.out.print(temp.data + " ");
            temp = temp.next;
        }while (temp != front); //since its circular queue it will print infinite times
        System.out.println();
    }
}

class CircularQueueImp{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CircularQueueLL q=new CircularQueueLL();
        System.out.println("Circular Queue implementation");
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