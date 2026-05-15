class Solution {
    public int maxProfit(int[] prices) {
        int p = 0;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < prices[p]) {
                p = i;
                continue;
            } else {
                int profit = prices[i] - prices[p];
                max = Math.max(max, profit);
            }
        }

        return max;
    }
}