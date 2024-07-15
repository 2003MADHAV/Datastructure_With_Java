package functions;

import java.util.Arrays;

public class FunctionExamples {
    static String greet(String time,String name)
    {
        String message ="Good ";
        if(time.equals("am"))
            message+="Morning, ";
        else
            message+="Afternoon, ";
        message += name;
        return message;
    }
    static int[] product(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]*2;
        }
        return arr;
    }
    static int[] division(int a, int b)
    {
        int quo = a/b;
        int rem = a%b;
        return(new int[]{quo,rem});
    }
    public static void main(String[] args)
    {
        System.out.println(greet("am","Abhishek"));
        System.out.println(greet("am","Pavan"));
        System.out.println(greet("pm","Jagadish"));
        System.out.println(greet("am","Giri"));
        String msg = greet("pm","Modi Ji!!");
        System.out.println(msg);
        //System.out.println(product(2,4,"abhi","chandu","bharat"));
        System.out.println(Arrays.toString(product(new int[]{1,2,3,4,5,6})));
        System.out.println(Arrays.toString(division(7,3)));
    }
}
