package Arrays;
public class ArrayUtil {
    public void printArr(int[] arr) {
        System.out.print("[ ");
        if (arr != null && arr.length > 0) { // Check for null or empty array
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
                if (i < arr.length - 1) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println(" ]");
    }
}