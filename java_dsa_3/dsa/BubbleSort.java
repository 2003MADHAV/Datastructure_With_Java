package dsa;
import java.util.*;
public class BubbleSort {
    static void bubbleSort(int[] arr){
        int count=0,iters=0;
        for(int i=0;i<arr.length-1;i++){
            boolean swapped=false;
            for(int j=0;j<arr.length-1-i;j++){
                iters++;
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                    count++;
                }
            }
            if(!swapped)
                break;
        }
        System.out.println("swaps:"+count);
        System.out.println("iterations:"+iters);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {5,1,2,3,4};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}