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
            this.val=data;
        }
        public Node(int data, Node prev, Node next){
            this.val = data;
            this.prev = prev;
            this.next=next;
        }
    }
    public void insertFront(int val){
        Node newNode = new Node(val);
        if(head==null){
            head=tail=newNode;
        }
        else{
            newNode.next = head;
            head.prev=newNode;
            head =  newNode;
        }
        size++;
    }
    public void insertLast(int val){
        if(head==null){
            insertFront(val);
            return;
        }
        Node newNode = new Node(val);
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
        size++;
    }
    public void insertAt(int index, int val){
        if(index==0){
            insertFront(val);return;
        }
        else if(index==size){
            insertLast(val);return;
        }
        else if(index>size){
            System.out.println("Out of bound");return;
        }
        Node temp = head;
        int i=0;
        while(i<index-1){
            temp=temp.next;
            i++;
        }
        Node newNode = new Node(val);
        newNode.next=temp.next;
        temp.next.prev = newNode;
        temp.next = newNode;
        newNode.prev=temp;
        size++;
    }
    public int deleteFront(){
        int data=head.val;
        head = head.next;
        size--;
        return  data;
    }
    public int deleteLast(){
        if(head==null)
            return -1;
        int data = tail.val;
        tail = tail.prev;
        tail.next=null;
        size--;
        return data;
    }
    public int deleteAt(int index){
        if(index==0)
            return deleteFront();
        else if(index==size)
            return deleteLast();
        int data;
        Node temp = head;
        for(int i=0;i<index-1;i++){
            temp =temp.next;
        }
        data = temp.next.val;
        temp.next.next.prev=temp;
        temp.next=temp.next.next;
        size--;
        return data;
    }
    public int delete(int val){
        if(head.val==val)
            return deleteFront();
        else if(tail.val==val)
            return deleteLast();
        Node temp = head;
        while(temp.next.val!=val){
            temp = temp.next;
        }
        int data = temp.next.val;
        temp.next.next.prev=temp;
        temp.next=temp.next.next;
        size--;
        return data;
    }
    public int search(int val){
        if(head.val==val)
            return 0;
        else if(tail.val==val)
            return size-1;
        else{
            Node temp = head;
            int ind=0;
            while(temp!=null){
                if(temp.val==val)
                    return ind;
                temp=temp.next;
                ind++;
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
        dl.display();
        dl.displayRev();
        dl.insertLast(40);
        dl.insertLast(50);
        dl.insertLast(60);
        dl.insertLast(70);
        dl.insertLast(80);
        dl.insertLast(90);
        dl.display();
        dl.deleteFront();
        dl.display();
        dl.deleteAt(2);
        dl.display();
        System.out.println(dl.deleteLast());
        dl.display();
        dl.insertAt(3, 100);
        dl.display();
        System.out.println(dl.delete(60));
        dl.display();
        System.out.println(dl.search(50));
        System.out.println("head: "+dl.head.val);
        System.out.println("tail: "+dl.tail.val);
        System.out.println("size: "+dl.size);
    }
}