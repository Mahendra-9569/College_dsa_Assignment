package ShortestPath_Algo;
import java.util.*;
public class bellmanFord_Algo {
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         int V = sc.nextInt();
         int E = sc.nextInt();
         
         int graph[][] = new int[E][3];
         for(int i = 0; i<E; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            graph[i][0] = u;
            graph[i][1] = v;
            graph[i][2] = w;
         }

         int dist[] = new int[V];
         int src = sc.nextInt();
         for(int i = 0;  i<V; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
            else{
                dist[i] = 0;
            }
         }

           for(int i = 1; i<=V-1; i++){
            for(int arr[]: graph){
                int u = arr[0];
                int v = arr[1];
                int w = arr[2];
                if(dist[u] != (int)1e8 && dist[u] + w < dist[v]){
                    dist[v] = dist[u] + w;
                }
            }
        }
        for(int arr[]: graph){
                int u = arr[0];
                int v = arr[1];
                int w = arr[2];
                if(dist[u] != (int)1e8 && dist[u] + w < dist[v]){
                    System.out.println(-1);
                }
        } 
        System.out.println(dist);
    }
}
