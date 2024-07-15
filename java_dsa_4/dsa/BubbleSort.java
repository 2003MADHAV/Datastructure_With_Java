package dsa;
import java.util.Arrays;
public class BubbleSort {
    static void bubbleSort(int[] arr){
        int iter=0,swaps=0;
        for(int i=0;i<arr.length-1;i++){
            boolean swapped = false;
            for(int j=0;j<arr.length-i-1;j++){
                iter++;
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swaps++;
                    swapped = true;
                }
            }
            if(!swapped)
                break;
        }
        System.out.println("iterations: "+iter);
        System.out.println("swaps: "+swaps);
    }
    public static void main(String[] args) {
        int[] arr = {9,1,2,3,4,5,6,7,8};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}