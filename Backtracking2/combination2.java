import java.util.*;
public class combination2 {
    public static void generateCombinations(int index, int k, int nums[], List<Integer> current, List<List<Integer>> ans) {
        if (current.size() == k) {
            ans.add(new ArrayList<>(current));
            return;
        }
        if (index == nums.length) {
            return;
        }
        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }
            current.add(nums[i]);
            generateCombinations(i + 1, k, nums, current, ans);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        int nums[] = {1, 1, 2, 2};
        Arrays.sort(nums); 
        int k = 2;
        List<List<Integer>> ans = new ArrayList<>();
        generateCombinations(0, k, nums, new ArrayList<>(), ans);
        System.out.println(ans);
    }

}
