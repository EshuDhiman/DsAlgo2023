package Concepts.Tree;

class Node {
    int value;
    Node right;
    Node left;

    Node(int v) {
        value = v;
    }

    Node() {
    }
}

public class BinaryTree {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        System.out.println("inorder");
        inorder(root);
        System.out.println("preorder");
        preorder(root);
        System.out.println("postorder");
        postorder(root);

        

    }

    

    static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(root.value);
            inorder(root.right);

        }
    }
    static void preorder(Node root) {
        
        if (root != null) {
            System.out.println(root.value);
            preorder(root.left);
            preorder(root.right);
        }
    }
    static void postorder(Node root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.value);
        }
    }

}
