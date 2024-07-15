package heap;
import java.util.Arrays;
public class MinHeap {
    private int[] heap;
    private int size;
    private int maxSize;
    public MinHeap(int maxsize){
        this.maxSize=maxsize;
        this.size=0;
        this.heap = new int[maxSize];
    }
    public int parent(int pos){
        return (pos-1)/2;
    }
    public int leftChild(int pos){
        return (2*pos)+1;
    }
    public int rightChild(int pos){
        return (2*pos)+2;
    }
    public void swap(int fpos, int spos){
        int temp = heap[fpos];
        heap[fpos] = heap[spos];
        heap[spos] = temp;
    }
    public void heapifyUp(int pos){
        int current=pos;
        while(heap[current]<heap[parent(current)]){
            swap(current,parent(current));
            current = parent(current);
        }
    }
    public void insert(int val){
        if(size>=maxSize){
            System.out.println("Heap is Full");
            return;
        }
        heap[size++]=val;
        heapifyUp(size-1);
    }
    public void printHeap(){
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i]+" ");
        }
        System.out.println();
    }
    public void heapifyDown(int pos){
        if(pos<size/2){
            int left = leftChild(pos);
            int right = rightChild(pos);
            int smallest=pos;
            if(left<size && heap[left]<heap[pos])
                smallest = left;
            if(right<size && heap[right]<heap[pos])
                smallest = right;
            if(smallest!=pos){
                swap(pos,smallest);
                heapifyDown(smallest);
            }
        }
    }
    public int extractMin(){
        int min = heap[0];
        heap[0] = heap[--size];
        heapifyDown(0);
        return min;
    }
    public static void main(String[] args) {
        MinHeap mnh = new MinHeap(10);
        mnh.insert(73);
        mnh.insert(6);
        mnh.insert(57);
        mnh.insert(88);
        mnh.insert(60);
        mnh.insert(42);
        mnh.insert(83);
        mnh.insert(72);
        mnh.insert(48);
        mnh.insert(85);
        mnh.printHeap();
        System.out.println(mnh.extractMin());
        mnh.printHeap();
    }
}