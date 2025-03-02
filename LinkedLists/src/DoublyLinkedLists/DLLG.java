package DoublyLinkedLists;
import java.util.*;
public class DLLG {
    Node insertHead(Node head,int data) {
        //case for insertion at head
        Node node;
        if (head == null) {
            node = new Node(data);
        } else {
            node = new Node(data, head, null);
                head.back = node;
        }
        return node;
    }
    Node insertBefTail(Node head,int data){
        if (head==null) return null; //handle empty list
        Node tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }
        //edge case if there's only one node
        if (head.next==null) {
            return insertHead(head,data);
        }

        Node prev=tail.back;
        Node node=new Node(data,tail,prev);
        prev.next=node;
        tail.back=node;
        return head;
    }

    Node insertbeforeKth(Node head, int data, int K){
        if (K==1) {
            return insertHead(head, data);
        }
        int i=1;
        Node temp=head;
        while (temp!=null && i<K){
            temp=temp.next;
            i++;
        }
        if (temp==null || temp.next==null) return insertBefTail(head,data);
        Node prev=temp.back;
        Node node=new Node(data,temp,prev);
        prev.next=node;
        temp.back=node;
        return head;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DLLG ob=new DLLG();
        int arr[]={1,2,3,4,5};
        Node head=null;
        for (int i=0;i<arr.length;i++){
            head=ob.insertHead(head,arr[i]);
        }
        head=ob.insertHead(head,6);
        head=ob.insertBefTail(head,10);

        System.out.println("Your Doubly Linked List is");
        DllFn.printDll(head);
        DllFn.reversePrintDll(head);
        System.out.println("Length Of Linked List is "+DllFn.LengthLL(head));

        head=ob.insertbeforeKth(head,69,8);
        DllFn.printDll(head);

        //DllFn.reversePrintDll(head);
    }
}
