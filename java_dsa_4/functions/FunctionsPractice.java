package functions;
public class FunctionsPractice {
    static int digitSum(int num)
    {
        int sum = 0;
        while(num>0)
        {
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
    static int factorial(int num)
    {
        if(num==1 || num==0)
            return 1;
        return num*factorial(num-1);
    }
    static int digitalSum(int num)
    {
        if(num<10)
            return num;
        int sum = 0;
        while(num>0)
        {
            sum += num%10;
            num /= 10;
        }
        return digitalSum(sum);
    }
    static int naturalSum(int num)
    {
        if(num==1)
            return 1;
        return num+naturalSum(num-1);
    }
    public static void main(String[] args){
        System.out.println(digitSum(8654));
        System.out.println(factorial(15));
        System.out.println(digitalSum(9584788));
        System.out.println(naturalSum(6));
    }
}