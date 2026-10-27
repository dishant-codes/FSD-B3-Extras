public class Trees {

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    public static void inorder(Node root){

        if (root != null) {
            inorder(root.left);
            System.out.print(root.data+"  ");
            inorder(root.right);
        }

    }


    public static void preorder(Node root){

        if (root != null){
            System.out.print(root.data+"  ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void postorder(Node root){

        if (root != null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+"  ");
        }

    }


    public static void main(String[] args) {

        Node tree = new Node(10);
        tree.left = new Node(5);
        tree.right = new Node(15);
        tree.left.left = new Node(2);
        tree.left.right = new Node(6);

        inorder(tree);
        System.out.println();
        preorder(tree);
        System.out.println();
        postorder(tree);


        //    left < root < right

        //     10
        //    /  \
        //   5   15
        //  / \
        // 2   6


        //inorder =  2, 5, 6, 10, 15
        //preorder = 10, 5, 2, 6, 15
        //postorder = 2, 6, 5, 15, 10


    }


}
