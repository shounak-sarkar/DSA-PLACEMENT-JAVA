package Basic;
import utility.fns;

import java.awt.*;

import static javax.swing.text.StyleConstants.setBackground;

public class LongestCommonPrefix {




    private static String findLongestCommonPrefix(String[] words) {
        //first consider the first word in the array to be of longest common prefix
        String longestPref=words[0];
        //Compare the current prefix with each string in the array

        for (int i = 0 ; i < words.length ;i++){
            //Narrow down the prefix with each comparison
            while(words[i].indexOf(longestPref) != 0 ){ //checks if current string starts with current longestPref
                //shorten the prefix by one character from the end
                longestPref=longestPref.substring(0,longestPref.length()-1);

                //if the prefix becomes empty , there is no common prefix
                if (longestPref.isEmpty()) return "no common prefix";
            }

        }
        return longestPref;
    }
    public static void main(String[] args) {
        String [] words={"flow","flower","float","flintoff","flintlock"};
        String [] words2={"rabbit","rare","olga"};

        System.out.println("In First : "+fns.printArr(words)+"\n"+findLongestCommonPrefix(words));
        System.out.println("In Second : "+fns.printArr(words2)+"\n"+findLongestCommonPrefix(words2));

    }


}

