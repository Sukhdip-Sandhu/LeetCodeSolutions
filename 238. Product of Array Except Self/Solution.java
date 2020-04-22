class Solution {
    public static int[] productExceptSelf(int[] nums) {
        int arrayLength = nums.length;
        int[] leftProduct = new int[arrayLength];
        int[] rightProduct = new int[arrayLength];
        leftProduct[0] = 1;
        rightProduct[arrayLength - 1] = 1;
        for (int i = 1; i < arrayLength; i++)
            leftProduct[i] = leftProduct[i - 1] * nums[i - 1];
        for (int i = arrayLength - 2; i >= 0; i--)
            rightProduct[i] = rightProduct[i + 1] * nums[i + 1];
        for (int i = 0; i < arrayLength; i++)
            nums[i] = leftProduct[i] * rightProduct[i];
        return nums;
    }
}