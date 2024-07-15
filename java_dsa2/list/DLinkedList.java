package list;
public class DLinkedList {
    private Node head=null;
    private Node tail=null;
    private int size;
    public DLinkedList(){
        this.size=0;
    }
    private class Node{
        int val;
        Node prev;
        Node next;
        public Node(int data){
            this.val = data;
        }
        public Node(int data, Node prev, Node next){
            this.val = data;
            this.prev = prev;
            this.next = next;
        }
    }
    public void insertFront(int val){
        Node newNode = new Node(val);
        if(head==null){
            head=tail=newNode;
        }
        else{
            newNode.next=head;
            head.prev=newNode;
            head = newNode;
        }
        size++;
    }
    public void insertLast(int val){
        Node newNode = new Node(val);
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
        size++;
    }
    public void insertAt(int index,int val){
        if(index==0){
            insertFront(val);
            return;
        }
        else if(index==size){
            insertLast(val);
            return;
        }
        else if(index>size){
            System.out.println("Not possible");
            return;
        }
        Node temp = head;
        for(int i=0;i<index-1;i++)
            temp=temp.next;
        Node newNode = new Node(val);
        newNode.next=temp.next;
        temp.next.prev=newNode;
        temp.next=newNode;
        newNode.prev=temp;
        size++;
    }
    public int deleteFront(){
        if(head==null)
            return -1;
        int data = head.val;
        head = head.next;
        head.prev = null;
        size--;
        return data;
    }
    public int deleteLast(){
        int data = tail.val;
        tail = tail.prev;
        tail.next=null;
        size--;
        return data;
    }
    public int deleteAt(int index){
        if(index==0)
            return deleteFront();
        else if(index==size-1){
            return deleteLast();
        }
        else if(index>=size)
            return -1;
        Node temp = head;
        for(int i=0;i<index-1;i++)
            temp = temp.next;
        int data = temp.next.val;
        temp.next=temp.next.next;
        temp.next.next.prev=temp;
        size--;
        return data;
    }
    public int delete(int val){
        /*write yoru code*/
        return 0;
    }
    public int search(int val){
        if(head.val==val)
            return 0;
        else if(tail.val==val)
            return size-1;
        else{
            int ind=0;
            Node temp =head;
            while(temp!=null){
                if(temp.val==val)
                    return ind;
                ind++;
                temp=temp.next;
            }
        }
        return -1;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public void displayRev(){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.prev;
        }
        System.out.println("START");
    }
    public static void main(String[] args) {
        DLinkedList dl = new DLinkedList();
        System.out.println("head: "+dl.head);
        System.out.println("tail: "+dl.tail);
        System.out.println("size: "+dl.size);
        dl.insertFront(10);
        dl.insertFront(20);
        dl.insertFront(30);
        dl.insertFront(40);
        dl.insertFront(50);
        dl.display();
        dl.displayRev();
        dl.insertLast(60);
        dl.insertLast(70);
        dl.display();
        dl.insertAt(7, 80);
        dl.display();
        System.out.println(dl.deleteFront());
        dl.display();
        System.out.println(dl.deleteLast());
        dl.display();
        System.out.println(dl.deleteAt(3));
        dl.display();
        System.out.println("search: "+dl.search(70));
        System.out.println("head: "+dl.head.val);
        System.out.println("tail: "+dl.tail.val);
        System.out.println("size: "+dl.size);        
    }
}