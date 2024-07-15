package tree;
import java.util.*;
public class BinaryTree{
    Scanner scan = new Scanner(System.in);
    private Node root;
    private class Node{
        int val;
        Node left;
        Node right;
        public Node(int data){
            this.val = data;
        }
    }
    public void populate(){
        System.out.println("Enter root node value:");
        int data = scan.nextInt();
        root = new Node(data);
        populate(root);
    }
    public void populate(Node node){
        System.out.println("Do you want to add left node for "+node.val);
        boolean left = scan.nextBoolean();
        if(left){
            System.out.println("Enter left node value of "+node.val);
            int data = scan.nextInt();
            node.left = new Node(data);
            populate(node.left);
        }
        System.out.println("Do you want to add right node for "+node.val);
        boolean right = scan.nextBoolean();
        if(right){
            System.out.println("Enter right node value of "+node.val);
            int data = scan.nextInt();
            node.right = new Node(data);
            populate(node.right);
        }
    }
    public void display(){
        display(root);
    }
    public void display(Node node){
        if(node==null)
            return;
        System.out.println(node.val+" ");
        display(node.left);
        display(node.right);
    }
    public void preOrder(){
        preOrder(root);
    }
    public void preOrder(Node node){
        if(node==null)
            return;
        System.out.print(node.val+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(){
        inOrder(root);
    }
    public void inOrder(Node node){
        if(node==null)
            return;
        inOrder(node.left);
        System.out.print(node.val+" ");
        inOrder(node.right);
    }
    
    public void postOrder(){
        postOrder(root);
    }
    public void postOrder(Node node){
        if(node==null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val+" ");        
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.populate();
        //tree.display();
        System.out.println("---preOrder Traversal---");
        tree.preOrder();
        System.out.println();

        System.out.println("---inOrder Traversal---");
        tree.inOrder();
        System.out.println();

        System.out.println("---postOrder Traversal---");
        tree.postOrder();
        System.out.println();

    }
}