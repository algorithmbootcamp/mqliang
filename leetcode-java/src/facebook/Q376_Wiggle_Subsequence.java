package facebook;

public class Q376_Wiggle_Subsequence {

    public int wiggleMaxLength(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int n = nums.length;
        int[] increasing = new int[n];
        int[] decreasing = new int[n];
        increasing[0] = 1;
        decreasing[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i-1]) {
                increasing[i] = decreasing[i-1]+1;
                decreasing[i] = decreasing[i-1];
            } else if (nums[i] < nums[i-1]) {
                decreasing[i] = increasing[i-1]+1;
                increasing[i] = increasing[i-1];
            } else {
                increasing[i] = increasing[i-1];
                decreasing[i] = decreasing[i-1];
            }
        }
        return Math.max(increasing[n-1], decreasing[n-1]);
    }

}
