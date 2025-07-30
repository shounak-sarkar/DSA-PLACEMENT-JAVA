//package arrays_easy;
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.Set;
//public class intersection {
//    public static ArrayList<Integer> intersectionBrute(int []a , int[] b){
//        ArrayList<Integer> uni=new ArrayList<>();
//        Set<Integer> uniSet= new HashSet<>();
//        for (int i : a)
//            uniSet.add(i);
//        for (int i : b)
//            uniSet.add(i);
//        for (int i : uniSet)
//            uni.add(i);
//        return uni;
//      }
//      public static ArrayList<Integer> unionArrOpt(int []a , int[] b){
//        ArrayList<Integer> uni=new ArrayList<>();
//        int i = 0 , j = 0 , n1=a.length , n2 = b.length;
//        while (i < n1 && i < n2){
//            if(a[i]==)
//            if (uni.isEmpty() || a[i] != uni.get(uni.size() - 1)) { // Check for duplicates
//        }
//    public static void main(String[] args)
//    {
//        int[] a={1,2,3,4,5};
//        int[] b={1,2,3};
//        ArrayList<Integer> uni=new ArrayList<>();
//        uni=unionArrOpt(a, b);
//        System.out.println("The Union of the given arrrays are : "+uni);
//    }
//}
