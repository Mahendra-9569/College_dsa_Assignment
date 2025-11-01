import java.util.*;
public class combination1 {
    public static void generateCombinations(int index, int k, int nums[], List<Integer> current, List<List<Integer>> ans) {
        if (current.size() == k) {
            ans.add(new ArrayList<>(current));
            return;
        }
        if (index == nums.length) {
            return;
        }
        current.add(nums[index]);
        generateCombinations(index + 1, k, nums, current, ans);
        current.remove(current.size() - 1);

        generateCombinations(index + 1, k, nums, current, ans);
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4};
        int k = 2;
        List<List<Integer>> ans = new ArrayList<>();
        generateCombinations(0, k, nums, new ArrayList<>(), ans);
        System.out.println(ans);
    }

}
