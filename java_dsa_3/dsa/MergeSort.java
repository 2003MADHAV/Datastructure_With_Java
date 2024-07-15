package dsa;
import java.util.Arrays;
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,1,9,3,4,6,2,};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSort(int[] arr, int start, int end )
    {
        if(start<end)
        {
            int mid = (start+end)/2;
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }
    static void merge(int[] arr, int start, int mid, int end){
        int n1 = mid-start+1;
        int n2 = end - mid;
        int[] lArr = new int[n1];
        int[] rArr = new int[n2];
        for(int i=0;i<lArr.length;i++)
            lArr[i] = arr[start+i];
        for(int i=0;i<rArr.length;i++)
            rArr[i]=arr[mid+i+1];
        System.out.println(Arrays.toString(lArr));
        System.out.println(Arrays.toString(rArr));
        int i=0,j=0,k=start;
        while(i<n1 && j<n2)
        {
            if(lArr[i]<=rArr[j]){
                arr[k]=lArr[i];
                i++;
                k++;
            }
            else{
                arr[k]=rArr[j];
                j++;
                k++;
            }
        }
        while(i<n1){
            arr[k]=lArr[i];
            i++;k++;
        }
        while(j<n2){
            arr[k]=rArr[j];
            j++;k++;
        }        

    }
}