package DoublyLinkedLists;
public class DllFn {
    public static void printDll(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data);
            if (temp.next!=null) System.out.print(" <-> ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static Node createnewHead(Node head,int val){
        Node newHead = new Node(val,head,null);
        if (head != null) {
            newHead.next.back = newHead;
        }
        return newHead;
    }
    public static void reversePrintDll(Node head){
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        //now temp is at the last node
        while (temp!=null){
            System.out.print(temp.data);
            if (temp.back!=null) System.out.print(" <-> ");
            temp=temp.back;
        }
        System.out.println();
    }
    public static Node insert(Node head,int data){
        Node node=new Node(data);
        if (head==null) {
            return node;
        }
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=node;
        node.back=current;
        return head;
    }
    public static Node deleteKth(Node head,int K){
        Node temp=head;
        int cnt = 0;
        while(temp!=null){
            cnt++;
            if(cnt==K) break;
            temp=temp.next;
        }
        temp.back.next=temp.next;
        temp.next.back=temp.back;
       return head;
    }
    public static Node insertatK(Node head,int K,int data){
        if (K <= 0) return head; //invalid position checck
        Node node=new Node(data);

        //Case 1 : Insert at Head(K = 1)
        if (K == 1){
            node.next=head;
            if(head != null){
                head.back=node;
            }
            return node;
        }

        Node temp=head,prev=null;
        int cnt = 1;
        while(temp!=null && cnt < K ){
            prev=temp;
            temp=temp.next;
            cnt++;
        }
        // Case 2 : If K is greater than list length , return unchanged head
        if (prev == null ) return null;

        prev.next=node;
        node.back=prev;
        node.next=temp;
        if (temp != null) { // If temp is not null, update its back pointer
            temp.back = node;
        }
        return head;
    }

    public static int LengthLL(Node head){
        Node temp=head;
        int counter=0;
        while (temp!=null) {
            counter++;
            temp=temp.next;
        }
        return counter;

    }

//    public static Node insertafterK(Node head,int K){
//        Node temp=head;
//        int cnt = 0;
//        while(temp!=null){
//            cnt++;
//            if(cnt==K) break;
//            temp=temp.next;
//        }
//    }
//    public static Node insertbeforeK(Node head,int K){
//        Node temp=head;
//        int cnt = 0;
//        while(temp!=null){
//            cnt++;
//            if(cnt==K) break;
//            temp=temp.next;
//        }
//    }
}
