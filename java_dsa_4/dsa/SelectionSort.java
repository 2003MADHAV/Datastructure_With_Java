package dsa;
import java.util.*;
public class SelectionSort {
    static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int minInd = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minInd])
                    minInd=j;
            }
            int temp=arr[i];
            arr[i]=arr[minInd];
            arr[minInd]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {9,1,-2,3,4,-5,6,7,-8};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }    
}