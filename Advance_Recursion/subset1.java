import java.util.*;
public class subset1 {
    public static void generateSubsets(int index, int nums[], List<Integer> current, List<List<Integer>> ans) {
      
         ans.add(new ArrayList<>(current));
         for(int i = index; i < nums.length; i++) {
             current.add(nums[i]);
             generateSubsets(i + 1, nums, current, ans);
             current.remove(current.size() - 1);    
         }
    }
  public static void main(String[] args) {
      int nums[] = {1,2,3};
      List<List<Integer>> ans = new ArrayList<>();
      generateSubsets(0, nums, new ArrayList<>(), ans);
      System.out.println(ans);
  }
}