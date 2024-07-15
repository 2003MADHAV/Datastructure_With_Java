package dsa;
import java.util.*;
public class SelectionSort {
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
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {5,1,2,3,4};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}