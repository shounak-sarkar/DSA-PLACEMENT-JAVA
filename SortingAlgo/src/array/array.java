package array;

import java.util.Arrays;

public class array {
    public void printArr(int[] arr){
        int counter=0;
        for (int a : arr){
            System.out.print(a);
            if (counter!=(arr.length-1)){
                System.out.print(",");
            }
            counter+=1;
        }
        System.out.println();
    }

}
