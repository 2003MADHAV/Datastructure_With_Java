/*
package functions;
public class FunctionsPractice {
    static int digitSum(int num)
    {
        if(num<10)
            return num;
        int sum = 0;
        while(num>0)
        {
            sum += (num%10);
            num/=10;
        }
        return digitSum(sum);
    }
    static int factorial(int num)
    {    
        if(num==1 || num==0)
            return 1;
        return num*factorial(num-1);
    }
    public static void main(String[] args) {
        System.out.println(digitSum(458621));
        System.out.println(factorial(5));
    }
}
*/
package functions;
import java.util.Scanner;
public class FunctionsPractice
{
    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;
    }
    static float sum(int a, float b, float c){
        return a+b+c;
    }
    static int sum(int ...nums){
        int sum=0;
        for(int n:nums)
            sum+=n;
        return sum;
    }    
    public static void main(String[] args) {
        System.out.println(sum(3,6));
        System.out.println(sum(4,7,9));
        System.out.println(sum(5,2.5f,7.6f));
        System.out.println(sum(1,2,3,4,5,6,7,8,9,10));
    }
}