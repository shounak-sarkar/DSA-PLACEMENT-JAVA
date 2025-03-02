package Stack;

import java.util.*;
public class StackArray {
    static int top=-1;
    public static boolean isEmpty(int[] stack){
        if (top==-1)
            return true;
        return false;
    }
    public static boolean isFull(int[] stack){
        return top == stack.length-1;
    }
    public static void push(int [] st, int data){
        if (isFull(st)) {
            System.out.println("Stack OverFlow Cant Push Value");
            return;
        }
        top++;
        st[top]=data;
    }
    public static int pop(int [] st ){
        if (isEmpty(st)) {
            System.out.println("Stack is Empty No values to delete!!!");
            return -1;
        }
        int popped_data=st[top];
        top--;
        return popped_data;
    }
    public static int peek(int[] st){
        if (isEmpty(st)){
            System.out.println("Stack is Empty No Data To Show");
            return -1;
        }
        return st[top];
    }
    public static void display_Stack(int[] st ){
        if (isEmpty(st)) {
            System.out.println("Stack is Empty! ");
            return;
        }
        System.out.println("elements present inside the stack are ");
        for (int i=0;i<=top;i++){
            System.out.print(st[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Define the Stack Size : ");
        int MAX = sc.nextInt();
        int stack[] = new int[MAX];
        System.out.println("1 to Push 2 to Pop 3 to Peek 4 to Display 5 to Exit ");
        while (true) {
            System.out.print("\nenter choice : ");
            int choice = sc.nextInt();
            if (choice == 1) { //Push

                System.out.print("Enter Data to be Pushed ");
                int data = sc.nextInt();
                push(stack,data);
            } else if (choice == 2) { //Pop
                int popped_data=pop(stack);
                if (popped_data != -1) {
                    System.out.println("Value Popped: " + popped_data);
                }
            } else if (choice == 3) {//Peek
                int top_data=peek(stack);
                if (top_data != -1) {
                    System.out.println("Top of Stack: " + top_data);
                }
            }else if (choice == 4) {
                display_Stack(stack);//Display all Stack elements
            } else if (choice == 5) {
                System.out.println("Process Terminated !!! ");
                break;
            }
        }
        sc.close();
    }
}
