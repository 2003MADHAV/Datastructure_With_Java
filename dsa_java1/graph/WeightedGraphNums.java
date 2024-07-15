package graph;
import java.util.*;
import java.util.Map.*;
public class WeightedGraphNums{
    private int V;
    private int E;
    private Map<Integer,Map<Integer,Integer>> adjList;
    public WeightedGraphNums(int nodes){
        this.V=nodes;
        this.E=0;
        adjList= new HashMap<>(); 
        for(int v=0;v<V;v++)
            adjList.put(v, new HashMap<Integer,Integer>());
    }
    public void addEdge(int v, int u, int weight){
        adjList.get(v).put(u, weight);
        adjList.get(u).put(v,weight);
        E++;
    }
    public void display(){
        for(int v=0;v<V;v++){
            System.out.print(v+":");
            for(Entry<Integer,Integer> u: adjList.get(v).entrySet())
                System.out.print("->"+u.getKey()+"("+u.getValue()+")");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        WeightedGraphNums wg = new WeightedGraphNums(4);
        wg.addEdge(0,1,2);
        wg.addEdge(1,3,2);
        wg.addEdge(3,2,1);
        wg.addEdge(2,0,3);
        wg.display();
    }
}