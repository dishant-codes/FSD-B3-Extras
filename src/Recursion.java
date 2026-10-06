public class Recursion {

    public static int factorial(int n){
        if (n <= 1){
            return 1;
        }
        return n * factorial(n-1);
    }

    public static int sum(int[] arr,int i){
        if (i <= 0){
            return arr[0];
        }
        return arr[i] + sum(arr,i-1);
    }

    static void main(String[] args) {

        // formula = f(n) = f(n-1) + f(n-2)
        // 0 , 1, 1, 2 , 3, 5, 8, 13

        int n = 5;
        System.out.println("Factorial of 5 is "+factorial(n));

        int[] arr = {20, 40, 12, 54};
        System.out.println("Sum of array element is "+sum(arr, arr.length-1));

    }


}
