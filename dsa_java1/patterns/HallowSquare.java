package patterns;
import java.util.Scanner;
public class HallowSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int cols = scan.nextInt();
        for(int r=0;r<rows;r++) {
            for(int c=0;c<cols;c++) {
                if(r==0 || r==rows-1 || c==0 || c==cols-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("--------------");
        System.out.println("--------------");
        for(int r=0;r<rows;r++) {
            for(int c=0;c<cols;c++) {
                if(r==c || r+c==rows-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("--------------");
        System.out.println("--------------");        
        for(int r=0;r<rows;r++) {
            for(int c=0;c<cols;c++) {
                if(r==c || r+c==rows-1 || r==0 || r==rows-1 || c==0 || c==cols-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("--------------");
        System.out.println("--------------");
        for(int r=0;r<rows;r++) {
            for(int c=0;c<cols;c++) {
                if(r==c || r+c==rows-1 || c==0 || c==cols-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("--------------");
        System.out.println("--------------");
        for(int r=0;r<rows;r++) {
            for(int c=0;c<cols;c++) {
                if(r==c || r+c==rows-1 || r==0 || r==rows-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("--------------");
        System.out.println("--------------");
        for(int r=0;r<rows;r++) {
            int ch = 65;
            for(int c=0;c<cols;c++) {
                if(r<=c)
                    System.out.print((char)(ch++));
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}
