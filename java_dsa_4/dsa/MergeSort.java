package dsa;
import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {2,4,1,3,8,5,7,6};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSort(int[] arr, int start, int end) {
        if(start<end){
            int mid = (start+end)/2;
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }        
    }
    static void merge(int[] arr, int start, int mid, int end) {
        int n1 = mid-start+1;
        int n2 = end-mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for(int x=0;x<n1;x++)
            left[x]=arr[start+x];
        for(int x=0;x<n2;x++)
            right[x]=arr[mid+x+1];
        int i=0,j=0,k=start;
        while(i<n1 && j<n2){
            if(left[i]<right[j]){
                arr[k]=left[i];
                i++;k++;
            }
            else{
                arr[k]=right[j];
                j++;k++;
            }
        }
        while(i<n1){
            arr[k]=left[i];
            i++;k++;
        }
        while(j<n2){
            arr[k]=right[j];
            j++;k++;
        }
    }
}