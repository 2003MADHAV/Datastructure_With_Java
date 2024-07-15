package dsa;
import java.util.*;
public class Sorting {
    static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            boolean swapped=false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped)
                break;
        }
    }
    static void selectionSort(int[] arr)
    {
        for(int i=arr.length-1;i>=0;i--){
            int maxInd = i;
            for(int j=i-1;j>=0;j--){
                if(arr[j]>arr[maxInd])
                    maxInd=j;
            }
            int temp=arr[i];
            arr[i]=arr[maxInd];
            arr[maxInd]=temp;
        }
    }
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
        bubbleSort(arr);
        selectionSort(arr);
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}