package backtracking;
public class RatInMaze2 {
    int N=9;
    public void printPath(int[][] path){
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++)
                System.out.print(path[i][j]+" ");
            System.out.println();
        }
    }
    public boolean isSafe(int[][] maze, int x, int y){
        if(x>=0&&x<N && y>=0&&y<N && (maze[x][y]=='*' || maze[x][y]==1))
            return true;
        return false;
    }
    public boolean printMazePathUtil(int[][] maze,int x, int y, int[][] path){
        if(x==1 && y==6 && maze[x][y]=='*'){
            path[x][y]=3;
            return true;
        }
        if(isSafe(maze,x,y)){
            if(printMazePathUtil(maze,x-1,y,path)){//upPath
                path[x][y]=1;
                return true;
            }
            if(printMazePathUtil(maze,x,y-1,path)){//leftPath
                path[x][y]=1;
                return true;
            }
            if(printMazePathUtil(maze,x,y+1,path)){//rightPath
                path[x][y]=1;
                return true;
            }
            path[x][y]=0;//backtrack
        }
        return false;
    }
    public void printMazePath(int[][] maze){
        int[][] finalPath = new int[N][N];
        if(!printMazePathUtil(maze,8,4,finalPath)){
            System.out.println("Sumati can't find");
            return;
        }
        printPath(finalPath);
    }
    public static void main(String[] args) {
        int[][] maze = {{1,1,1,0},
                        {1,0,1,0},
                        {1,1,1,1},
                        {0,0,0,1}};
        RatInMaze2 rat = new RatInMaze2();
        //rat.printMazePath(maze);
        
        int[][] maze3 = {{'#',0,0, 0, 0,0, 0, 0,'#'},
                         {1, 0,'#',0, 0, 0,'*',0, 1},
                         {1, 0, 1, 0, 0, 0, 1, 0, 1},
                         {1, 0, 1, 0, 0, 1, 1, 1, 1},
                         {1, 1, 0, 0, 0, 1, 0, 1, 0},
                         {0, 1, 0, 0, 1, 1, 1, 1, 0},
                         {0, 0, 1, 1, 1, 1, 1, 1, 0},
                         {0, 0, 0, 0, 1, 0, 0, 0, 0},
                         {0, 0, 0, 0, 1, 0, 0, 0, 0}};
        rat.printMazePath(maze3);

        //start = [8,4]
    }
}