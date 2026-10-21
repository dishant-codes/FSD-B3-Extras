import java.util.*;
public class AdjacencyList {


    public static void printAdjancencyList(List<List<Integer>> graph){

        for (int i = 0; i < graph.size(); i++){

            System.out.print(i + " -> ");

            for (int j: graph.get(i)){
                System.out.print(j+ " ");
            }

            System.out.println();
        }

    }

    static void main(String[] args) {

        List<List<Integer>> graph = new ArrayList<>();

        int n = 4;

        for (int i = 0; i < n; i++){
            graph.add(new ArrayList<>());
        }


        graph.get(0).add(3);
        graph.get(1).add(3);
        graph.get(2).add(3);
//       for Undirected Graph
//        graph.get(3).add(0);
//        graph.get(3).add(1);
//        graph.get(3).add(2);

        printAdjancencyList(graph);

        // 0 -> 3
        // 1 -> 3
        // 2 -> 3

    }

}
