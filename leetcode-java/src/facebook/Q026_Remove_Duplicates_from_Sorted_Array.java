package facebook;

public class Q026_Remove_Duplicates_from_Sorted_Array {

    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k]) nums[++k] = nums[i];
        }
        return k+1;
    }

}
