package backtracking;
public class RatInMaze {
    int N;
    public RatInMaze(int n){
        this.N=n;
    }
    public void printPath(int[][] path){
        for (int i=0;i<N ;i++){
            for (int j=0;j<N;j++)
                System.out.print(path[i][j]+" ");
            System.out.println();
        }
    }
    public boolean isSafe(int[][] maze, int x, int y){
        if(x>=0&&x<N && y>=0&&y<N && maze[x][y]==1)
            return true;
        return false;
    }
    public boolean printMazePathUtil(int[][] maze, int x, int y, int[][] path){
        if(x==N-1 && y==N-1 && maze[x][y]==1){
            path[x][y]=1;
            return true;
        }
        if(isSafe(maze,x,y)){
            if(printMazePathUtil(maze,x,y+1,path)){
                path[x][y]=1;
                return true;
            }
            if(printMazePathUtil(maze,x+1,y,path)){
                path[x][y]=1;
                return true;
            }            
            path[x][y]=0;
        }        
        return false;
    }
    public void printMazePath(int[][] maze){
        int[][] path = new int[N][N];
        if(!printMazePathUtil(maze,0,0,path)){
            System.out.println("Rat can't reach to END");
            return;
        }
        printPath(path);
    }
    public static void main(String[] args) {
        int[][] maze = {{1,1,1,1},
                        {1,0,0,1},
                        {1,1,1,1},
                        {0,0,0,1}};
        RatInMaze rat = new RatInMaze(4);
        rat.printMazePath(maze);
    }
}