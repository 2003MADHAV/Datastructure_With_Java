package tree;
public class BinarySearchTree {
    private Node root;
    private class Node{
        int val;
        Node left;
        Node right;
        public Node(int value){
            this.val=value;
        }
    }
    public void insertBST(int data){
        root = insertBSTRec(root,data);
    }
    public Node insertBSTRec(Node node,int data){
        if(node==null)
            node = new Node(data);
        if(data < node.val)
            node.left=insertBSTRec(node.left,data);
        else if(data > node.val)
            node.right = insertBSTRec(node.right,data);
        return node;
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
    public int height(Node node){
        if(node==null)
            return -1;
        else{
            int lheight = height(node.left);
            int rheight = height(node.right); 

            return Math.max(lheight, rheight)+1;
        }
    }
    public void levelOrder(){
        int height = height(root);
        for(int h=0;h<=height;h++){
            printCurrentLevel(root,h);
        }
    }
    public void printCurrentLevel(Node node, int level){
        if(node==null)
            return;
        if(level==0)
            System.out.print(node.val+" ");
        else if(level>=1){
            printCurrentLevel(node.right,level-1);
            printCurrentLevel(node.left,level-1);            
        }
    }
    public int depth(Node root, int x){
        if(root==null)
            return -1;
        int dist=-1;
        if((root.val==x) || (dist=depth(root.left,x))>=0 || (dist=depth(root.right,x))>=0)
            return dist+1;
        return dist;
    }
    public void printLeftToRight(Node node, int level){
        if(node==null)
            return;
        if(level==0)
            System.out.print(node.val+" ");
        else if(level>=1){
            printLeftToRight(node.left,level-1);
            printLeftToRight(node.right,level-1);
        }
    }
    public void printRightToLeft(Node node, int level){
        if(node==null)
            return;
        if(level==0)
            System.out.print(node.val+" ");
        else if(level>=1){
            printRightToLeft(node.right,level-1);
            printRightToLeft(node.left,level-1);            
        }
    }
    public void printZigZag(){
        int height = height(root);
        int flag = 0;
        for(int h=0;h<=height;h++){
            if(flag == 0){
                printLeftToRight(root,h);
                flag = 1;
            }
            else{
                printRightToLeft(root,h);
                flag=0;
            }
        }    
    }
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insertBST(5);bst.insertBST(3);
        bst.insertBST(7);bst.insertBST(4);
        bst.insertBST(2);bst.insertBST(6);
        bst.insertBST(8);bst.insertBST(9);
        bst.insertBST(12);bst.insertBST(10);
        System.out.println("---preOrder Traversal of BST---");
        bst.preOrder();
        System.out.println();

        System.out.println("---inOrder Traversal of BST---");
        bst.inOrder();
        System.out.println();

        System.out.println("---postOrder Traversal of BST---");
        bst.postOrder();
        System.out.println();

        System.out.println("Height: "+bst.height(bst.root));

        System.out.println("---levelOrder Traversal---");
        bst.levelOrder();
        System.out.println(); 
        
        System.out.println("---ZigZag Traversal---");
        bst.printZigZag();
    }
}