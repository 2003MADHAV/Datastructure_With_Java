package list;
public class SLinkedList {
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
        newNode.next = head;
        head =  newNode;
        if(head.next==null)
            tail=head;
        size++;
    }
    public void insertLast(int val){
        if(head==null){
            insertFront(val);
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;
        tail = newNode;
        size++;
    }
    public int deleteFront(){
        int data = head.val;
        head = head.next;
        size--;
        return data;
    }
    public int deleteLast(){
        Node temp = head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        tail=temp;
        int data = temp.next.val;
        size--;
        return data;
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
    public int deleteAt(int index){
        if(index==0){
            return deleteFront();
        }
        else if(index==size){
            return deleteLast();
        }
        int data;
        Node temp = head;
        for(int i=0;i<index-1;i++){
            temp =temp.next;
        }
        data = temp.next.val;
        temp.next=temp.next.next;
        size--;
        return data;
    }
    public int delete(int val){
        int data;
        if(head.val==val){
            return deleteFront();
        }
        else if(tail.val==val){
            return deleteLast();        
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
        int ind=0;
        Node temp =head;
        while(temp!=null){
            if(temp.val==data)
                return ind;
            ind++;
            temp=temp.next;
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
    public int getMiddle(){
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
        System.out.println(sl.head);
        System.out.println(sl.tail);
        System.out.println(sl.size);
        //sl.insertFront(10);
        //sl.insertFront(20);
        //sl.insertFront(30);
        sl.insertLast(1);
        sl.insertLast(2);
        sl.insertLast(3);
        sl.insertLast(4);
        sl.insertLast(5);
        sl.insertLast(6);
        //sl.insertLast(90);
        //sl.insertLast(150);
        sl.display();
        System.out.println(sl.getMiddle());
        /*
        System.out.println(sl.deleteFront());
        sl.display();
        System.out.println(sl.deleteLast());
        sl.display();
        sl.insertAt(4,100);
        sl.insertAt(2,200);
        sl.display();
        System.out.println(sl.deleteAt(1));
        sl.display();
        System.out.println(sl.delete(50));
        sl.display();
        System.out.println("search: "+sl.search(50));
        */
    }
}