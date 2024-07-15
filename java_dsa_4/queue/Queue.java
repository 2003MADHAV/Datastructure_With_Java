package queue;
public class Queue {
    int[] que = new int[5];
    int size=0,front=0,rear=0;
    public void enqueue(int val){
        if(!isFull()){
            que[rear] = val;
            rear++;
            size++;
        }
        else
            System.out.println("Queue is Full");
    }
    public int dequeue(){
        int data = -1;
        if(!isEmpty()){
            data = que[front];
            for(int i=1;i<size;i++)
                que[i-1]=que[i];
            rear--;
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
        for(int i=0;i<size;i++)
            System.out.print(que[i]+" ");
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
