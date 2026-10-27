import java.util.*;

public class GraphTraversal {

        private int numVertices;
        private Map<Integer, List<Integer>> adjacencyList;

        public GraphTraversal(int numVertices){
            this.numVertices = numVertices;
            adjacencyList = new HashMap<>();

            for (int i = 0; i < numVertices; i++){
                adjacencyList.put(i, new LinkedList<>());
            }
        }


        public void addEdge(int source, int destination){
            adjacencyList.get(source).add(destination);
        }

        public void bfs(int startVertex){

            boolean[] visited = new boolean[numVertices];

            Queue<Integer> queue = new LinkedList<>();

            visited[startVertex] = true;

            queue.offer(startVertex);


            while(!queue.isEmpty()){

                int currentVertex = queue.poll();

                System.out.print(currentVertex+" ");


                for (int neighbor: adjacencyList.get(currentVertex)){

                    if (!visited[neighbor]){
                        visited[neighbor] = true;
                        queue.offer(neighbor);
                    }

                }
            }
        }


        public void dfs(int startVertex){
            boolean[] visited = new boolean[numVertices];


            dfsRecursive(startVertex, visited);

        }

        private void dfsRecursive(int currentVertex, boolean[] visited){

            visited[currentVertex] = true;

            System.out.print(currentVertex+" ");
            for (int neighbor: adjacencyList.get(currentVertex)){
                if (!visited[neighbor]){
                    dfsRecursive(neighbor, visited);
                }
            }


        }


    static void main(String[] args) {


            GraphTraversal graph = new GraphTraversal(5);

            graph.addEdge(0, 1);
            graph.addEdge(0, 2);
            graph.addEdge(1, 3);
            graph.addEdge(3,2);
            graph.addEdge(3,4);
            graph.addEdge(4,3);

            graph.dfs(0);
    }




}
