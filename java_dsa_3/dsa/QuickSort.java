package dsa;
import java.util.Arrays;
public class QuickSort {
    public static void main(String[] args) {
        int[] arr={5,3,-2,-3,1,4,-6,2,9};
        System.out.println(Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static int partition(int[] arr, int start, int  end){
        int i=start-1;
        int pi=arr[end];
        for(int j=start;j<end;j++){
            if(arr[j]<pi)
            {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1]=arr[end];
        arr[end]=temp;
        return i+1;
    }
    static void quickSort(int[] arr, int start, int end)
    {
        if(start<=end)
        {
            int pivot = partition(arr,start,end);
            quickSort(arr, start, pivot-1);
            quickSort(arr, pivot+1,end);
        }
    }
}