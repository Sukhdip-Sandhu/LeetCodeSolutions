import java.util.HashMap;

class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int numTuples = 0;
        HashMap<Integer, Integer> sumOfAB = new HashMap<>();

        for (int a : A)
            for (int b : B)
                sumOfAB.put(a + b, sumOfAB.getOrDefault(a + b, 0) + 1);

        for (int c : C)
            for (int d : D)
                numTuples += sumOfAB.getOrDefault(0 - c - d, 0);

        return numTuples;
    }
}