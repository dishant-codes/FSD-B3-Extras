public class LoopingStatements {
    public static void main(String[] args) {

        // System.out.println("Hello upGrad");
        // System.out.println("Hello upGrad");
        // System.out.println("Hello upGrad");
        // System.out.println("Hello upGrad");
        // System.out.println("Hello upGrad");
        // System.out.println("Hello upGrad");


        int n = 10;
        int i = 1;


        while(i <= n){

            if (i == 5) {
                // break;
                i++;
                continue;
            }
            System.out.println("Hello upGrad = "+ i);
            i++;
        }

    }
}
