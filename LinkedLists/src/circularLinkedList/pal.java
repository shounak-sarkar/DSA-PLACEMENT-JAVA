package circularLinkedList;

import java.util.LinkedHashMap;
import java.util.Map;

public class pal {
    public static boolean checkpalindrome(String num){
        int left=0,right=num.length()-1;
        while(left<right){
            if (num.charAt(left) != num.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        LinkedHashMap<String, Boolean> ans=new  LinkedHashMap<>();

        String num[]={"123454321","676","11","21"};

        for (String st : num){
            ans.put(st,(checkpalindrome(st)));
        }

        System.out.println("Ans is \n"+ans);
    }
}
