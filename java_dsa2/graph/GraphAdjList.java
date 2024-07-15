package graph;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class GraphAdjList {
    private int V;
    private int E;
    private LinkedList<Integer>[] adjList;
    public GraphAdjList(int nodes){
        this.V=nodes;
        this.E=0;
        this.adjList = new LinkedList[nodes];
        for(int v=0;v<V;v++){
            adjList[v] = new LinkedList<Integer>();
        }
    }
    public void addEdge(int v, int u){
        adjList[v].add(u);
        adjList[u].add(v);
        E++;
    }
    public void display(){
        for (int v=0;v<adjList.length;v++) {
            System.out.println(v+": "+adjList[v]);
        }
    }
    public void bfsTraversal(int source){
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList();
        q.offer(source);
        visited[source]=true;
        while(!q.isEmpty()){
            int v = q.poll();
            System.out.print(v+" ");
            for (int u : adjList[v]) {
                if(!visited[u]){
                    visited[u]=true;
                    q.add(u);
                }
            }
        }
        System.out.println();
    }
    public void dfsTraversal(int source){
        boolean[] visited = new boolean[V];
        Stack<Integer> s = new Stack();
        s.push(source);
        visited[source]=true;
        while(!s.isEmpty()){
            int v = s.pop();
            System.out.print(v+" ");
            for(int u:adjList[v]){
                if(!visited[u]){
                    visited[u]=true;
                    s.push(u);
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        GraphAdjList g = new GraphAdjList(5);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(3,4);
        g.addEdge(3,2);
        g.addEdge(2,4);
        g.display();
        System.out.println("---BFS Traversal---");
        g.bfsTraversal(0);
        System.out.println("---DFS Traversal---");
        g.dfsTraversal(0);
    }
}