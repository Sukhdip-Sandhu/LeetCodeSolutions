/**
 * NOT AN ELEGANT SOLUTION :(
 */
class Solution {
    public int[] dailyTemperatures(int[] T) {
        for (int i = 0; i < T.length - 1; i++) {
            boolean hasGreaterValue = false;
            int days = 0;
            for (int j = i + 1; j < T.length; j++) {
                days++;
                if (T[i] < T[j]) {
                    T[i] = days;
                    hasGreaterValue = true;
                    break;
                }
            }
            if (!hasGreaterValue) {
                T[i] = 0;
            }
        }
        T[T.length - 1] = 0;
        return T;
    }
}