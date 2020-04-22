class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int trappedWater = 0;
        int[] LR = new int[n];

        int max = -1;
        for (int i = 0; i < n; i++) {
            if (height[i] >= max) {
                max = height[i];
                LR[i] = -1;
            } else {
                LR[i] = max - height[i];
            }
        }

        max = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (height[i] >= max) {
                max = height[i];
            } else {
                if (LR[i] != -1)
                    trappedWater += Math.min(LR[i], max - height[i]);
            }
        }

        return trappedWater;
    }
}