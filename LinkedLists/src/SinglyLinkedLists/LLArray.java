package SinglyLinkedLists;
import java.util.*;
public class LLArray {
    public static Node createLLArray(int[] nums) {
        //will create a linked list based on the given data of an array of numbers
        Node head = new Node(nums[0]);
        Node mover = head;
        for (int i = 1; i < nums.length; i++) {
            Node temp = new Node(nums[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static Node deleteNode(Node head, int key) {
        //key is the item to be deleted
        if (head==null) return null ;
        //case 1 : if the head is to be deleted
        if (head.data==key){
            return head.next;
        }
        // case 2 : Any Node

        Node temp = head;
        Node prev=null;

        while(temp!=null && temp.data!=key){
            prev=temp;
            temp=temp.next;
        }

        if (temp == null) return head; //if key wasnt found

        prev.next=temp.next;
        return head;

    }
    public static Node DeleteKthNode(Node head,int K){
        // this function will delete the Kth element from the Linked list
        // K will be given by the user
        if (head == null) return null;
        
        if (K == 1){
            return head.next;
        }
        int i=1;
        Node temp=head;
        Node prev=null;
        while (temp!=null && i < K ){
            prev=temp;
            temp=temp.next;
            i++;
        }
        if (temp == null) return head;

        prev.next=temp.next;
        return head;

    }

    public static void main(String arg[]) {
        LLArray list = new LLArray();
        Scanner sc = new Scanner(System.in);
        int[] nums = {10, 20, 30, 40, 50};
        Node head = createLLArray(nums);
        ListOp.printLL(head);
//        System.out.println("The List contains " + ListOp.len(head) + " elements. ");
//        System.out.print("Enter The Element You want to search ?   ");
//        int searchEle=sc.nextInt();
//        int getSearch=ListOp.searchLL(head,searchEle);
//        if ( getSearch != -1) {
//            System.out.println("Element Found at Position " + (getSearch+1));
//        } else{
//            System.out.println("Element Not Present in the List !!!");
//        }
//    }
//        System.out.print("Enter the Node to be deleted ?? : ");
//        int del=sc.nextInt();
//        head=deleteNode(head,del);
//        System.out.println("After Deleting "+del+" the new List is ");
//        ListOp.printLL(head);

        int len=ListOp.length(head);
        System.out.print("Enter the Position(1 - "+len+") of Element You want to Delete : ");
        int k=sc.nextInt();

        head = DeleteKthNode(head,k);
        ListOp.printLL(head);

    }
}
