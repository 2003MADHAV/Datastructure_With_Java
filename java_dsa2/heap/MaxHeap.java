package heap;
public class MaxHeap {
    private int size;
    private int maxSize;
    private int[] heap;
    public MaxHeap(int maxsize){
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
        while(heap[current]>heap[parent(current)]){
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
            if(left<size && heap[left]>heap[largest])
                largest = left;
            if(right<size && heap[right]>heap[largest])
                largest = right;
            if(largest!=pos){
                swap(pos,largest);
                heapifyDown(largest);            
            }
        }
    }
    public int extractMax(){
        int max = heap[0];
        heap[0] = heap[--size];
        heapifyDown(0);
        return max;
    }
    public static void main(String[] args) {
        MaxHeap mxh = new MaxHeap(10);
        mxh.insert(51);
        mxh.insert(28);
        mxh.insert(17);
        mxh.insert(48);
        mxh.insert(14);
        mxh.insert(99);
        mxh.printHeap();
        System.out.println(mxh.extractMax());
        mxh.printHeap();        
        System.out.println(mxh.extractMax());
        mxh.printHeap();        
    }
}