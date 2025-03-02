package DoublyLinkedLists;
import java.util.*;
public class reversDLL {

    public static Node reverseLLNaive(Node head){
        Stack<Integer> st=new Stack<>();
        Node temp=head;
        while(temp!=null){
            st.push(temp.data);
            temp=temp.next;
        }
        //2nd iteration popping of elements
        temp=head;
        while(temp!=null){
            temp.data=st.peek();
            st.pop();
            temp=temp.next;
        }
        return head;
    }

    public static Node reverseLinks(Node head){
        Node current=head,last=null;
        //swap next and back pointer
        while(current!=null){
            last=current.back;
            current.back=current.next;
            current.next=last;
            current=current.back;
        }
        return last.back;
    }
    public static void main(String[] args) {

        int arr[]={19,3,8,57,76,95,114,133,152,171,190};
        //Node head=new Node(arr[0]);
        Node head=null;
        for (int i=0;i<arr.length;i++){
            head=DllFn.insert(head,arr[i]);
        }
        DllFn.printDll(head);
        System.out.println("Reversing The Doubly LL ");
       //head=reverseLLNaive(head);
        head=reverseLinks(head);
        DllFn.printDll(head);

    }


}
