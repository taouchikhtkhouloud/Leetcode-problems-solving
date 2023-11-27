class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
       int dp=0;
        
        for (int i = 1; i < n; i++) {
            dp = Math.max(dp + prices[i] - prices[i - 1], dp);
        }
        
        return dp;
    }
}
