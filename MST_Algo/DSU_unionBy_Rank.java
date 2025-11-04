public class DSU_unionBy_Rank {
    static int parArr[];
    static int rankArr[];
    public static int parent(int node){
        if(node == parArr[node]){
            return node;
        }
        return parArr[node] = parent(parArr[node]);
    }
    public static void union(int u, int v){
        int par1 = parent(u);
        int par2 = parent(v);

        if(par1 == par2){
            return;
        }

        if(rankArr[par1] > rankArr[par2]){
            parArr[par2] = par1;
        }
        else if(rankArr[par1] < rankArr[par2]){
            parArr[par1] = par2;
        }
        else{
            parArr[par2] = par1;
            rankArr[par1]++;
        }
    }
    public static boolean isSameComponent(int u, int v){
        int par1 = parent(u);
        int par2 = parent(v);
        if(par1 == par2){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        parArr = new int[10];
        rankArr = new int[10];
        for(int i = 0; i<10; i++){
            parArr[i] = i;
            rankArr[i] = 0;
        }
       System.out.println(isSameComponent(0, 1));
       union(0, 1);
       System.out.println(isSameComponent(0, 1));
    }
}
