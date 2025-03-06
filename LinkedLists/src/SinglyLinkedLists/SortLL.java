package SinglyLinkedLists;
import java.util.ArrayList;
import java.util.Collections;

public class SortLL {
    public static Node sortBrute(Node head){
        Node temp=head;
        ArrayList<Integer> listelements=new ArrayList<>();
        while(temp!=null){
            listelements.add(temp.data);
            temp=temp.next;
        }
        Collections.sort(listelements);
        temp=head;
        for(int i=0;i<listelements.size();i++){
            temp.data=listelements.get(i);
            temp=temp.next;
        }
        return head;
    }

    public static Node findMiddle(Node head){
        Node slow=head,fast=head;
        while(fast !=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static void mergeSortLL(Node head){
        if (head==null || head.next==null)return head;
        Node middle=(findMiddle(head));
        Node right=middle.next;
        middle.next=null;
        Node left=head;

        left=mergesortLL(left);

    }

    public static void main(String[] args) {
        int[] arr={6,2,3,1,19,10,15,12};
        Node head=null;
        for (int a : arr){
            head=List.insert(head,a);
        }
        System.out.println("List is "); ListOp.printLL(head);

        head=sortBrute(head);
        System.out.println("After Sorting \nNew List"); ListOp.printLL(head);
    }
}
