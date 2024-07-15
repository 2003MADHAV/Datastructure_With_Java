package backtracking;
public class SudokuSolver {
    static void printSudokuBoard(int[][] board,int N){
        for (int i=0;i<N;i++) {
            for (int j=0;j<N;j++)
                System.out.print(board[i][j]+" ");
            System.out.println();
        }
    }
    static boolean isSafeToPlaceNumber(int row, int col, int[][] board, int num){
        for(int c=0;c<board.length;c++){
           if(board[row][c]==num)
               return false;
        }
        for(int r=0;r<board.length;r++) {
            if(board[r][col]==num)
                return false;
        }
        int sqrt = (int)Math.sqrt(num);
        int rowStart = row - row%sqrt;
        int colStart = col - col%sqrt;
        for(int r=rowStart;r<rowStart+sqrt;r++){
            for (int c=colStart;c<colStart+sqrt; c++) {
                if(board[r][c]==num)
                    return false;
            }
        }
        return true;
    }
    static boolean sudokuAutomation(int[][] board, int N){
        int r=-1,c=-1;
        boolean isEmpty = true;
        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                if(board[i][j]==0){
                    r=i;c=j;
                    isEmpty = false;
                    break;
                }
            }
            if(!isEmpty)
                break;
        }
        if(isEmpty)
            return true;
        for(int n=1;n<=N;n++) {
            if(isSafeToPlaceNumber(r,c,board,n)){
                board[r][c]=n;
                if(sudokuAutomation(board, n))
                    return true;
                else
                    board[r][c]=0;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] board2 = {{1,4,3,2},
                         {0,0,1,4},
                         {4,1,3,2},
                         {2,3,0,0}};
        int[][] board = {{0,0,0,0,0,0,0,0,0},
                         {0,1,2,0,3,4,5,6,7},
                         {0,3,4,5,0,6,1,8,2},
                         {0,0,1,0,5,8,2,0,6},
                         {0,0,8,6,0,0,0,0,1},
                         {0,2,0,0,0,7,0,5,0},
                         {0,0,3,7,0,5,0,2,8},
                         {0,8,0,0,6,0,7,0,0},
                         {2,0,7,0,8,3,6,1,5}}; 
        int N = board.length;
        if(!sudokuAutomation(board,N)){
            System.out.println("No Solution Exists..");
            return;
        }
        printSudokuBoard(board,N);
    }
}