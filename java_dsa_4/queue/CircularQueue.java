package queue;
public class CircularQueue {
    int capacity = 5;
    int[] que = new int[capacity];
    int size=0,front=0,rear=0;
    public void enqueue(int val){
        if(!isFull()){
            que[rear] = val;
            rear = (rear+1)%capacity;
            size++;
        }
        else
            System.out.println("Queue is Full");
    }
    public int dequeue(){
        int data = -1;
        if(!isEmpty()){
            data = que[front];
            rear=(rear+1)%capacity;
            front++;
            size--;
        }
        else
            System.out.println("Queue is Empty");
        return data;
    }
    public int getFront(){return que[front];}
    public int getRear(){return que[rear-1];}
    public boolean isFull(){return size==5;}
    public boolean isEmpty(){return size==0;}
    public void show(){
        for(int i=front;i<size;i++)
            System.out.print(que[(front+i)%capacity]+" ");
        System.out.println("");
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.show();
        q.enqueue(60);
        System.out.println("Front: "+q.getFront());
        System.out.println("Rear: "+q.getRear());
        System.out.println(q.isFull());
        System.out.println(q.isEmpty());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.show();
    }    
}
