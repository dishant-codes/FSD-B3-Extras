class Node{
    int value;
    Node left;
    Node right;

    Node(int value){
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class BinarySearchTree {

    Node root;

    BinarySearchTree(){
        this.root = null;
    }

    public void insert(int value){
        root = insertNode(root, value);
    }


    public Node insertNode(Node root, int key){
        if (root == null){
            root = new Node(key);
            return root;
        }
        if (root.value < key){
            root.right = insertNode(root.right, key);
        }else if (root.value > key){
            root.left = insertNode(root.left, key);
        }
        return root;
    }

    public void inorderedTraverse(){
        inOrdered(root);
    }

    public void inOrdered(Node root){
        if (root != null){
            inOrdered(root.left);
            System.out.println(root.value);
            inOrdered(root.right);
        }
    }


    static void main(String[] args) {

        int[] arr = {50,30,20,40,70,60,80};
        BinarySearchTree bst = new BinarySearchTree();



        for (int val: arr){
            bst.insert(val);
        }

        bst.inorderedTraverse();

    }
}
