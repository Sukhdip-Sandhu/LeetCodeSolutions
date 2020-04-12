class Solution {
    public int addDigits(int num) {
        if (num >= 0 && num <= 9) {
            return num;
        }
        int solution;
        do {
            solution = 0;
            while (num > 0) {
                int remainder = num % 10;
                solution += remainder;
                num = num / 10;
            }
            num = solution;
        } while (solution >= 10);
        return solution;
    }
}