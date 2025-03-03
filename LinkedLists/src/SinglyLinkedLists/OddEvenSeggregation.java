package SinglyLinkedLists;

import java.util.ArrayList;

public class OddEvenSeggregation {
    public static Node OddEvenSegg(Node head){
        if (head == null || head.next == null) return head;
        Node odd=head, even=head.next , evenHead=head.next;
        Node oddhead=head;
        while (even!=null && even.next!=null ){
            odd.next=odd.next.next;
            even.next=even.next.next;
            odd=odd.next;
            even=even.next;
        }
        odd.next=evenHead;
        return oddhead;
    }



    public static Node OddEvenSeggBetter(Node head) {
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        Node temp = head;
        int count = 1;
        while (temp != null) {
            if (count % 2 != 0) {//odd
                odd.add(temp.data);
            } else if (count % 2 == 0) {
                even.add(temp.data);
            }
            temp = temp.next;
            count += 1;
        }
        temp = head;
        for (int i = 0; i < odd.size(); i++) {
            temp.data = odd.get(i);
            temp = temp.next;
        }
        for (int i = 0; i < even.size(); i++) {
            temp.data = even.get(i);
            temp=temp.next;
        }
        return head;
    }

    public static Node OddEvenSeggBrute(Node head){
        if(head == null ) return head;
        ArrayList<Integer> set=new ArrayList<>();
        Node odd=head,even=head.next;
        int count=1;
        while(odd!=null){
            set.add(odd.data);
            odd = (odd.next != null) ? odd.next.next : null;
        }
        while(even!=null){
            set.add(even.data);
            even=(even.next!=null)?even.next.next:null;
        }
        System.out.println(set);
        Node temp=head;
        for (int i=0 ; i<set.size();i++){
            temp.data=set.get(i);
            temp=temp.next;
        }
        return head;
    }


    public static void main(String[] args) {
        Node head=new Node(2);
        List.insert(head,3);List.insert(head,1);List.insert(head,4);List.insert(head,5);List.insert(head,6);
        System.out.println("Before Seggregation ");
        ListOp.printLL(head);
        head=OddEvenSeggBetter(head);
        System.out.println("After Seggregation ");
        ListOp.printLL(head);

    }
}
