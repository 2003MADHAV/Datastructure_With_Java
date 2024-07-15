package graph;
public class GraphAdjMatrix {
    private int V;
    private int E;
    private int[][] adjMatrix;
    public GraphAdjMatrix(int nodes){
        this.V=nodes;
        this.E=0;
        this.adjMatrix = new int[nodes][nodes];
    }
    public void addEdge(int v, int u){
        adjMatrix[v][u]=1;
        adjMatrix[u][v]=1;
        E++;
    }
    public void display(){
        for(int v=0;v<adjMatrix.length;v++){
            System.out.print(v+": ");
            for(int u=0;u<adjMatrix[v].length;u++)
                System.out.print(adjMatrix[v][u]+" ");
            System.out.println();
        }
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(V+" vertices and "+E+" edges"+"\n");
        for(int v=0;v<V;v++){
            sb.append(v+" : ");
            for(int u:adjMatrix[v])
                sb.append(u+" ");
            sb.append("\n");
        }
        return sb.toString();
    }
    public static void main(String[] args){
        GraphAdjMatrix g = new GraphAdjMatrix(5);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,0);
        g.addEdge(1,4);
        g.addEdge(2,4);
        g.display();
        System.out.println(g);
    }
}