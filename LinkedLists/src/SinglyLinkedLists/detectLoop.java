package SinglyLinkedLists;
import java.util.HashMap;
import java.util.Map;
public class detectLoop {
    public static Node LoopDetectMap(Node head) {
        Node temp = head;
        Map<Node, Integer> nodeMap = new HashMap<>();
        //step 2 : traverse the linked list
        while (temp != null) {
            //if the node is already in
            //the map,there is a loops
            if (nodeMap.containsKey(temp)) {
                return temp;
            }
            nodeMap.put(temp, 1);
            temp = temp.next;
        }
        // Step 3 if the list is successfully traversed without a loop return false
        return null;
    }

    public static boolean LoopDetect(Node head){
        Node temp=head,slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast) return true;
        }
        return false;
    }
    public Node detectCycle(Node head) {
        Node temp = head, slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int arr[] ={1, 2, 3, 4, 5};
        Node head = null;
        for (int i : arr) {
            head = List.insert(head,i);
        }
        System.out.println("List is "); ListOp.printLL(head);
        if ( LoopDetect(head)){
            System.out.println("Loop Detected in LL ");
        }else{
            System.out.println("No Loop Detected ");
        }
    }
}
