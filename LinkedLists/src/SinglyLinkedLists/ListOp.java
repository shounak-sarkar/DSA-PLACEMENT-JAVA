package SinglyLinkedLists;
public class ListOp {
    public static void printLL(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data);
            if (temp.next!=null) System.out.print(" -> ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static int length(Node head){
        //Function that will compute the length of a Linked List
        Node temp=head;
        int count=0;
        while (temp!=null){
            count+=1;
            temp=temp.next;
        }
        return count;
    }
    public static int searchLL(Node head,int targ){
        Node temp=head;
        int pos=0;
        while(temp!=null){
            if (temp.data==targ){
                return pos;
            }
            pos++;
            temp=temp.next;
        }
        return -1;
    }


    }

