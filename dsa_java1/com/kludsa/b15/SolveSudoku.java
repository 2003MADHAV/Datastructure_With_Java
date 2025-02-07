package backtracking;
public class SolveSudoku{
    public static boolean sudokuAutomation(int[][] board, int n){
	int row = -1;
	int col = -1;    
	boolean isEmpty = true;
	for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
		if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    isEmpty = false;
                    break;
		}
            }
            if(!isEmpty)
		break;
	}
	if(isEmpty)
            return true;
	for(int num = 1; num <= n; num++){
            if(isSafePlace(board, row, col, num)){
		board[row][col] = num;
		if(sudokuAutomation(board, n)){
                    return true;
       		} else {
                    board[row][col] = 0; 
		}
            }
	}
	return false;
    }
    public static boolean isSafePlace(int[][] board, int row, int col, int num) {
	for(int j = 0; j < board.length; j++){
            if (board[row][j] == num) {
		return false;
            }
	}
	for(int i = 0; i < board.length; i++) {
            if (board[i][col] == num){
		return false;
            }
	}
	int sqrt = (int) Math.sqrt(board.length);
	int rowStart = row - row % sqrt;
	int colStart = col - col % sqrt;
	for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
		if (board[r][c] == num) {
                    return false;
		}
            }
	}
	return true;
    }
    public static void printSudokuBoard(int[][] board, int N) { 
	for (int row = 0; row < N; row++) { 
            for (int col = 0; col < N; col++) { 
		System.out.print(board[row][col]+" "); 
            }
            System.out.println(); 
	}
    }
    public static void main(String[] args) {
	int[][] board2 = new int[][] {{ 0, 2, 3, 0},
                                    { 0, 0, 0, 1 },
                                    { 0, 1, 0, 0 },
                                    { 2, 4, 1, 0 }};
	int[][] board = {{7,5,0,0,0,4,0,0,2},
                         {6,0,0,0,2,0,3,0,0},
                         {0,2,0,0,0,0,5,0,0},
                         {0,3,0,0,7,0,0,0,0},
                         {2,0,0,0,1,3,0,0,0},
                         {0,0,0,0,4,0,7,0,1},
                         {0,0,7,0,0,0,0,0,0},
                         {5,0,0,0,0,1,0,0,3},
                         {0,1,2,0,0,0,0,7,0}};
        int N = board.length;
	if(sudokuAutomation(board, N))
            printSudokuBoard(board, N);
	else
            System.out.println("No Solution Exists");
    }
}