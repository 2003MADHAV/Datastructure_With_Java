package graph;
import java.util.*;
public class GraphAlphabet {
    private int V;
    private int E;
    private Map<Character,List<Character>> adjList;
    public GraphAlphabet(int nodes){
        this.V = nodes;
        this.E = 0;
        adjList = new HashMap<>();
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
            System.out.println(v+": "+adjList.get(v));
        }
    }
    public static void main(String[] args){
        GraphAlphabet g = new GraphAlphabet(5);
        g.addEdge('A','B');
        g.addEdge('B','D');
        g.addEdge('D','C');
        g.addEdge('C','A');
        g.addEdge('B','E');
        g.addEdge('D','E');
        g.addEdge('B','C');
        g.display();
    }
}