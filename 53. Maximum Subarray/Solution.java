class Solution {
    public static int maxSubArray(int[] nums) {
        int maximumSoFar = nums[0];
        int maximumEndingHere = 0;
        for (int num : nums) {
            maximumEndingHere = maximumEndingHere + num;
            if (num > maximumEndingHere) {
                maximumEndingHere = num;
            }
            if (maximumEndingHere > maximumSoFar) {
                maximumSoFar = maximumEndingHere;
            }
        }
        return maximumSoFar;
    }
}