package Stack;

import java.util.Scanner;

public class reverseStringStackA {

    public static String reverseString(String st)
    {
        int lenSt=st.length();
        String[] starr=new String[lenSt];
        for(int i=0;i<starr.length;i++){
            StackAString.push(starr, String.valueOf(st.charAt(i)));
        }
        String reversedString="";
        for(int i=0;i<starr.length;i++){
            reversedString += StackAString.pop(starr);
        }
        return reversedString;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your String ");
        String s=sc.next();
        String rev=reverseString(s);
        if (rev.equals(s)){
            System.out.println("Given String is palindrome !!!!");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
