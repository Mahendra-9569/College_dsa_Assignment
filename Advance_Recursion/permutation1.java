import java.util.*;
public class permutation1 {
    public static void generatePermutations(int index, int nums[], List<Integer> current, List<List<Integer>> ans) {
        if (index == nums.length) {
            ans.add(new ArrayList<>(current));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!current.contains(nums[i])) {
                current.add(nums[i]);
                generatePermutations(index + 1, nums, current, ans);
                current.remove(current.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        generatePermutations(0, nums, new ArrayList<>(), ans);
        System.out.println(ans);
    }
}
