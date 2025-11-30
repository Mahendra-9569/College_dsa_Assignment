package HashMap1;
import java.util.*;
public class frequentNumber {
    public static int findFrequentNumber(int[] nums) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int maxCount = 0;
        int frequentNum = nums[0];

        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            if (frequencyMap.get(num) > maxCount) {
                maxCount = frequencyMap.get(num);
                frequentNum = num;
            }
        }

        return frequentNum;
    }
}
