package google;

public class Q377_Combination_Sum_IV_B {

    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 1; i <= target; i++) {
            for (int num : nums) {
                if (i < num) continue;
                dp[i] += dp[i - num];
            }
        }
        return dp[target];
    }

}
