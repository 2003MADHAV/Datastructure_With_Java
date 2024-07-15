package backtracking;
public class NQueens {
    int N;
    public NQueens(int n){
        this.N=n;
    }
    public void printQueenPlacement(int[][] sol){
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++) {
                System.out.print(sol[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public boolean isSafeToPlaceQueen(int row, int col, int[][] sol){
        int r,c;
        for(c=col;c>=0;c--){
            if(sol[row][c]==1)
                return false;
        }
        for(r=row,c=col;r>=0&&c>=0;r--,c--){
            if(sol[r][c]==1)
                return false;
        }
        for(r=row,c=col;r<N&&c>=0;r++,c--){
            if(sol[r][c]==1)
                return false;
        }
        return true;
    }
    public boolean queenProblemUtil(int col, int[][] sol){
        if(col>=N)
            return true;
        int row;
        for(row=0;row<N;row++){
            if(isSafeToPlaceQueen(row,col,sol)){
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
            System.out.println("No Solution Exists");
            return;
        }
        printQueenPlacement(sol);
    }
    public static void main(String[] args) {
        NQueens nQ = new NQueens(2);
        nQ.queenProblem();
    }
}