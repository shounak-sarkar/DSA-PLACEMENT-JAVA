public class FloorCeil {
    //given a number x
    // floor is the largest number <= x
    // ceil is the smallest number >= x
    // 10 20 30 40 50     "25"
    public static int floor(int[] arr , int x ) {
        int floorval = -1;
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x){
                return arr[mid];
            }
            if (arr[mid] <= x) {
                floorval = arr[mid];
                low = mid + 1;
            } else {
                high=mid-1;
            }

        }
        return floorval;
    }
    public static int ceil(int[] arr , int x ){
        int ceilval=-1;
        int low = 0,high=arr.length-1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                return arr[mid]; // exact match
            } else if (arr[mid] >= x) {
                ceilval = arr[mid]; // possible ceil
                high = mid - 1;     // move left
            } else {
                low = mid + 1;
            }

        }
        return ceilval;
    }




    public static void main(String[] args) {
        int[] arr={10 , 20 , 30 , 40 ,50};
        int x=25;
        int ceil=ceil(arr,x);
        int floor=floor(arr,x);
        System.out.printf("\nCeiling Value of %d is %d ",x,ceil);
        System.out.printf("\nFloor Value of %d is %d ",x,floor);
    }
}
