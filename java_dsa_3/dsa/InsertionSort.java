package dsa;

import static dsa.SelectionSort.selectionSort;
import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {-2,-78,-45,-65};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}