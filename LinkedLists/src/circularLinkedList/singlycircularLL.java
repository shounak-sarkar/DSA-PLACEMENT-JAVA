package circularLinkedList;

import java.util.ArrayList;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class singlycircularLL {

    protected static Node insertEnd(Node head,int val){
        if (head == null){
            head = new Node(val);
            head.next=head;
            return head;
        }
        Node temp=head;
        while( temp.next != head){
            temp=temp.next;
        }
        Node newNode= new Node(val);
        temp.next=newNode;
        newNode.next=head;
        return head;
    }

    protected static void display(Node head){
        Node temp=head;
        System.out.print("{ ");
        do{
            System.out.print(temp.data+ " -> ");
            temp=temp.next;

        }while(temp!=head);
        System.out.println("null } ");
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        Node head=null;
        for (int i : arr){
            head=insertEnd(head,i);
        }
        ArrayList <Integer> ans=new ArrayList<>();

        //display circular pattern
        display(head);

    }
}
