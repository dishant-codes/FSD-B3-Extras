import java.util.Scanner;

public class AdjacencyMatrix {

    static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        IO.println("Enter number of vertices");
        int v = sc.nextInt();


        int[][] graph = new int[v][v];


        System.out.println("Enter number of edges:");
        int edges = sc.nextInt();


        System.out.println("Enter Edges :");



        for (int i = 0; i < edges; i++){
            System.out.println("Source :");
            int src = sc.nextInt();

            System.out.println("Destination :");
            int dest = sc.nextInt();

            graph[src][dest] = 1;
            graph[dest][src] = 1; // undirected graph
        }


        System.out.println("\n Adjancency Matrix: ");


        for (int i =0; i < v; i++){
            for (int j = 0; j < v; j++){
                System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }


    }

}
