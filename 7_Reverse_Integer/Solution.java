class Solution {
    public static int reverse(int x) {
        int lastDigit;
        long reversedNumber = 0;
        while (x != 0) {
            lastDigit = x % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            x = x / 10;
        }
        if (reversedNumber >= Integer.MAX_VALUE || reversedNumber <= -Integer.MAX_VALUE) {
            return 0;
        }
        return (int) reversedNumber;
    }
}