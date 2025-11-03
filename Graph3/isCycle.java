package Graph3;
import java.util.*;
public class isCycle {
    public static boolean detectCycle(List<List<Integer>>graph, boolean vis[], boolean pathvis[], int node){
        vis[node] = true;
        pathvis[node] = true;
        for(int nei: graph.get(node)){
            if(!vis[nei]){
                if(detectCycle(graph, vis, pathvis, nei)){
                    return true;
                }
            }
            else if(pathvis[nei] == true){
                return true;
            }
        }
        
        pathvis[node] = false;
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int vertex = sc.nextInt();
        int edge = sc.nextInt();
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i<vertex; i++){
           graph.add(new ArrayList<>());
        }
        for(int i = 0; i<edge; i++){
           int u = sc.nextInt();
           int v = sc.nextInt();
           graph.get(u).add(v);
        }
        boolean pathvis[] = new boolean[vertex];
        boolean vis[] = new boolean[vertex];
        for(int i = 0; i<vertex; i++){
           if(!vis[i]){
               if(detectCycle(graph, vis, pathvis, i)){
                   System.out.println("Graph has cycle");
               }
           }
       }
       System.out.println("Graph does not has cycle");
    }
}
