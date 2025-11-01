import java.util.*;
public class subsequence {
    public static void generateSubsequences(int index, int nums[], List<Integer> current, List<List<Integer>> ans) {
    
        ans.add(new ArrayList<>(current));
        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);
            generateSubsequences(i+1, nums, current, ans);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
       int nums[] = {1,2,3};
       List<List<Integer>> ans = new ArrayList<>();
       generateSubsequences(0, nums, new ArrayList<>(), ans);
       System.out.println(ans);
    }
}
