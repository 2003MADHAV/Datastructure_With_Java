package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayExample 
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] marks = new int[5];
        marks[0] = 92;
        marks[1] = 90;
        marks[3] = 69;
        marks[2] = 89;
        System.out.println(marks[2]);
        
        int[] marks2 = new int[]{10,20,30,50,80};
        System.out.println(marks2[3]);
        
        int[] marks3;
        marks3 = new int[]{25,35,45,40};
        System.out.println(marks3[1]);

        int size = scan.nextInt();
        int[] marks4 = new int[size];
        for (int i = 0; i < size; i++) {
            marks4[i]=scan.nextInt();
        }
        
        for (int i = 0; i < size; i++) {
            System.out.println(marks4[i]+" ");
        }

        System.out.println(Arrays.toString(marks4));
    }
}