package list;
public class CircularSLinkedList {
    private Node head;
    private Node tail;
    private int size;
    private class Node{
        int val;
        Node next;
        public Node(int data){
            this.val=data;
        }
        public Node(int data, Node next){
            this.val = data;
            this.next=next;
        }
    }
    public void insertFront(int val){
        Node newNode = new Node(val);
        newNode.next=head;
        head =newNode;
        if(head.next==null){
            tail=head;
        }
        tail.next=head;
        //head.prev=tail;
        size++;
    }
    public void insertLast(int val){
        if(tail==null){
            insertFront(val);
            return;
        }
        Node newNode = new Node(val);
        tail.next = newNode;
        tail = newNode;
        tail.next=head;
        //head.prev=tail;
        size++;
    }
    public void insertAt(int index, int val){
        if(index==0){
            insertFront(val);
            return;
        }
        else if(index==size){
            insertLast(val);
            return;
        }
        Node temp =head;
        for(int i=0;i<index-1;i++){
            temp =temp.next;
        }
        Node newNode = new Node(val);
        newNode.next=temp.next;
        temp.next=newNode;
        size++;
    }
    public int deleteFront(){
        int data = head.val;
        head = head.next;
        tail.next=head;
        //head.prev=tail;
        size--;
        return data;
    }
    public int deleteLast(){
        Node temp = head;
        while(temp.next.next!=head){
            temp=temp.next;
        }
        int data = temp.next.val;
        tail=temp;
        tail.next=head;
        //head.prev=tail;
        size--;
        return data;
    }
    public void display(){
        Node temp = head;
        while(temp.next!=head){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.print(tail.val+"->");
        System.out.println("END");
    }
    public static void main(String[] args) {
        CircularSLinkedList csl = new CircularSLinkedList();
        System.out.println(csl.head);
        System.out.println(csl.tail);
        System.out.println(csl.size);
        csl.insertFront(10);
        csl.insertFront(20);
        csl.insertFront(30);
        csl.display();
        csl.insertLast(40);
        csl.insertLast(50);
        csl.display();
        csl.insertAt(3, 60);
        csl.display();
        System.out.println(csl.deleteFront());
        System.out.println(csl.deleteLast());
        csl.display();        
        System.out.println("head: "+csl.head.val);
        System.out.println("tail: "+csl.tail.val);
        System.out.println("size: "+csl.size);
    }
}