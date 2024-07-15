package com.kludsa.b15;

import java.util.Arrays;

public class RatMaze {
    int N;
    public RatMaze(int n){
        this.N=n;
    }
    public boolean isValid(int[][] maze,int x,int y){
        if(x>=0&&y>=0&&x<N&&y<N&&maze[x][y]==1)
            return true;
        return false;
    }
    public boolean printMazePathUtil(int[][] maze, int x, int y, int[][] path){
        if(x==N-1 && y==N-1 && maze[x][y]==1){
            path[x][y]=1;
            return true;
        }
        if(isValid(maze,x,y)){
            path[x][y]=1;
            if(printMazePathUtil(maze,x+1,y,path))
                return true;
            if(printMazePathUtil(maze,x,y+1,path))
                return true;
            path[x][y]=0;
        }
        return false;
    }
    public void printMazePath(int[][] maze){
        int[][] path = new int[N][N];
        if(!printMazePathUtil(maze,0,0,path)){
            System.out.println("No path available");
            return;
        }
        printPath(path);
    }
    public void printPath(int[][] path){
        for(int i = 0; i < path.length; i++)
            System.out.println(Arrays.toString(path[i]));
    }
    public static void main(String[] args) {
        RatMaze rm = new RatMaze(4);
        int[][] maze = {{1,0,0,0},
                        {1,1,1,0},
                        {1,0,1,1},
                        {0,0,0,1}};
        rm.printMazePath(maze);
    }
}