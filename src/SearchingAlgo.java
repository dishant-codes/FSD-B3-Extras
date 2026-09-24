public class SearchingAlgo {
    public static int linearSearch(int[] arr, int target){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target){

        int left = 0;
        int right = arr.length-1;

        while(left <= right){

            int mid = (left + right) / 2;

            if (arr[mid] == target){
                return mid;
            }

            if (arr[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }

        }

        return -1;
    }

    public static boolean linearSearch2D(int[][] arr, int target){


        for(int i=0; i < arr.length;i++){

            for(int j=0; j < arr[i].length; j++){

                if (arr[i][j] == target) {
                    return true;
                }

            }
        }

        return false;
    }


    public static int[] binarySearch2D(int[][] matrix, int target){


        int rows = matrix.length;
        int cols = matrix[0].length;


        int left = 0;
        int right = rows * cols - 1; // 8-0

        while(left <= right){

            int mid = left + (right-left) / 2; // 7

            int midValue = matrix[mid / cols][mid % cols];

            if (midValue == target){
                return new int[]{mid / cols, mid % cols};
            }else if (midValue < target){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }

        }

     return new int[]{-1,-1};
    }


    static void main(String[] args) {
//        int arr[] = {3,6,8,9,12};
//        int target = 9;
//        int result = binarySearch(arr, target);
//
//        if (result == -1){
//            System.out.println("Element Not Found");
//        }
//        else {
//            System.out.println("Element found at "+result);
//        }


        int[][] arr = {
                {3,4,5},
                {6,7,9},
                {10,11,12}
        };

        int target = 8;
        int[] result = binarySearch2D(arr, 7);


        System.out.println("Element found at row "+result[0]+" and cols "+result[1]);

//        if (binarySearch2D(arr, target)) {
//            System.out.println("Element Found in given array");
//        }
//        else{
//            System.out.println("Element Not Found");
//        }


    }
}
