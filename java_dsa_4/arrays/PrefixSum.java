package arrays;
import java.util.Scanner;
public class PrefixSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T=scan.nextInt();
        while(T-->0){
            int size = scan.nextInt();
            int[] arr = new int[size];
            for(int i=0;i<size;i++)
                arr[i]=scan.nextInt();
            int t=scan.nextInt();
            while(t-->0){
                int sum=0;
                int left = scan.nextInt();
                int right = scan.nextInt();
                for(int i=left-1;i>=0 && i<right;i++)
                    sum+=arr[i];
                System.out.println(sum);
            }
        }
    }
}