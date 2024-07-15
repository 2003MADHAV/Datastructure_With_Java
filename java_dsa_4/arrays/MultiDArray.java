/*
package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class MultiDArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[3][3];
        arr[0][0] = 10;
        arr[0][1] = 13;
        arr[0][2] = 17;
        
        arr[1][0] = 20;
        arr[1][1] = 33;
        arr[1][2] = 37;

        arr[2][0] = 40;
        arr[2][1] = 23;
        arr[2][2] = 57;
        
        System.out.println(arr[2][0]);

        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));

        
        int[][] arr2 = new int[][]{{1,2,3},{2,3,4},{5,6,7}};
        System.out.println(Arrays.toString(arr2[0]));
        System.out.println(Arrays.toString(arr2[1]));
        System.out.println(Arrays.toString(arr2[2]));

        int[][] arr3 = new int[3][3];
        arr3[0] = new int[]{1,2,3};
        arr3[1] = new int[]{4,5,6};
        arr3[2] = new int[]{7,8,9};
        System.out.println(Arrays.toString(arr3[0]));
        System.out.println(Arrays.toString(arr3[1]));
        System.out.println(Arrays.toString(arr3[2]));

        int noOfSections = scan.nextInt();
        int noOfStudents = scan.nextInt();
        int[][] marks = new int[noOfSections][noOfStudents];
        for (int section = 0; section < noOfSections; section++) {
            System.out.println("enter marks of section"+section+1);
            for (int student = 0; student < noOfStudents; student++) {
                marks[section][student] = scan.nextInt();
            }
        }
        System.out.println("Marks of students sectionwise:");
        for (int section = 0; section < noOfSections; section++) {
            for (int student = 0; student < noOfStudents; student++) {
                System.out.print(marks[section][student]+" ");
            }
            System.out.println();
        }

    }
}

package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class MultiDArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int cols = scan.nextInt();
        int[][] mat = new int[rows][cols];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                mat[r][c] = scan.nextInt();
            }            
        }
        int fSum=0,rSum=0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if(r==c)
                    fSum+=mat[r][c];
                if(r+c==rows-1)
                    rSum+=mat[r][c];
            }
        }
        if(fSum==rSum)
            System.out.println("Super Matrix");
        else
            System.out.println("Duper Matrix");
    }
}

package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class MultiDArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[][]{{1,2,3},{4,5},{6},{6,7,8,9}};

        int rows = scan.nextInt();
        int[][] arr2 = new int[rows][];
        arr2[0] = new int[]{1,2,3,4,5};
        arr2[1] = new int[]{1,4,5};
        arr2[2] = new int[]{1,2,4,5};
        
        for (int r = 0; r < arr2.length; r++) {
            for (int c = 0; c < arr2[r].length; c++) {
                System.out.print(arr2[r][c]+" ");
            }
            System.out.println();
        }
    }
}
*/

package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class MultiDArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int[][] arr = new int[rows][];
        for (int r = 0; r < rows; r++) {
            System.out.println("enter # of cols in row"+(r+1));
            int cols = scan.nextInt();
            int[] row = new int[cols];
            for (int c = 0; c < cols; c++) {
                row[c] = scan.nextInt();
            }
            arr[r] = row;
        }
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                System.out.print(arr[r][c]+" ");
            }
            System.out.println();
        }

    }
}