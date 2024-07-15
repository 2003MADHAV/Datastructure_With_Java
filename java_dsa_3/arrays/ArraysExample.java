package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class ArraysExample 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[] marks = new int[10];
        marks[0] = 87;
        marks[4] = 84;
        marks[3] = 99;
        marks[9] = 100;
        System.out.println(marks[3]);
        int[] marks2 = new int[]{90,80,70,60,50};
        System.out.println(marks2[3]);
        int[] marks3 = new int[5];
        for(int index=0;index<5;index++)
            marks3[index] = scan.nextInt();
        for(int index=0;index<5;index++)
            System.out.print(marks3[index]+" ");
        System.out.println();
        System.out.println(Arrays.toString(marks3));
    }
}
