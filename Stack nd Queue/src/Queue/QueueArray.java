package Queue;

import java.util.Scanner;

public class QueueArray {
    static int front = 0 , rear=-1;
    public static boolean isFull(int [] q){
        return rear==q.length-1;
    }
    public static boolean isNull(int[] q)
    {
        return front > rear;
    }

    public static void enqueue(int [] q , int data){
        if (isFull(q)){
            System.out.println("Queue Full !!! Cant Enqueue Data ");
            return;
        }
        rear++;
        q[rear]=data;
    }

    public static void dequeue(int[]q)
    {
        if (isNull(q)){
            System.out.println("Queue is Empty !! cant push anymore data !!!");
            return;
        }
        System.out.println("Data Dequeued is "+q[front]);
        front++;
    }

    public static void display_Q(int[] q){
        if (isNull(q)){
            System.out.println("Queue is Empty !! ");
            return;
        }
        System.out.println("Queue Items Are ::: ");
        for (int i=front;i<=rear;i++) {
            System.out.print(q[i]);
        }
        System.out.println();
    }

    public static void peek(int[] q){
        if (isNull(q)){
            System.out.println("Queue is Empty !! ");
            return;
        }

        System.out.print("Data Present at the Front is :: "+q[front+1]);
        System.out.println();
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Define the queue Size : ");
        int MAX = sc.nextInt();
        int queue[] = new int[MAX];
        System.out.println("1 to Enqueue 2 to Dequeue 3 to Peek 4 to Display 5 to Exit ");
        while (true) {
            System.out.print("enter choice : ");
            int choice = sc.nextInt();
            if (choice == 1) { //Push
                System.out.print("Enter Data to be entered in QUEUE ");
                int data = sc.nextInt();
                enqueue(queue,data);
            } else if (choice == 2) { //Pop
                dequeue(queue);
            } else if (choice == 3) {//Peek
                peek(queue);
            }else if (choice == 4) {
                display_Q(queue);//Display all queue elements
            } else if (choice == 5) {
                System.out.println("Process Terminated !!! ");
                System.out.print("Thank You");
                break;
            }
        }
        sc.close();
    }

}

