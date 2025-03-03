package SinglyLinkedLists;
import java.util.Stack;

public class palindrome {

    public static Node reverseLL(Node head){
        Node temp=head;
        Node front=null,prev=null;
        while(temp!=null){
            front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
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

    public static boolean checkPalOpt(Node head) {
        if (head == null || head.next == null) return true; // Single element or empty list is palindrome
        // Step 1: Find the middle of the linked list
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // Step 2: Reverse the second half
        Node secondHalf = reverseLL(slow);
        Node firstHalf = head;
        Node secondHalfCopy = secondHalf; // To restore the list later
        // Step 3: Compare both halves
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                reverseLL(secondHalfCopy); // Restore list before returning
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        // Step 4: Restore the original list (optional)
        reverseLL(secondHalfCopy);
        return true;
    }

    public static void main(String[] args) {
        Node head=new Node(1);
        List.insert(head,2);List.insert(head,2);List.insert(head,3);List.insert(head,1);
        System.out.println("The Original List is ");
        ListOp.printLL(head);
        head=reverseLL(head);
        ListOp.printLL(head);
//        if (checkPalBrute(head)) System.out.println("Yes Palindrome !!! ");
//        else System.out.println("Not palindrome !!! ");
    }
}
