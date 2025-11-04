package Trie;

public class max_minXOR_trie_Implementation {
    static class Trie{
         Trie children[];
         boolean endOfWord;
         public Trie(){
            children = new Trie[2];
            endOfWord = false;
         }
    }
    public static void insertTrie(int num, Trie root){
        for(int i = 32; i>=0; i--){
            int index = (num >> i)&1;
            if(root.children[index] == null){
                root.children[index] = new Trie();
            }
            root = root.children[index];
        }
        root.endOfWord = true;
    }
    public static boolean searchTrie(int num, Trie root){
        for(int i = 32; i>=0; i--){
            int index = (num >> i)&1;
            if(root.children[index] == null){
                return false;
            }
            root = root.children[index];
        }
        return root.endOfWord;
    }
    public static int maxXor(int num, Trie root){
        int maxAns = 0;
        for(int i = 32; i>=0; i--){
            int index = (num >> i)&1;
            int toggledIndex = 1 - index;
            if(root.children[toggledIndex] != null){
                maxAns |= (1<<i);
                root = root.children[toggledIndex];
            }
            else{
                root = root.children[index];
            }
        }
        return maxAns;
    }

    public static int minXor(int num, Trie root){
        int minAns = 0;
        for(int i = 32; i>=0; i--){
            int index = (num >> i)&1;
            if(root.children[index] != null){
                root = root.children[index];
            }
            else{
                  minAns = minAns | (1 << i);
                  root = root.children[index];
            }
          
        }
        return minAns;
    }
    public static void main(String args[]){
        int nums[] = {7, 8};
        Trie root = new Trie();
        for(int num : nums){
            insertTrie(num, root);
        }

        System.out.println(maxXor(7, root));
        System.out.println(minXor(7, root));
        System.out.println(searchTrie(27, root));
    }
}
