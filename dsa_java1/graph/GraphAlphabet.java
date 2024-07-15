package graph;
import java.util.*;
public class GraphAlphabet {
    private int V;
    private int E;
    private Map<Character,LinkedList<Character>> adjList;
    public GraphAlphabet(int nodes){
        this.V=nodes;
        this.E=0;
        adjList= new HashMap<>(); 
        for(char v='A';v<'A'+V;v++){
            adjList.put(v, new LinkedList<Character>());
        }
    }
    public void addEdge(char v, char u){
        adjList.get(v).add(u);
        adjList.get(u).add(v);
        E++;        
    }
    public void display(){
        for(char v='A';v<'A'+V;v++){
            System.out.println(v+":"+adjList.get(v));
        }
    }
    public void bfsTraversal(char source){
        boolean[] visited = new boolean[V];
        Queue<Character> q = new LinkedList<>();
        q.offer(source);
        visited[source-65]=true;
        while(!q.isEmpty()){
            char v = q.poll();
            System.out.print(v+" ");
            for(char u : adjList.get(v)){
                int ind = u-65;
                if(!visited[ind]){
                    visited[ind]=true;
                    q.offer(u);
                }
            }
        }
        System.out.println();
    }    
    public void dfsTraversal(char source){
        boolean[] visited = new boolean[V];
        Stack<Character> s = new Stack<>();
        s.push(source);
        visited[source-65]=true;
        while(!s.isEmpty()){
            char v = s.pop();
            System.out.print(v+" ");
            for(char u:adjList.get(v)){
                int ind = u-65;
                if(!visited[ind]){
                    visited[ind]=true;
                    s.push(u);
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        GraphAlphabet g = new GraphAlphabet(5);
        g.addEdge('A','B');
        g.addEdge('A','C');
        g.addEdge('C','D');
        g.addEdge('B','D');
        g.addEdge('B','E');
        g.addEdge('E','A');
        g.addEdge('A','D');
        g.display();
        System.out.println("---BFS Traversal---");
        g.bfsTraversal('A');
    }
}