package MonotonicStack;

public class TrappingRainWater {
    public static int bruteApproach(int[] arr) {
        /*Approach: For each index, we have to find the amount of arr that can be stored and we have to sum it up.
        If we observe carefully the amount the arr stored at a particular index is the minimum of maximum elevation to 
        the left and right of the index minus the elevation at that index
         */
        int n = arr.length;
        int waterTrapped = 0;
        for (int i = 0; i < n; i++) {
            int j = i;
            int leftMax = 0, rightMax = 0;
            while (j >= 0) {
                leftMax = Math.max(leftMax, arr[j]);
                j--;
            }
            j = i;
            while (j < n) {
                rightMax = Math.max(rightMax, arr[j]);
                j++;
            }
            waterTrapped += Math.min(leftMax, rightMax) - arr[i];
        }
        return waterTrapped;
    }

    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] height2 = {4, 2, 0, 3, 2, 5};
    }
}
