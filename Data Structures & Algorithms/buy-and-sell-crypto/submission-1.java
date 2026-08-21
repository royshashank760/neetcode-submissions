class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int profit = 0;

        for (int right = 1; right < prices.length; right++) {

            if (prices[right] > prices[left]) {
                int diff = prices[right] - prices[left];
                profit = Math.max(profit, diff);
            } else {
                left = right;
            }
        }

        return profit;
    }
}