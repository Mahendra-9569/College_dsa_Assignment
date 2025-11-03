package Graph4;
import java.util.*;
public class find_total_Paths {
    public static void findPaths(List<List<Integer>> graph, int node, int dest, List<Integer> curr, boolean vis[], List<List<Integer>> ans){
        curr.add(node);
        vis[node] = true;
        if(node == dest){
            ans.add(new ArrayList<>(curr));
        }

        for(int nei :graph.get(node)){
            if(!vis[nei]){
                findPaths(graph, nei, dest, curr, vis, ans);
            }
        }
        curr.remove(curr.size()-1);
        vis[node] = false;
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
        }
        
        List<List<Integer>> ans = new ArrayList<>();
        boolean vis[] = new boolean[vertex];
        findPaths(graph, 0, vertex-1, new ArrayList<>(), vis, ans);

    }
}
