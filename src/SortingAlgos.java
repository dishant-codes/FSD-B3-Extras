void bubbleSort(int[] arr){

    //  3, 1, 7, 2, 5
    int n = arr.length;
    for (int i = 0; i < n; i++){
       for (int j = 1; j < n; j++){
           if (arr[j] < arr[j-1]){
               int temp = arr[j];
               arr[j] = arr[j-1];
               arr[j-1] = temp;
           }
       }
    }
}


void selectionSort(int[] arr){
    int n = arr.length;
    for (int i= 0; i<n; i++){

        int minIdx = i;

        for (int j = i+1; j< n; j++){
           if (arr[minIdx] > arr[j]){
               minIdx = j;
           }
        }

        int temp = arr[i];
        arr[i] = arr[minIdx];
        arr[minIdx] = temp;
    }


}


void main(String[] args) {

    int[] arr = { 3, 1, 7, 2, 5};

//    bubbleSort(arr);
    selectionSort(arr);

    for (int item: arr){
        System.out.println(item);
    }
}