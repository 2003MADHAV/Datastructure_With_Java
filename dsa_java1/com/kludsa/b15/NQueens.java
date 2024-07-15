package com.kludsa.b15;
import java.util.Arrays;
public class NQueens {
    int N;
    public NQueens(int n){
        this.N = n;
    }
    public static void printQueenPlacement(int[][] sol){
        for(int i=0;i<sol.length;i++)
            System.out.println(Arrays.toString(sol[i]));
    }
    public boolean isSafe(int row, int col, int[][] sol){
        int i,j;
        for(i=0;i<col;i++)
            if(sol[row][i]==1) return false;            
        for(i=row,j=col;i>=0 && j>=0;i--,j--)
            if(sol[i][j]==1) return false;
        for(i=row,j=col;i<N&&j>=0;i++,j--)
            if(sol[i][j]==1) return false;
        return true;
    }
    public boolean queenProblemUtil(int col, int[][] sol){
        if(col>=N)
            return true;
        for(int row=0;row<N;row++){
            if(isSafe(row,col,sol)){
                sol[row][col]=1;
                if(queenProblemUtil(col+1,sol))
                    return true;
            }
            sol[row][col]=0;
        }
        return false;
    }
    public void queenProblem(){
        int[][] sol = new int[N][N];
        if(!queenProblemUtil(0,sol)){
            System.out.println("No Solution");
            return;
        }
        printQueenPlacement(sol);
    }
    public static void main(String[] args) {
        int n = 4;
        NQueens nQ = new NQueens(n);
        nQ.queenProblem();
    }
}
