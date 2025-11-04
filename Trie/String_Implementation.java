package Trie;
import java.util.*;
public class String_Implementation {
    static class Trie{
        Trie children[];
        boolean endOfWord;
        public Trie(){
            children = new Trie[26];
            endOfWord = false;
        }
    }

    public static void insertTrie(String word, Trie root){
         for(char ch: word.toCharArray()){
            int index = ch-'a';
            if(root.children[index] == null){
                root.children[index] = new Trie();
            }
                root = root.children[index];
         }
         root.endOfWord = true;
    }

    public static boolean searchPrefix(String word, Trie root){
       for(char ch: word.toCharArray()){
          int index = ch-'a';
          if(root.children[index] == null){
            return false;
          }
          root = root.children[index];
       }
       return root.endOfWord;
    }
    public static boolean isEmpty(Trie root){
        for(int i = 0; i<26; i++){
            if(root.children[i] != null){
                return false;
            }
        }
        return true;
    }
    public static Trie removeWord(Trie root, String word, int len){
        if(root == null){
            return null;
        }
        if(len == word.length()){
            if(root.endOfWord){
                root.endOfWord = false;
            }
            if(isEmpty(root)){
                root = null;
            }
            return root;
        }
        int index = word.charAt(len)-'a';
        root.children[index] = removeWord(root.children[index], word, len+1);
        if(isEmpty(root) && root.endOfWord == false){
            root = null;
        }
        return root;
    }

    public static int countOfWords(Trie root){
         if(root == null){
            return 0;
         }
         int count = 0;
         if(root.endOfWord){
            count++;
         }
         for(int i = 0; i<26; i++){
            if(root.children[i] != null){
                count += countOfWords(root.children[i]);
            }
         }
         return count;
    }
    public static void main(String args[]){
        String words[] = {"apple", "appl", "app", "ap", "a"};
        Trie root = new Trie();
        for(String word: words){
            insertTrie(word, root);
        }
        System.out.println(searchPrefix(words[2], root));
        System.out.println(countOfWords(root));
    }

}
