import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by mqliang on 5/30/17.
 */
public class Q015_3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length-2; i++) {
            int l = i+1;
            int r = nums.length-1;
            while (l < r) {
                int a = nums[i], b = nums[l], c = nums[r];
                if (a+b+c < 0) {
                    l++;
                } else if (a+b+c > 0) {
                    r--;
                } else {
                    ans.add(Arrays.asList(a, b, c));
                    while (l < r && nums[l] == b) l++;
                    while (l < r && nums[r] == c) r--;
                }
            }
            while (i+1 < nums.length && nums[i+1] == nums[i]) i++;
        }
        return ans;
    }
}
