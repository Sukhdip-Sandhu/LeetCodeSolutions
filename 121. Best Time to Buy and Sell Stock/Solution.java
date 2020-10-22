class Solution {
    public static int maxProfit(int[] prices) {
        int minBuy = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minBuy)
                minBuy = price;
            else if (price - minBuy > maxProfit)
                maxProfit = price - minBuy;
        }
        return maxProfit;
    }
}