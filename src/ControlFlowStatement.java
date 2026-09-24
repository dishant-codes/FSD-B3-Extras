import java.util.Scanner;

class ControlFlowStatement{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        System.out.println("Have you Completed CET? (YES/NO)");
//        String isCETCompleted = scan.nextLine();
//
//
//        if (isCETCompleted.equals("YES")) {
//            System.out.println("You can Apply for PG");
//        }
//        else if (isCETCompleted.equals("NO")){
//            System.out.println("You need to Qualify CET exam");
//        }
//        else {
//            System.out.println("Invalid Answer");
//        }

//        System.out.println("Language Fluency :");
//
//        System.out.println("For English (1-Beginner, 2-Intermediate, 3-Native)");
//        int choice = scan.nextInt();
//
//        switch (choice){
//            case 1:
//                System.out.println("Not Eligible"); break;
//            case 2:
//                System.out.println("Eligible"); break;
//            case 3:
//                System.out.println("Perfect Match"); break;
//            default:
//                System.out.println("Invalid Choice");
//        }


        // for(init; condition; increment/decrement)


//        for(int step=1; step <= 5; step++){
//            System.out.println("Step "+step);
//        }



//        for (int i = 1; i<=10; i++){
//            int num = 5;
//
//            System.out.println(num*i);
//        }


        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        int n = 5;
        for (int i = 0; i < n;i++){
//            System.out.println("* * * * *");

            // k = 0, n = 5, i = 0
            //  0 < 5-0 = 5   :  k < 5
            //  0 < 5-1 = 4   :  k < 4
            //  0 < 5-2 = 3   :  k < 3

            for (int k = 0; k < n-i; k++){
                System.out.print(" ");
            }

            ///   j = 0 , i = 0
           ///    j = 0 , i = 1
          ///     j = 0 , i = 2

            //   *
            //  * *
            // * * *
            for (int j = 0; j< i; j++){
                System.out.print("* ");
            }

            System.out.println("");
        }


        // * * * * *
        // *       *
        // *       *
        // *       *
        // * * * * *


        // * * * * *
        // *       *
        // * * * *
        // *       *
        // * * * * *


        for (int i =0; i < 10; i++){

            if (i == 5) continue;

            System.out.println(i);

        }





    }

}