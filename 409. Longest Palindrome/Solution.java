class Solution {
    public int longestPalindrome(String s) {
        int[] map = new int[128];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map[c]++;
        }
        int ans = 0;
        boolean containsOdd = false;
        for (int val : map) {
            if (val % 2 == 0) {
                ans += val;
            } else {
                containsOdd = true;
                ans += val - 1;
            }
        }
        return containsOdd ? ans + 1 : ans;
    }
}