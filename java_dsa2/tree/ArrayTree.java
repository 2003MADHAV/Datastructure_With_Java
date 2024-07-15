package tree;
public class ArrayTree {
    int root = 0;
    String[] arr = new String[15];
    public void setRoot(String data){
        arr[root]=data;
    }
    public void setLeft(String data, int parent){
        if(arr[parent]==null){
            System.out.println("Can't be inserted..");
            return;
        }
        int left = (2*parent)+1;
        arr[left]=data;        
    }
    public void setRight(String data, int parent){
        if(arr[parent]==null){
            System.out.println("Can't be inserted..");
            return;
        }
        int right = (2*parent)+2;
        arr[right]=data;        
    }
    public void display(){
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]!=null)
                System.out.print(arr[i]+" ");
            else
                System.out.print("- ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayTree tree = new ArrayTree();
        tree.setRoot("A");
        tree.setLeft("B",0);
        tree.setRight("C",0);
        tree.setLeft("D", 1);
        tree.setRight("E", 1);
        tree.setLeft("F",2);
        tree.setRight("G",2);
        tree.setLeft("K", 6);
        tree.setLeft("M",3);
        tree.setRight("N",4);
        tree.display();
    }
}