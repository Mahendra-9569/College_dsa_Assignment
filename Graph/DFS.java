import java.util.*;
public class DFS {
    public static void dfs(List<List<Integer>> graph, int curr, boolean vis[]){
        vis[curr] = true;
        System.out.print(curr + " ");
        for(int nei : graph.get(curr)){
            if(!vis[nei]){
                dfs(graph, nei, vis);
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();

        List<List<Integer>> graph = new ArrayList<>(); 
        for(int i = 0; i<V; i++){
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i<E; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean vis[] = new boolean[V];
        dfs(graph, 0, vis);
    }
}
