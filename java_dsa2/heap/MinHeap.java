package heap;
public class MinHeap {
    private int size;
    private int maxSize;
    private int[] heap;
    public MinHeap(int maxsize){
        this.maxSize=maxsize;
        this.size=0;
        this.heap = new int[maxSize];
    }
    private int parent(int pos){
        return (pos-1)/2;
    }
    private int leftChild(int pos){
        return(2*pos+1);
    }
    private int rightChild(int pos){
        return(2*pos+2);
    }
    public void swap(int fpos, int spos){
        int temp = heap[fpos];
        heap[fpos] = heap[spos];
        heap[spos] = temp;
    }
    public void heapifyUp(int pos){
        int current = pos;
        while(heap[current]<heap[parent(current)]){
            swap(current,parent(current));
            current=parent(current);
        }
    }
    public void insert(int val){
        if(size>=maxSize)
            return;
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
            int largest = pos;
            if(left<size && heap[left]<heap[largest])
                largest = left;
            if(right<size && heap[right]<heap[largest])
                largest = right;
            if(largest!=pos){
                swap(pos,largest);
                heapifyDown(largest);            
            }
        }
    }
    public int extractMin(){
        int max = heap[0];
        heap[0] = heap[--size];
        heapifyDown(0);
        return max;
    }
    public static void main(String[] args) {
        MinHeap mnh = new MinHeap(10);
        mnh.insert(51);
        mnh.insert(28);
        mnh.insert(17);
        mnh.insert(48);
        mnh.insert(14);
        mnh.insert(99);
        mnh.printHeap();
        System.out.println(mnh.extractMin());
        mnh.printHeap();        
        System.out.println(mnh.extractMin());
        mnh.printHeap();        
        System.out.println(mnh.extractMin());
        mnh.printHeap();        
    }
}