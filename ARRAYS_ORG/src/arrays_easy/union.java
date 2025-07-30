package arrays_easy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
public class union {
    public static ArrayList<Integer> unionArrBrute(int []a , int[] b){
        ArrayList<Integer> uni=new ArrayList<>();
        Set<Integer> uniSet= new HashSet<>();
        for (int i : a)
            uniSet.add(i);
        for (int i : b)
            uniSet.add(i);
        for (int i : uniSet)
            uni.add(i);
        return uni;
      }
      public static ArrayList<Integer> unionArrOpt(int []a , int[] b){
        ArrayList<Integer> uni=new ArrayList<>();
        int i = 0 , j = 0 , n1=a.length , n2 = b.length;
        while (i<n1 && j<n2){
            if(a[i] < b[j]){
                if (uni.isEmpty() || a[i] != uni.get(uni.size()-1)){ //checkign for duplicates
                    uni.add(a[i]);
                }
                i++;
            }else{
                    if (uni.isEmpty() || b[j] != uni.get(uni.size()-1)){ //checkign for duplicates
                        uni.add(b[j]);
                    }
                    j++;
                }
            }
                while(i<n1){
                    if (uni.isEmpty() || a[i] != uni.get(uni.size() - 1)) { // Check for duplicates
                        uni.add(a[i]);
                    }
                    i++;
                }
                while(j<n2){
                    if (uni.isEmpty() || b[j] != uni.get(uni.size() - 1)) { // Check for duplicates
                        uni.add(b[j]);
                    }
                    j++;
                }
                return uni;
            }
            public static ArrayList<Integer> unionArrOpti(int []a , int[] b){
                ArrayList<Integer> uni=new ArrayList<>();
                int i = 0 , j = 0 , n1=a.length , n2 = b.length;
                while (i<n1 && j<n2){
                    if(a[i] == b[j]){
                        if (uni.isEmpty() || a[i] != uni.get(uni.size()-1)){ //checkign for duplicates
                            uni.add(a[i]);
                        }
                        i++;
                    }
                    j++;
                    }
                    return uni;
                }
                   
                
    public static void main(String[] args)
    {
        int[] a={1,2,3,1,2,43,5,3,2,1,4,5};
        int[] b={1,2,3,4,2,1,3,43};
        ArrayList<Integer> uni=new ArrayList<>();
        uni=unionArrOpti(a, b);
        System.out.println("The Union of the given arrrays are : "+uni);
    }
}
