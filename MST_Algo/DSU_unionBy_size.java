public class DSU_unionBy_size {
    static int parArr[];
    static int sizeArr[];
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
         if(sizeArr[par1] > sizeArr[par2]){
            parArr[par2] = par1;
            sizeArr[par1] += sizeArr[par2];
         }
         else{
            parArr[par1] = par2;
            sizeArr[par2] += sizeArr[par1];
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
        sizeArr = new int[10];
        for(int i = 0; i<10; i++){
            parArr[i] = i;
            sizeArr[i] = 1;
        }
        System.out.println(isSameComponent(0, 1));
        union(0, 1);
        System.out.println(isSameComponent(0, 1));
    }
}
