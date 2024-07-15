package dsa;
import java.util.Scanner;
public class LinearSearch {
    static int linearSearch(int[] arr, int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
            arr[i] = scan.nextInt();
        int target = scan.nextInt();
        int ind = linearSearch(arr,target);
        if(ind!=-1)
            System.out.println("Element found at "+ind);
        else
            System.out.println("Element not found");
    }
}