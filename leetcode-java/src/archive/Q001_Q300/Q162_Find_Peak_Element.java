package archive.Q001_Q300;

public class Q162_Find_Peak_Element {

    public int findPeakElement(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i-1]) return i-1;
        }
        return nums.length-1;
    }

}