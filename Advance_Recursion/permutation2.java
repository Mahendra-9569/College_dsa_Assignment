import java.util.*;
public class permutation2 {
    public static void generatePermutations(int index, int nums[], List<Integer> current, List<List<Integer>> ans, boolean vis[]) {
         if(index == nums.length){
             ans.add(new ArrayList<>(current));
             return;
         }
         for(int i = 0; i < nums.length; i++){  
            if(vis[i])continue;
            if(i > 0 && nums[i] == nums[i - 1] && !vis[i - 1]);
            vis[i] = true;
            current.add(nums[i]);
            generatePermutations(index + 1, nums, current, ans, vis);
            current.remove(current.size() - 1);
            vis[i] = false;
         }
    }
    public static void main(String args[]){
        int nums[] = {1, 1 ,2};
        boolean vis[] = new boolean[nums.length];
        List<List<Integer>> ans = new ArrayList<>();
        generatePermutations(0, nums, new ArrayList<>(), ans, vis);
        System.out.println(ans);
    }
}
