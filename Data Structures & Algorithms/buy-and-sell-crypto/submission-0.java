class Solution {
    public int maxProfit(int[] prices) {
         int left = 0;
        int right = prices.length - 1;
        int profit = 0;
        while(left < right){
            if(prices[left] < prices[right]){
                int diff = prices[right] - prices[left];
                profit = Math.max(profit, diff);
                right--;

            }

            else if(prices[left] >= prices[right]){
                left++;
            }
        }

        return profit;
    }
}
