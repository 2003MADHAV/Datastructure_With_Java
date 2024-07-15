/*
package arrays;

import java.util.Scanner;

public class OneDArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int noOfStudents = scan.nextInt();
        int[] marks = new int[noOfStudents];
        for (int i = 0; i < noOfStudents; i++) {
            marks[i] = scan.nextInt();
        }
        int maxScore = marks[0];
        int topper=1;
        for (int i = 1; i < marks.length; i++) {
            if(marks[i]>maxScore)
            {
                maxScore = marks[i];
                topper = i+1;
            }
        }
        System.out.println("Maximum Score: "+maxScore);
        System.out.println("Topper: student"+topper);
    }
}

package arrays;
import java.util.Scanner;
public class OneDArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int noOfStudents = scan.nextInt();
        int[] marks = new int[noOfStudents];
        for (int i = 0; i < noOfStudents; i++) {
            marks[i] = scan.nextInt();
        }
        int minScore = marks[0];
        int challenger=1;
        for (int i = 1; i < marks.length; i++) {
            if(marks[i]<minScore)
            {
                minScore = marks[i];
                challenger = i+1;
            }
        }
        System.out.println("Minimum Score: "+minScore);
        System.out.println("Challenger: student"+challenger);
    }
}

package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class OneDArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        int temp = nums[0];
        nums[0]=nums[nums.length-1];
        nums[nums.length-1] = temp;
        System.out.println(Arrays.toString(nums));
    }
}
*/
package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class OneDArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        for(int i=0;i<nums.length/2;i++){
            int temp = nums[i];
            nums[i]=nums[nums.length-1-i];
            nums[nums.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}