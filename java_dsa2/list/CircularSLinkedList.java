package list;
public class CircularSLinkedList {
        private Node head;
    private Node tail;
    private int size;
    public CircularSLinkedList(){
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
        tail.next=head;
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
    public void display(){
        Node temp = head;
        while(temp.next!=head){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.print(tail.val+"->");
        System.out.println("END");
    }
    public int deleteLast(){
        int data;
        if(head==null)
            return -1;
        else{
            Node temp = head;
            while(temp.next.next!=head){
                temp=temp.next;
            }
            data = temp.next.val;
            tail = temp;
            tail.next=head;
            size--;
        }
        return data;
    }
    public static void main(String[] args) {
        CircularSLinkedList csl = new CircularSLinkedList();
        csl.insertFront(10);
        csl.insertFront(20);
        csl.insertFront(90);
        csl.insertLast(50);
        csl.insertLast(100);
        csl.display();
        csl.insertAt(3,200);
        csl.display();
        System.out.println(csl.deleteLast());
        csl.display();
        System.out.println("head:"+csl.head.val);
        System.out.println("tail:"+csl.tail.val);
        System.out.println(csl.size);
    }
}