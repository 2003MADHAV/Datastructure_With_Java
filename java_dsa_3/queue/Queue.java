package queue;
public class Queue {
    int[] que = new int[5];
    int front=0,rear=0;
    int size=0;
    public void enqueue(int val){
        if(!isFull()){
            que[rear]=val;
            rear++;
            size++;
        }
        else
            System.out.println("Queue is Full");
    }
    public int dequeue(){
        int data=-1;
        if(!isEmpty()){
            data = que[0];
            for(int i=1;i<size;i++)
                que[i-1]=que[i];
            rear--;
            size--;
        }
        else
            System.out.println("Queue is Empty");
        return data;
    }
    public int getFront(){
        if(!isEmpty())
                return que[front];
        return -1;
    }
    public int getRear(){
        if(!isEmpty())
            return que[rear-1];
        return -1;
    }    
    public boolean isFull(){return size==5;}
    public boolean isEmpty(){return size==0;}    
    public void show(){
        for(int i=0;i<size;i++)
            System.out.print(que[i]+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        Queue q =  new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println("Front: "+q.getFront());
        System.out.println("Rear: "+q.getRear());
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.show();
        System.out.println(q.dequeue());
        q.show();
        q.enqueue(60);
        q.show();
        System.out.println("Front: "+q.getFront());
        System.out.println("Rear: "+q.getRear());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.show();
        System.out.println("Front: "+q.getFront());
        System.out.println("Rear: "+q.getRear());
    }
}
