import java.util.HashSet;
import java.util.Set;

public class Searchings {


    public static int linearSearch(int[] arr, int target){
        for (int i=0; i < arr.length;i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target){

        int low = 0;
        int high = arr.length-1;

        while(low <= high){

                    // 0 + 4 / 2
                    // 2
             //
            int mid = low + (high - low)/2;
            //        3 + (4 - 3) / 2
            //        3 + 0

            if(arr[mid] == target){
                return mid;
            }else if (arr[mid] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }

        return -1;
    }


    static void main(String[] args) {
        // target = 8
        // arr = 2, 4, 6, 8, 10, length = 5
        //       0  1  2  3  4
        int[] arr = {2, 4, 6, 8, 10 };
        System.out.println("Element Found at index "+binarySearch(arr, 8));


    }




}
