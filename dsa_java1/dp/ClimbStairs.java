package dp;
import java.util.Scanner;
public class ClimbStairs {
    static int climbStairs(int n){
        int[] dp = new int[n+1];
        dp[0]=0;dp[1]=1;dp[2]=2;
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("# of possible ways to climb "+n+" steps: "+climbStairs(n));        
    }
}