package DoublyLinkedLists;
import java.util.*;
public class DLL {
    private static Node addNode(Node head, int p, int x) {
        // Your code here
        Node newNode = new Node(x);
        if (p == 0) {
            return newNode;
        }
        int i = 0;
        Node current = head;
        while (current.next != null && i < p) {
            current = current.next;
            i++;
        }
        // If p-th node is found inserting a node
        if (current != null) {
            newNode.next = current.next;
            if (current.next != null) {
                current.next.back = newNode;
            }
            current.next = newNode; //Link current Node to new Node
            newNode.back = current;
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] nums={10,20,30,40,50};
        Node head=null;
        for (int i : nums){
            head=DllFn.insert(head,i);
        }
        //DllFn.printDll(head);
        //DllFn.reversePrintDll(head);
        int x = 65;
        // addNode(head,3,x);
        //head = DllFn.createnewHead(head,x);
        int k=2,data=25;
        //head=DllFn.deleteKth(head,k);
        head=DllFn.insertatK(head,k,data);
        DllFn.printDll(head);
        DllFn.reversePrintDll(head);

    }
}
