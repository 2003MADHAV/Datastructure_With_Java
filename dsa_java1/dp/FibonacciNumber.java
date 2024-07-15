package dp;
import java.util.Scanner;
public class FibonacciNumber {
    static int fibonacciOptimized(int n){
        if(n<2)
            return n;
        int[] fib ={0,0,1};
        for(int i=2;i<=n;i++){
            fib[0]=fib[1];
            fib[1]=fib[2];
            fib[2]=fib[1]+fib[0];
        }
        return fib[2];
    }
    static int fibonacci(int n){
        int[] fib = new int[n+1];
        fib[0]=0;fib[1]=1;
        for (int i=2;i<=n;i++) {
            fib[i]=fib[i-1]+fib[i-2];
        }
        return fib[n];
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(n+"th fibonacci term: "+fibonacci(n));
        System.out.println(n+"th fibonacci term: "+fibonacciOptimized(n));
    }
}