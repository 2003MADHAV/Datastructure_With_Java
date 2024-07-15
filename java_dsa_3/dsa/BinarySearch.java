package dsa;
import java.util.Scanner;
public class BinarySearch {
    
    static int orderAgnosticBS(int[] arr,int target)
    {
        boolean isAsc = arr[0]<arr[arr.length-1];
        int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(arr[mid]==target)
                return mid;
            if(isAsc)
            {
                if(target>arr[mid])
                    start=mid+1;
                else
                    end=mid-1;
            }
            else{
                if(target<arr[mid])
                    start = mid+1;
                else
                    end=mid-1;
            }
        }
        return -1;        
        
    }
    static int binarySearch(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(arr[mid]==target)
                return mid;
            else if(target<arr[mid])
                start = mid+1;
            else
                end=mid-1;
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
        //int ind = binarySearch(arr,target);
        int ind = orderAgnosticBS(arr,target);

        if(ind!=-1)
            System.out.println("Element found at "+ind);

        else
            System.out.println("Element not found");
    }
}