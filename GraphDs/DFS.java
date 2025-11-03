
import java.util.*;
public class DFS {
    public static void dfsTraversal(ArrayList<ArrayList<Integer>> graph, int node, boolean vis[]){
        vis[node] = true;
        System.out.print(node + " ");
        for(int nei: graph.get(node)){
            if(!vis[nei]){
                dfsTraversal(graph, nei, vis);
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int vertex = sc.nextInt();
        int edge = sc.nextInt();
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < vertex; i++){
            graph.add(new ArrayList<>());
        }
        for(int i = 0; i < edge; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v);
        }
        boolean vis[] = new boolean[vertex];
        for(int i = 0; i < vertex; i++){
            if(!vis[i]){
                dfsTraversal(graph, i, vis);
            }
        }
    
        
    }
}
