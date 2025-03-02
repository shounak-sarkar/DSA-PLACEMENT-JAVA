package SinglyLinkedLists;
import java.util.Stack;

public class palindrome {


    //to check for palindrome
    public static boolean checkPalBrute(Node head) {
        Stack<Integer> st = new Stack<>();
        Node temp = head;
        while (temp != null) {
            st.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            if (st.pop() != temp.data) { // Compare values
                return false;
            }
            temp = temp.next;
        }
        return true;
    }



    public static void main(String[] args) {
        Node head=new Node(1);
        List.insert(head,2);List.insert(head,3);List.insert(head,2);List.insert(head,1);
        System.out.println("The Original List is ");
        ListOp.printLL(head);
        if (checkPalBrute(head)) System.out.println("Yes Palindrome !!! ");
        else System.out.println("Not palindrome !!! ");
    }
}
