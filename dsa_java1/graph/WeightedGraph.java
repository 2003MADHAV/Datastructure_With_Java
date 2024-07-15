package graph;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class WeightedGraph {
    private int V;
    private int E;
    private Map<Character,Map<Character,Integer>> adjList;
    public WeightedGraph(int nodes){
        this.V=nodes;
        this.E=0;
        adjList= new HashMap<>(); 
        for(char v='A';v<'A'+V;v++){
            adjList.put(v, new HashMap<Character,Integer>());
        }
    }
    public void addEdge(char v, char u, int weight){
        adjList.get(v).put(u, weight);
        adjList.get(u).put(v,weight);
        E++;
    }
    public void display(){
        for(char v='A';v<'A'+V;v++){
            System.out.print(v+":");
            for(Entry<Character,Integer> u: adjList.get(v).entrySet()){
                System.out.print("->"+u.getKey()+"("+u.getValue()+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        WeightedGraph wg = new WeightedGraph(4);
        wg.addEdge('A','B',1);
        wg.addEdge('A','C',2);
        wg.addEdge('C','D',2);
        wg.addEdge('D','B',3);
        wg.display();
    }
}