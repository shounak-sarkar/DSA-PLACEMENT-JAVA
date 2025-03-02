package basics;

import java.util.Scanner;




public class fibonacci {
    public static int fiboNth(int n){
        if (n<=1) return n;
        return fiboNth(n-1)+fiboNth(n-2);
    }

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Which Fibo Do You Want?? ");int n=Sc.nextInt();
        System.out.print("The "+n+"th Fibonacci Number is "+fiboNth(n));
    }


}
