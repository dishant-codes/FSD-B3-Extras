import java.util.*;

public class Dijkstra {

    static class Node{
        int vertex;
        int distance;

        public Node(int vertex, int distance){
            this.vertex = vertex;
            this.distance = distance;
        }
    }

    private int numVertices;

    private Map<Integer, List<Node>> adjacencyList;


    public Dijkstra(int numVertices){
        this.numVertices = numVertices;

        adjacencyList = new HashMap<>();


        for (int i = 0; i < numVertices; i++){
            adjacencyList.put(i, new LinkedList<>());
        }

    }


    public void addEdge(int source, int destination, int weight){
        adjacencyList.get(source).add(new Node(destination, weight));
        adjacencyList.get(destination).add(new Node(source, weight));
    }



    public void shortestPath(int source){

        PriorityQueue<Node> priorityQueue = new PriorityQueue<>(numVertices, Comparator.comparingInt(node -> node.distance));


        int[] distance = new int[numVertices];

        Arrays.fill(distance, Integer.MAX_VALUE);

        distance[source] = 0;

        priorityQueue.offer(new Node(source, 0));


        while(!priorityQueue.isEmpty()){

            int u = priorityQueue.poll().vertex;

            for (Node neighbor: adjacencyList.get(u)){
                int v = neighbor.vertex;
                int weight = neighbor.distance;

                int newDistance = distance[u] + weight;

                if (newDistance < distance[v]){
                    distance[v] = newDistance;
                    priorityQueue.offer(new Node(v,newDistance));
                }
            }
        }

        for (int i = 0; i < numVertices; i++){
            System.out.println("Vertex "+i+" : "+ distance[i]);
        }
    }


    static void main(String[] args) {

        int numVertices = 5;

        Dijkstra dijkstra = new Dijkstra(numVertices);


        dijkstra.addEdge(0,1,4);
        dijkstra.addEdge(0,2,8);
        dijkstra.addEdge(1,2,1);
        dijkstra.addEdge(1,3,3);
        dijkstra.addEdge(2,3,1);
        dijkstra.addEdge(3,4,7);


        dijkstra.shortestPath(0);

    }





}
