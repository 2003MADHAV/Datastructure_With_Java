package dsa;
import java.util.*;
public class InsertionSort {
    static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int key = arr[i],j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {
        int[] arr = {9,2,2,3,4,1,6,7,9};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }    
    
}