package Trie;

public class Number_Implementation {
    static class Trie{
         Trie children[];
         boolean endOfWord;
         public Trie(){
            children = new Trie[10];
            endOfWord = false;
         }
    }

    public static void insertTrie(String number, Trie root){
       for(char ch: number.toCharArray()){
            int index = ch-'0';
            if(root.children[index] == null){
                root.children[index] = new Trie();
            }
            root = root.children[index];
       }
       root.endOfWord = true;
    }

    public static boolean searchTrie(String Number, Trie root){
          for(char ch: Number.toCharArray()){
            int index = ch-'0';
            if(root.children[index] == null){
                return false;
            }
            root = root.children[index];
          }
          return root.endOfWord;
    }

    public static void main(String args[]){
        String numbers[] = {"1234", "123", "12", "1"};
        Trie root = new Trie();
        for(String number: numbers){
            insertTrie(number, root);
        }

        System.out.println(searchTrie("9999", root));
    }
}
