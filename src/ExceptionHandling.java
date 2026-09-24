public class ExceptionHandling {


    static void main(String[] args){
        int a = 50;
        int b = 0;
        System.out.println("Division Start");
        try{
            int c;

            if (a != 0 && b != 0){
                c = a/b;
            }
            else {
               throw new ArithmeticException("number is not divisible by zero");
            }
            System.out.println("Result : "+c);
        }
        catch (ArithmeticException e){
            System.out.println("Error :"+e.getMessage());
        }
        System.out.println("End");

//




        // Array Example for Exception Handling

        int[] arr = {3,5,6,2};

        try{

            for (int i=0; i < 4; i++){

                if (i > arr.length-1){
                    throw new ArrayIndexOutOfBoundsException("Reached limit");
                }
                System.out.println(arr[i]+" -> "+i);
            }

        }
        catch (Exception e){
            System.out.println("Error : "+e.getMessage());
        }

        System.out.println("Program End");

    }

}
