package tree;
import java.util.Scanner;
public class BinaryTree {
    private Node root;
    Scanner scan = new Scanner(System.in);
    private class Node{
        int val;
        Node left;
        Node right;
        public Node(int value){
            this.val=value;
        }
    }
    public void populate(){
        System.out.println("Enter root node value:");
        int data = scan.nextInt();
        root = new Node(data);
        populate(root);
    }
    public void populate(Node node){
        System.out.println("Do you want to add left node of "+node.val);
        boolean left = scan.nextBoolean();
        if(left){
            System.out.println("Enter left node value of "+node.val);
            int value = scan.nextInt();
            node.left = new Node(value);
            populate(node.left);
        }
        System.out.println("Do you want to add right node of "+node.val);
        boolean right = scan.nextBoolean();
        if(right){
            System.out.println("Enter right node value of "+node.val);
            int value = scan.nextInt();
            node.right = new Node(value);
            populate(node.right);
        }        
    }
    public void display(){
        if(root==null)
            return;
        display(root);
    }
    public void display(Node node){
        if(node==null)
            return;
        System.out.print(node.val+" ");
        display(node.left);
        display(node.right);
    }

    public void preOrder(){
        if(root==null)
            return;
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
        if(root==null)
            return;
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
        if(root==null)
            return;
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
        tree.display();
        System.out.println();
        System.out.println("---preOrder Traversal of BT---");
        tree.preOrder();
        System.out.println();

        System.out.println("---inOrder Traversal of BT---");
        tree.inOrder();
        System.out.println();

        System.out.println("---postOrder Traversal of BT---");
        tree.postOrder();
        System.out.println();
    }
}