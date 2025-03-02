package SinglyLinkedLists;
class Node{
    int data;
    Node next;

    Node(int data, Node next1){
        this.data=data;
        this.next=next1;
    }
    Node(int data){
        this.data=data;
        this.next=null;
    }
}