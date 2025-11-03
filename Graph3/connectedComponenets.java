package Graph3;
import java.util.*;
public class connectedComponenets {

    public static void dfs(List<List<Integer>> graph, int node, boolean vis[]){
        vis[node] = true;
        for(int nei: graph.get(node)){
            if(!vis[nei]){
                dfs(graph, nei, vis);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vertex = sc.nextInt();
        int edge = sc.nextInt();
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < vertex; i++) {
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i<edge; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        
        boolean vis[] = new boolean[vertex];
        int count = 0;
        for(int i = 0; i < vertex; i++){
            if(!vis[i]){
                count++;
                dfs(graph, i, vis);
            }
        }
        System.out.println(count);
    }
}
