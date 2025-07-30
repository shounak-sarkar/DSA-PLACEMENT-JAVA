package utility;

import java.util.ArrayList;

public class fns {
    public static Object printArr(String[] arr){
        ArrayList<Object> ans=new ArrayList<>();
        for (String st : arr){
            ans.add(st);
        }
        return ans;
    }
}
