import java.util.*;
public class BFS{
    public static void bfsTraversal(ArrayList<ArrayList<Integer>> graph, int node, boolean vis[]){
       Queue<Integer> q = new LinkedList<>();
       q.add(node);
       vis[node] = true;
       while(!q.isEmpty()){
           int curr = q.poll();
           System.out.print(curr + " ");
           for(int nei: graph.get(curr)){
               if(!vis[nei]){
                   q.add(nei);
                   vis[nei] = true;
               }
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
                bfsTraversal(graph, i, vis);
            }
        }  

    }
}