package SinglyLinkedLists;
import java.util.Stack;
public class middleList {
    public static Node MiddleBrute(Node head){
        if (head==null) return head;
        Node temp=head;
        int leng=ListOp.length(head);
        int middle=(leng/2)+1;
        int i=0;
        while (temp!=null && i < middle-1){
            temp=temp.next;
            i++;
        }
        return temp;
    }
    static Node MiddleOpt(Node head){
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
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
