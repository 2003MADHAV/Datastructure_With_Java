package dsa;
import java.util.Arrays;
public class QuickSort {
    public static void main(String[] args) {
        int[] arr= {4,1,5,-6,3,2,0,-12,9,8,14,-78,35};
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int[] arr, int start, int end){
        if(start<end){
            int pivot = partition(arr,start,end);
            quickSort(arr,start,pivot-1);
            quickSort(arr,pivot+1,end);
        }
    }
    static int partition(int[] arr,int start, int end){
        int i=start-1;
        int pivot = arr[end];
        for(int j=start;j<end;j++)
        {
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end]= temp;
        return i+1;
    }
}