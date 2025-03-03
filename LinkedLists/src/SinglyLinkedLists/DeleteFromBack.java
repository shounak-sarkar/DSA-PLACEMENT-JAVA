package SinglyLinkedLists;
import java.util.*;
public class DeleteFromBack {



    public static Node DeleteBackBrute(Node head,int N){
        if(head==null) return head;

        int count=ListOp.length(head);
        if(N==count){
            head=head.next;
            return head;
        }
        Node temp=head;
        for (int i = 0 ; i < count-N-1 ;i++ ){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node head=new Node(1);
        List.insert(head,2);List.insert(head,3);List.insert(head,4);List.insert(head,5);
        System.out.println("Original List ");ListOp.printLL(head);
        System.out.print("Enter The Node You want to delete from back ?? ");
        int N=sc.nextInt();
        head=DeleteBackBrute(head,N);
        System.out.printf("\nAfter Deleting Node no. %d from back\n",N);
        ListOp.printLL(head);


    }
}
