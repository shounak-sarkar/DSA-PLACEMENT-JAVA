package SinglyLinkedLists;
import java.util.*;
public class DeleteMiddle {
    public static int findMiddle(Node head){
        Node slow = head , fast =head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return (slow!=null)? slow.data : -1;
    }

    public static Node deleteMiddleBrute(Node head){
        
        if (head==null||head.next==null) return head;
        int middle=(ListOp.length(head)/2);
        int i=1;
        Node temp=head;
        while(i<middle && temp!=null){
            temp=temp.next;
            i++;
        }
        System.out.printf("Deleted Node : %d",temp.data);
        temp.next=temp.next.next;
        return head;
    }

    public static Node DeleteMiddleOpt(Node head){
        Node slow=head,fast=head,temp=head;
        while(fast!=null && fast.next!=null){
            temp=slow;
            fast=fast.next.next;
            slow=slow.next;
        }
        //temp currently points the node before slow
        temp.next=temp.next.next;
        return head;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node head=new Node(1);
        List.insert(head,2);
        List.insert(head,3);List.insert(head,4);List.insert(head,5);
        System.out.println("Original List ");ListOp.printLL(head);
        System.out.println("Length of the List "+ListOp.length(head));
        int middle=(ListOp.length(head)/2);
        System.out.println("middle of 5 is "+middle);
        //System.out.println("Middle of the node is "+findMiddle(head));
        head=deleteMiddleBrute(head);
        System.out.println("After Deleting the Middle Node !!! ");
        ListOp.printLL(head);


    }
}
