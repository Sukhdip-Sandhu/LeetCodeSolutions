class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int len = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                // same as before
            } else {
                len++;
                nums[len - 1] = nums[i];
            }
        }

        return len;
    }
}