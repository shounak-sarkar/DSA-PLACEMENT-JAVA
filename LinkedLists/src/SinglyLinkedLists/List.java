package SinglyLinkedLists;
import java.util.Scanner;

public class List {

    public static Node insert(Node head,int data) {
        Node newNode=new Node(data);

        if (head == null) { //if the head is null return new node as the head
            return newNode;
        }

        //  Traverse to the end of the Linked List
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        // Attach the new node to the end of the Linked List
        current.next = newNode ;
        return head;
    }

    public static int search(Node head,int data){
        int pos=0;
        Node current=head;
        while(current!=null){
            if (current.data == data){
                return pos;
            }
            current=current.next;
            pos+=1;
        }
        return -1;
    }
    public static Node deleteNode(Node head,int data){
        if (head==null) return null;

        if (head.data==data){
            return head.next; //if the head node is to be deleted
        }

        Node prev=null;
        Node current=head;
        while(current!=null && current.data!=data){
            prev=current;
            current=current.next;
        }

        if (current == null ) return head; //data not found in the original List

        //delete the node if found
        prev.next=current.next;
        return head;

    }

    //delete node with specified position
    public static Node deleteKthNode(Node head,int K){
        if (head==null) return null;
        if (K==1) return head.next; //if the head node is to be deleted

        Node prev=null;
        Node current=head;
        int iterator = 1;
        while(current!=null && iterator < K ){
            prev=current;
            current=current.next;
            iterator++;
        }

        if (current == null ) return head; //data not found in the original List

        //delete the node if found
        prev.next=current.next;
        return head;

    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
//        System.out.println("How Many Values for your LL ? "); int leng=sc.nextInt();
        Node head=null;
        int arr[]={0,20,40,60,80,100};int leng=arr.length;
        for (int i = 0 ; i < leng ; i++){
            //System.out.println("Enter Value "+i+" :");
            //int data=sc.nextInt();
            head=insert(head,arr[i]);
        }
        //Print LL
        System.out.println("Created Linked List :: ");ListOp.printLL(head);
        //int searchKey=search(head,0);
        //if (searchKey != -1 ) System.out.println("Found at "+(searchKey+1));
       // else System.out.println("Not Found !!! ");
        //int data=80;
        //To delete a node
        //head=deleteNode(head,data);
        int K = 2;
        head=deleteKthNode(head,K);
        System.out.println("New LL after deleting "+K+"th Node "); ListOp.printLL(head);

    }
}
