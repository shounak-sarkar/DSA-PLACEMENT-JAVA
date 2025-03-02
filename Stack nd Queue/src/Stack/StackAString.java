package Stack;

import java.util.*;
public class StackAString {
    static int top=-1;
    public static boolean isEmpty(String[] stack){
        if (top==-1)
            return true;
        return false;
    }
    public static boolean isFull(String[] stack){
        return top == stack.length-1;
    }
    public static void push(String [] st, String data){
        if (isFull(st)) {
            System.out.println("Stack OverFlow Cant Push Value");
            return;
        }
        top++;
        st[top]=data;
    }
    public static String pop(String[] st ){
        if (isEmpty(st)) {
            System.out.println("Stack is Empty No values to delete!!!");
            return null;
        }
        String popped_data=st[top];
        top--;
        return popped_data;
    }
    public static String peek(String[] st){
        if (isEmpty(st)){
            System.out.println("Stack is Empty No Data To Show");
            return null;
        }
        return st[top];
    }
    public static void display_Stack(String[] st ){
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
        String stack[] = new String[MAX];
        System.out.println("1 to Push 2 to Pop 3 to Peek 4 to Display 5 to Exit ");
        while (true) {
            System.out.print("\nenter choice : ");
            int choice = sc.nextInt();
            if (choice == 1) { //Push

                System.out.print("Enter Data to be Pushed ");
                String data = sc.next();
                push(stack,data);
            } else if (choice == 2) { //Pop
                String popped_data=pop(stack);
                if (popped_data != null) {
                    System.out.println("Value Popped: " + popped_data);
                }
            } else if (choice == 3) {//Peek
                String top_data=peek(stack);
                if (top_data != null) {
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
