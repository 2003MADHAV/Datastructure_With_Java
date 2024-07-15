package tree;
public class BinarySearchTree {
    private Node root;
    private class Node{
        int val;
        Node left;
        Node right;
        public Node(int data){
            this.val = data;
        }
    }
    public void createBST(int data){
        root = createBSTRec(root, data);
    }
    public Node createBSTRec(Node node, int data){
        if(node==null)
            node = new Node(data);
        else if(data<node.val)
            node.left = createBSTRec(node.left, data);
        else if(data>node.val)
            node.right=createBSTRec(node.right,data);
        return node;
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
    public int height(Node root){
        int height;
        if(root==null)
            return -1;
        else{
            int lheight = height(root.left);
            int rheight = height(root.right);
            return Math.max(lheight,rheight)+1;
        }            
    }
    public void levelOrder(){
        int height = height(root);
        for(int h=0;h<=height;h++){
            printCurrentLevel(root,h);
        }
    }
    public void printCurrentLevel(Node root, int level){
        if(root==null)
            return;
        if(level==0)
            System.out.print(root.val+" ");
        else if(level>=1){
            printCurrentLevel(root.left,level-1);
            printCurrentLevel(root.right,level-1);
        }
    }
    public void printLeftToRight(Node root, int level){
        if(root==null)
            return;
        if(level==0)
            System.out.print(root.val+" ");
        else if(level>=1){
            printLeftToRight(root.left,level-1);
            printLeftToRight(root.right,level-1);
        }
    }
    public void printRightToLeft(Node root, int level){
        if(root==null)
            return;
        if(level==0)
            System.out.print(root.val+" ");
        else if(level>=1){
            printRightToLeft(root.right,level-1);
            printRightToLeft(root.left,level-1);
        }
    }
    public void printZigZag(){
        int height = height(root);
        int flag = 0;
        for(int h=0;h<=height;h++){
            if(flag==0){
                printLeftToRight(root,h);
                flag=1;
            }
            else{
                printRightToLeft(root,h);
                flag=0;
            }
        }
    }
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.createBST(5);
        bst.createBST(3);
        bst.createBST(8);
        bst.createBST(2);
        bst.createBST(4);
        bst.createBST(6);
        bst.createBST(10);
        bst.createBST(9);
        bst.createBST(1);
        System.out.println("---preOrder Traversal of BST---");
        bst.preOrder();
        System.out.println();

        System.out.println("---inOrder Traversal of BST---");
        bst.inOrder();
        System.out.println();

        System.out.println("---postOrder Traversal of BST---");
        bst.postOrder();
        System.out.println();
        System.out.println("Height: "+bst.height(bst.root.right.left));

        System.out.println("---levelOrder Traversal---");
        bst.levelOrder();
        System.out.println();

        System.out.println("---zigzag Trversal---");
        bst.printZigZag();
    }
}