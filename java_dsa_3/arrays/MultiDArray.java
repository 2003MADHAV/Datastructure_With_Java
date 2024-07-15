/*
package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class MultiDArray{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] marks = new int[][]{{1,2,3,5,7},{4,5,6,3,6},{7,8,9,9,6}};
        int[][] marks2 = new int[3][5];
        marks2[0] = new int[]{1,2,3,4,5};
        marks2[1] = new int[]{4,2,7,4,6};
        marks2[2] = new int[]{9,2,6,4,8};
        System.out.println(Arrays.toString(marks2[0]));
        System.out.println(Arrays.toString(marks2[1]));
        System.out.println(Arrays.toString(marks2[2]));

        int rows = scan.nextInt();
        int cols = scan.nextInt();
        int[][] marks3 = new int[rows][cols];
        for(int r=0;r<marks3.length;r++){
            for(int c=0;c<marks3[r].length;c++)
                marks3[r][c] = scan.nextInt();
        }
        for(int r=0;r<marks3.length;r++){
            for(int c=0;c<marks3[r].length;c++)
                System.out.print(marks3[r][c]+" ");
            System.out.println();
        }
    }        
}

package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class MultiDArray{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] marks = new int[3][];
        marks[0] = new int[]{1,3,4,5};
        marks[1] = new int[]{4,7};
        marks[2] = new int[]{9,4,8};
        System.out.println(Arrays.toString(marks[0]));
        System.out.println(Arrays.toString(marks[1]));
        System.out.println(Arrays.toString(marks[2]));
        int rows = scan.nextInt();
        int[][] marks3 = new int[rows][];
        for(int r=0;r<marks3.length;r++){
            System.out.println("Enter # of cols in row"+r);
            int cols = scan.nextInt();
            int[] row = new int[cols];
            for(int c=0;c<cols;c++)
                row[c] = scan.nextInt();
            marks3[r] = row;
        }
        for(int r=0;r<marks3.length;r++){
            for(int c=0;c<marks3[r].length;c++)
                System.out.print(marks3[r][c]+" ");
            System.out.println();
        }
    }        
}
*/
package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class MultiDArray{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int cols = scan.nextInt();
        int[][] marks = new int[rows][cols];
        for(int r=0;r<rows;r++){
            for(int c=0;c<cols;c++)
                marks[r][c] = scan.nextInt();
        }
        int fSum = 0, rSum = 0;
        for(int r=0;r<marks.length;r++){
            for(int c=0;c<marks[r].length;c++)
            {
                if(r==c)
                    fSum += marks[r][c];
                if(r+c==rows-1)
                    rSum+=marks[r][c];
            }
        }
        if(fSum==rSum)
            System.out.println("Super Matrix");
        else
            System.out.println("Duper Matrix");
    }    
}