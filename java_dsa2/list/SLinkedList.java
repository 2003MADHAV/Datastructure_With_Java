package list;
public class SLinkedList {
    private Node head;
    private Node tail;
    private int size;
    public SLinkedList(){
        this.size=0;
    }
    private class Node{
        int val;
        Node next;
        public Node(int data){
            this.val = data;
        }
        public Node(int data, Node next){
            this.val = data;
            this.next = next;
        }
    }
    public void insertFront(int val){
        Node node = new Node(val);
        node.next=head;
        head =node;
        if(head.next==null){
            tail=head;
        }
        size++;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public void insertLast(int val){
        if(tail==null){
            insertFront(val);
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    public void insert(int index, int val){
        if(index==0){
            insertFront(val);
            return;
        }
        else if(index==size){
            insertLast(val);
            return;
        }
        else if(index>size){
            System.out.println("Can't be inserted..!!");
            return;
        }
        Node temp = head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        Node newNode = new Node(val);
        newNode.next=temp.next;
        temp.next=newNode;
        size++;
    }
    public int deleteFront(){
        Node temp = head;
        head = temp.next;
        size--;
        return temp.val;
    }
    public int deleteLast(){
        Node temp = head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        int data = temp.next.val;
        temp.next=null;
        tail = temp;
        size--;
        return data;
    }
    public int deleteAt(int index){
        int data;
        if(index==0)
            data = deleteFront();
        else if(index==size)
            data = deleteLast();
        Node temp=head;
        for(int i=0;i<index-1;i++)
            temp=temp.next;
        data = temp.next.val;
        temp.next = temp.next.next;
        size--;
        return data;
    }
    public int delete(int val){
        int data;
        if(head.val==val){
            data = deleteFront();
        }
        else if(tail.val==val){
            data = deleteLast();        
        }
        Node temp=head;
        while(temp.next.val!=val && temp.next!=null)
            temp = temp.next;
        data = temp.next.val;
        temp.next=temp.next.next;
        size--;
        return data;
    }
    public int search(int data){
        for(int i=0;i<size;i++){
            Node temp = head;
            int ind=0;
            while(temp!=null){
                if(temp.val==data)
                    return ind;
                temp=temp.next;
                ind++;
            }
        }
        return -1;
    }
    public int getMiddleNode(){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.val;
    } 
    public static void main(String[] args) {
        SLinkedList sl = new SLinkedList();
        sl.insertFront(10);
        sl.insertFront(20);
        sl.insertFront(90);
        sl.insertLast(50);
        sl.insertLast(100);
        sl.insertFront(30);
        sl.insertLast(60);
        sl.insertLast(160);
        sl.display();
        System.out.println("Middle Node: "+sl.getMiddleNode());
        /*
        System.out.println("head:"+sl.head.val);
        System.out.println("tail:"+sl.tail.val);
        System.out.println(sl.size);
        System.out.println("deleteFront: "+sl.deleteFront());
        sl.display();
        System.out.println("head:"+sl.head.val);
        System.out.println("tail:"+sl.tail.val);
        System.out.println(sl.size);
        System.out.println("deleteLast: "+sl.deleteLast());
        sl.display();
        sl.insertLast(100);
        sl.insertLast(200);
        sl.insertLast(900);
        sl.insert(10, 999);
        sl.display();
        System.out.println("deleteAt: "+sl.deleteAt(4));
        sl.display();
        System.out.println(sl.delete(100));
        sl.display();
        System.out.println("head:"+sl.head.val);
        System.out.println("tail:"+sl.tail.val);
        System.out.println("size: "+sl.size);
        System.out.println(sl.search(150));
        */
    }
}