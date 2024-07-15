/*
package arrays;
import java.util.Scanner;
public class OneDArray {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] marks = new int[]{25,35,76,89,94,39,36,90,86,100};
        marks[0] = 40;
        marks[1] = 45;
        marks[6] = marks[0]+marks[1];
        marks[5] = marks[3];
        marks[9] = 94;
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}

package arrays;
import java.util.Scanner;
public class OneDArray {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] marks = new int[size];
        for (int i = 0; i < marks.length; i++)
            marks[i] = scan.nextInt();
        int maxScore = marks[0];
        int topper = 1;
        for (int i = 0; i < marks.length; i++) {
            if(marks[i]>maxScore){
                maxScore = marks[i];
                topper = i+1;
            }
        }
        System.out.println("Maximum Score:"+maxScore);
        System.out.println("Topper: student"+topper);
    }
}

package arrays;
import java.util.Scanner;
public class OneDArray {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] marks = new int[size];
        for (int i = 0; i < marks.length; i++)
            marks[i] = scan.nextInt();
        int minScore = marks[0];
        int challenger = 1;
        for (int i = 0; i < marks.length; i++) {
            if(marks[i]<minScore){
                minScore = marks[i];
                challenger = i+1;
            }
        }
        System.out.println("Minimum Score:"+minScore);
        System.out.println("Challenger: student"+challenger);
    }
}

package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class OneDArray {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] marks = new int[size];
        for (int i = 0; i < marks.length; i++)
            marks[i] = scan.nextInt();
        int temp = marks[0];
        int last = marks.length-1;
        marks[0] = marks[last];
        marks[last] = temp;
        System.out.println(Arrays.toString(marks));
    }
}
*/
package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class OneDArray {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] marks = new int[size];
        for (int i = 0; i < marks.length; i++)
            marks[i] = scan.nextInt();
        for (int i = 0; i < marks.length/2; i++) {
            int temp = marks[i];
            int swap = marks.length-1-i;
            marks[i] = marks[swap];
            marks[swap] = temp;
        }
        System.out.println(Arrays.toString(marks));
    }
}