package dsa;
import java.util.Scanner;
public class LinearSearch {
    static int linearSearch(int[] arr, int target)
    {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
                return i;
        }
        return -1;
    } 
    static int getMax(int[] arr){
        int max = arr[0];
        for(int val:arr)
        {
            if(val>max)
                max=val;
        }
        return max;
    }
    static int getMin(int[] arr){
        int min = arr[0];
        for(int val:arr)
        {
            if(val<min)
                min=val;
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
            arr[i] = scan.nextInt();
        int target = scan.nextInt();
        int res = linearSearch(arr, target);
        if(res!=-1)
            System.out.println("ELement found at "+res);
        else
            System.out.println("Element not found");
        System.out.println("Maximum: "+getMax(arr));
        System.out.println("Minimum: "+getMin(arr));
    }
}
