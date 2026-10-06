import java.util.*;

public class SortingPractice {


    public static boolean containsDuplicate(int[] arr){
        Set<Integer> visited = new HashSet<>();
        for (int val: arr){
            if(!visited.add(val)){
               return true;
            }
        }
        return false;
    }

    public static boolean containsDuplicate2(int[] arr){

        Arrays.sort(arr);

        // 2,4,1, 3, 2
        // 1, 2, 2, 3, 4

        for (int i = 1; i < arr.length; i++){
            if (arr[i] == arr[i-1]){
                return true;
            }
        }
        return false;
    }


    static void main(String[] args) {


        int[] arr = {2,4,1, 4, 3};

        System.out.println(containsDuplicate2(arr));


    }


}
