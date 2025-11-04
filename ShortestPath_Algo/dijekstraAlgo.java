package ShortestPath_Algo;
import java.util.*;
public class dijekstraAlgo {
    static class Node{
        int dst;
        int wgt;
        public Node(int dst, int wgt){
            this.dst = dst;
            this.wgt = wgt;
        }
    }

    static class Pair implements Comparable<Pair>{
        int node;
        int wgt;
        public Pair(int node, int wgt){
            this.node = node;
            this.wgt = wgt;
        }
        @Override
        public int compareTo(Pair p){
            return this.wgt - p.wgt;
        }
    }

    public static void dijekstraAlgo(List<List<Node>> graph, int minWeight[], int src){
         PriorityQueue<Pair> pq = new PriorityQueue<>();
         pq.offer(new Pair(src, 0));
         while(!pq.isEmpty()){
            Pair curr = pq.poll();
            int node = curr.node;
            for(Node nei : graph.get(node)){
                int wgt = nei.wgt;
                int val = nei.dst;
                if(minWeight[node] + wgt < minWeight[val]){
                    minWeight[val] = minWeight[node] + wgt;
                    pq.offer(new Pair(val, minWeight[val]));
                }
            }
         }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();

        List<List<Node>> graph = new ArrayList<>();
        for(int i = 0; i<V; i++){
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i<E; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            graph.get(u).add(new Node(v, w));
            graph.get(v).add(new Node(u, w));
        }
        int src = sc.nextInt();
        int minWeight[] = new int[V];
        for(int i = 0; i<V; i++){
            if(i != src){
                minWeight[i] = Integer.MAX_VALUE;
            }
        }
        dijekstraAlgo(graph, minWeight, src);
    }
}
