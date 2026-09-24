class Sorting{


    public static void bubbleSort(int[] arr){

        int n = arr.length;

        boolean swapped;

        for(int i =0; i<n; i++){
            swapped = false;

            //  2, 3, 1, 4, 6

            //  2 > 3 = no swap
            //  3 > 6 = no swap
            //  6 > 1 = swap
            //  6 > 4 = swap


            //  2, 1, 3, 4, 6

            //  2 > 3 = no swap
            //  3 > 1 = swap
            //  3 > 4 = no swap


            //  1, 2, 3, 4, 6

            //  2 > 1 = swap 
            //  2 > 3 = no swap



            //  1, 2, 3, 4, 6

            //  1 > 2 = no swap


            for(int j=0;j < n - 1 - i;j++){

                if(arr[j] > arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;

                }
            }


            if(!swapped){
                break;
            }

        }

    }


    public static void insertionSort(int[] arr){
        int n = arr.length;
        // 4, 2, 1, 5, 3
        for (int i = 1; i < n; i++){
                int key = arr[i];
                int j = i - 1;

                while(j>= 0 && arr[j] > key){
                    arr[j+1] = arr[j];
                    j = j - 1;
                }

                arr[j+1] = key;
            }

    }


    public static void selectionSort(int[] arr){

        int n = arr.length;
        //  2 ,5 , 1, 4, 3

        for (int i = 0; i < n - 1; i++){

            int minInx = i;

            for (int j = i + 1; j < n;j++){
                if (arr[j] < arr[minInx]){
                    minInx = j;
                }
            }

            if (minInx != i){
                int temp = arr[minInx];
                arr[minInx] = arr[i];
                arr[i] = temp;
            }

        }

    }

    public static void main(String[] args){


        int[] arr = { 4, 2, 1, 5, 3};

        System.out.println("before swap :");
        for(int value: arr){
            System.out.print(value+" ");
        }

        selectionSort(arr);

        System.out.println();
        System.out.println("after swap : ");
        for(int value: arr){
            System.out.print(value+" ");
        }



    }

}