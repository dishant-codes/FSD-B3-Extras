public class QuickSorting {


    public static void quickSort(int[] arr, int left, int right){

        if(left < right){
            int pi = partition(arr, left, right);
            quickSort(arr, left , pi-1);
            quickSort(arr, pi+1, right);
        }

    }

    public static int partition(int[] arr, int left, int right){

            int pivot = arr[right];

            int i = left - 1;


            for (int j = left; j < right; j++){

                // place all smaller element to left of pivot
                if (arr[j] <= pivot){
                    i++;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            // to place pivot element at correct position
            int temp = arr[right];
            arr[right] = arr[i+1];
            arr[i+1] = temp;

            return i+1;
    }



    static void main(String[] args) {

        int[] arr = {3, 2, 6, 1, 5, 4};

        System.out.println("Before Sort :");
        for (int i: arr){
            System.out.print(i +" ");
        }

        quickSort(arr, 0, arr.length-1);

        System.out.println("\nAfter Sort :");
        for (int i: arr){
            System.out.print(i +" ");
        }

    }
}
