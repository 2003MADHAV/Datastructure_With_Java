package backtracking;
public class RatInMaze2 {
    int N;
    public RatInMaze2(int n){
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
        if(x>=0&&x<N && y>=0&&y<N && (maze[x][y]==1 || maze[x][y]=='#'))
            return true;
        return false;
    }
    public boolean printMazePathUtil(int[][] maze, int x, int y, int[][] path){
        if(x==1 && y==6 && maze[x][y]=='*'){
            path[x][y]=1;
            return true;
        }
        if(isSafe(maze,x,y)){
            if(printMazePathUtil(maze,x-1,y,path)){
                path[x][y]=1;
                return true;
            }            
            if(printMazePathUtil(maze,x,y-1,path)){
                path[x][y]=1;
                return true;
            }
            if(printMazePathUtil(maze,x,y+1,path)){
                path[x][y]=1;
                return true;
            }
            path[x][y]=0;
        }        
        return false;
    }
    public void printMazePath(int[][] maze){
        int[][] path = new int[N][N];
        if(!printMazePathUtil(maze,8,4,path)){
            System.out.println("Rat can't reach to END");
            return;
        }
        printPath(path);
    }
    public static void main(String[] args) {
        int[][] maze = {{1,1,0,1,1},
                        {1,0,0,1,1},
                        {1,0,1,1,0},
                        {1,1,1,1,1},
                        {1,0,0,0,1}};

        int[][] maze2 = {{'#',0,0, 0, 0, 0, 0, 0,'#'},
                         {1, 0,'#',0, 0, 0,'*',0, 1},
                         {1, 0, 1, 0, 0, 0, 1, 0, 1},
                         {1, 0, 1, 0, 0, 1, 1, 1, 1},
                         {1, 1, 0, 0, 0, 1, 0, 1, 0},
                         {0, 1, 1, 0, 1, 1, 1, 1, 0},
                         {0, 0, 1, 1, 1, 1, 1, 1, 0},
                         {0, 0, 0, 0, 1, 0, 0, 0, 0},
                         {0, 0, 0, 0, 1, 0, 0, 0, 0}};
        RatInMaze2 rat = new RatInMaze2(9);
        rat.printMazePath(maze2);
    }
}