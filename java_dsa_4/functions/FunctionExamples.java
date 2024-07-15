package functions;

import java.util.Arrays;

public class FunctionExamples {
    static String greet(String time, String name)
    {
        String message="Good ";
        if(time.equals("am"))
            message = message+"Morning ";
        else
            message = message + "Afternoon ";
        message += name;
        return message;
    }
    static int sum(String name, int b, int ...nums)
    {
        int sum = b;
        for(int val : nums)
            sum+=val;
        return sum;
    }    
    static int sum2(int[] arr)
    {
        int sum = 0;
        for(int val : arr)
            sum+=val;
        return sum;
    }
    static int[] sum3(int[] arr)
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
    public static void main(String[] args) {        
        System.out.println(greet("am", "Tarun"));
        System.out.println(greet("pm", "Pawan"));
        System.out.println(greet("am", "DivyaSree"));
        System.out.println(greet("pm", "Kanitha"));
        System.out.println(sum("Nikky",3,6,8,9,23));
        System.out.println(sum("Kiran",7,9,8,5,3,6,2,8,13,15));
        System.out.println(sum2(new int[]{2,5,3,6,7,8}));
        System.out.println(Arrays.toString(sum3(new int[]{2,5,3,6,7,8})));
        System.out.println(Arrays.toString(division(7,3)));
    }
}