public class HeapSort{
    static void swap(int[] arr,int fpos, int spos){
	int temp = arr[fpos];
	arr[fpos]=arr[spos];
	arr[spos]=temp;
    }
    public static void sort(int arr[]){
	int N = arr.length;
	for (int i = N / 2 - 1; i >= 0; i--)
            heapifyDown(arr, N, i);
	for (int i = N - 1; i > 0; i--) {
            swap(arr,0,i);
            heapifyDown(arr, i, 0);
	}
    }
    static void heapifyDown(int arr[], int N, int i){
        int largest = i;
	int left = 2 * i + 1;
	int right = 2 * i + 2;
	if (left < N && arr[left] > arr[largest])
            largest = left;
	if (right < N && arr[right] > arr[largest])
            largest = right;
	if (largest != i) {
            swap(arr,i,largest);
            heapifyDown(arr, N, largest);
	}
    }
    static void printArray(int arr[]){
	int N = arr.length;
	for (int i = 0; i < N; ++i)
            System.out.print(arr[i] + " ");
            System.out.println();
    }
    public static void main(String args[]){
	int arr[] = {4,7,2,9,15,29,38};
	int N = arr.length;
	sort(arr);
        System.out.println("Sorted array is");
        printArray(arr);
    }
}