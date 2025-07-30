package Basic;

public class arraygay {
    public static void prntArr(int[] arr)
    {
        int counter = 0;
        for (int a : arr) {
            System.out.print(a);
            counter++;
            if (counter != arr.length ) System.out.print(" , ");
        }
    }



    public static void main(String[] args) {



        int [] arr= {1,2,3,4,5};

        try{
            for (int i = 0 ; i < 5 ; i++) {
                System.out.println(arr[6]);
                System.out.println(arr[i]);
            }
            }catch (Exception e){
                System.out.println(e.getMessage());
        }
        finally {
            prntArr(arr);
        }



    }
}
