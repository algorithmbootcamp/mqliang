package facebook.sliding_window;

import java.util.*;

public class Q325_Maximum_Size_Subarray_Sum_Equals_k {

    public int maxSubArrayLen(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum-k)) {
                result = Math.min(result, i-map.get(sum-k));
            }
            map.putIfAbsent(sum, i);
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }

}
