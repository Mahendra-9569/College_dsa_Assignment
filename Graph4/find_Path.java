package Graph4;
import java.util.*;
public class find_Path {
    private static boolean findPath(List<List<Integer>> graph, int node, int dst, boolean vis[]){
        if(node == dst)return true;
        vis[node] = true;
        for(int nei: graph.get(node)){
            if(!vis[nei]){
                if(findPath(graph, nei, dst, vis)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int edges = sc.nextInt();
             List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i< n; i++){
        graph.add(new ArrayList<>());
        }  

        for(int i = 0; i<edges; i++){
        int u = sc.nextInt();
        int v = sc.nextInt();
        graph.get(u).add(v);
        graph.get(v).add(u);
        }
        
        int source = sc.nextInt();
        int destination = sc.nextInt();
        boolean vis[] = new boolean[n];
        boolean ans = findPath(graph, source, destination, vis);

    }
}
