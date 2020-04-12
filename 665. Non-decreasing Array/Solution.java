class Solution {
    public static boolean checkPossibility(int[] nums) {
        if (isAscendingOrder(nums)) {
            return true;
        }
        int[] t1 = nums.clone();
        int[] t2 = nums.clone();
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] > nums[i+1]) {
                t1[i] = t1[i+1];
                t2[i+1] = t2[i];
                return isAscendingOrder(t1) || isAscendingOrder(t2);
            }
        }
        return false;
    }

    public static boolean isAscendingOrder(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            if (array[i + 1] < array[i]) {
                return false;
            }
        }
        return true;
    }
}