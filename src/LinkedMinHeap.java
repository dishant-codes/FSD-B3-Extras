import java.util.NoSuchElementException;

public class LinkedMinHeap {

    public static class Node{

        int val;
        Node left;
        Node right;
        Node parent;

        Node(int val){
            this.val = val;
        }

    }

    private Node root;
    private int size;


    public LinkedMinHeap(){
        this.root = null;
        this.size = 0;
    }

    public void push(int val){

        Node newNode = new Node(val);
        size++;

        if (size == 1){
            root = newNode;
            return;
        }

        Node parent = getNodeAt(size/2);
        newNode.parent = parent;

        if (parent.left == null){
            parent.left = newNode;
        }
        else {
            parent.right = newNode;
        }

        siftUp(newNode);
    }

    public Node getNodeAt(int index){


        String binaryString = Integer.toBinaryString(index);
        // 4
        // 0000, 0001, 0010, 0011, 0100
        // path = 0100

        //  0, 1, 0, 0
        //  0  1  2  3

        Node curr = root;
//        System.out.println(path);
//


        // 1 0 0
        // 0 1 2

        for (int i = 1; i < binaryString.length(); i++){

            if (binaryString.charAt(i) == '0'){
                curr = curr.left;
            }
            else {
                curr = curr.right;
            }

        }
        return curr;
    }


    public void siftUp(Node node){
        while(node.parent != null && node.val < node.parent.val){
            int temp = node.val;
            node.val = node.parent.val;
            node.parent.val = temp;

            node = node.parent;
        }

    }




    public int pop(){

        if(size == 0){
            throw new NoSuchElementException("Heap is Empty");
        }

        int minVal = root.val;

        if(size == 1){
            root = null;
            size--;
            return minVal;
        }

        Node lastNode = getNodeAt(size);
        root.val = lastNode.val;


        Node parent = lastNode.parent;
        if (parent.left == lastNode){
            parent.left = null;
        }
        else {
            parent.right = null;
        }
        lastNode.parent = null;
        size--;

        siftDown(root);

        return minVal;
    }


    public void siftDown(Node node){
        while(node != null){

            Node smallest = node;

            if(node.left != null && node.left.val < smallest.val){
                smallest = node.left;
            }

            if (node.right != null && node.right.val < smallest.val){
                smallest = node.right;
            }


            if (smallest != node){
                int temp = node.val;
                node.val = smallest.val;
                smallest.val = temp;

                node = smallest;
            }
            else {
                break;
            }


        }
    }

    static void main(String[] args) {


        LinkedMinHeap heap = new LinkedMinHeap();

        for (int item: new int[]{10, 40, 20, 30, 50}){
            heap.push(item);
        }


        System.out.println(heap.pop());
        System.out.println(heap.pop());
        System.out.println(heap.pop());
        System.out.println(heap.pop());
        System.out.println(heap.pop());

    }
}
