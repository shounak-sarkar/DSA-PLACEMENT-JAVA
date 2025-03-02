
package SinglyLinkedLists;
import java.util.Stack;

public class ReverseLLIterative {
    static Node ReverseLLIterativeStack(Node head){
        Stack<Integer> st=new Stack<>();
        Node temp=head;
        while(temp!=null){
            st.push(temp.data);
            temp=temp.next;
        }
        temp=head;
        int dat;
        while(! st.isEmpty()){
            dat=st.peek();
            temp.data=dat;
            st.pop();
            temp=temp.next;
        }
        return head;
    }

    static Node ReverseLLIterativeOpt(Node head){
        Node temp=head,prev=null,front=null;
        while (temp!=null){
            front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev ;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        Node head=null;
        for (int a : arr){
            head=List.insert(head,a);
        }
        System.out.println("List is "); ListOp.printLL(head);
        //System.out.println("Length of List is "+ListOp.length(head));
        //Node middle=MiddleOpt(head);
        //System.out.println("The Middle of the Linked List is "); ListOp.printLL(middle);
        head=ReverseLLIterativeOpt(head);
        System.out.println("Reverse of LL is "); ListOp.printLL(head);
    }
}
