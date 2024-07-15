package heap;
import java.util.Arrays;
public class HeapSort {
    public static void heapSort(int[] arr){
        int N = arr.length;
        for (int i=N/2-1; i>=0; i--){
            heapifyDown(arr,N,i);
        }
        for(int i=N-1;i>0;i--){
            swap(arr,0,i);
            heapifyDown(arr, i, 0);
        }
    }
    public static void heapifyDown(int[] arr, int N,int i){
        int largest = i;
        int left = (2*i)+1;
        int right = (2*i)+2;
        if(left<N && arr[left]>arr[largest])
            largest=left;
        if(right<N && arr[right]>arr[largest])
            largest = right;
        if(largest!=i){
            swap(arr,i,largest);
            heapifyDown(arr, N, largest);
        }
    }
    public static void swap(int[] arr, int fpos, int spos){
        int temp = arr[fpos];
        arr[fpos] = arr[spos];
        arr[spos] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {4,7,2,15,19,29,36};
        System.out.println("Before sorting: ");
        System.out.println(Arrays.toString(arr));
        heapSort(arr);
        System.out.println("After sorting: ");
        System.out.println(Arrays.toString(arr));
    }
}