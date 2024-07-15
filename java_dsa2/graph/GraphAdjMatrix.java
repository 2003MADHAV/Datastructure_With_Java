package graph;
public class GraphAdjMatrix {
    private int V;
    private int E;
    private int[][]  adjMatrix;
    public GraphAdjMatrix(int nodes){
        this.V = nodes;
        this.E = 0;
        this.adjMatrix = new int[nodes][nodes];
    }
    public void addEdge(int u, int v){
        adjMatrix[u][v]=1;
        adjMatrix[v][u]=1;
        E++;
    }
    public void display(){
        for(int i = 0; i < adjMatrix.length; i++) {
            for(int j = 0; j < adjMatrix[i].length; j++) {
                System.out.print(adjMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(V+" vertices and "+E+" edges "+"\n");
        for(int v=0;v<V;v++){
            sb.append(v+": ");
            for(int u:adjMatrix[v]){
                sb.append(u+" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        GraphAdjMatrix g = new GraphAdjMatrix(6);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,0);
        g.addEdge(3,4);
        g.addEdge(2,4);
        g.addEdge(1,5);
        g.addEdge(2, 5);
        System.out.println(g);
        System.out.println("Adjacency Matrix Representation of Graph:");
        g.display();
    }
}