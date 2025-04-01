class Solution {
    public int help(int index, int[] prices, int decision, int[][] dp){
        if(index == prices.length){
            return 0;
        }
        if(dp[index][decision] != -1){
            return dp[index][decision];
        }
        int profit = 0;
        if(decision == 1){
            profit = Math.max(-prices[index] + help(index+1, prices, 0, dp), 0 + help(index+1, prices, 1, dp));
        }else{
            profit = Math.max(prices[index] + help(index+1, prices, 1, dp), 0 + help(index+1, prices, 0, dp));
        }
        return dp[index][decision] = profit;

    }
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2];
        for(int i = 0; i< prices.length; i++){
            for(int j = 0; j< 2; j++){
                dp[i][j] = -1;
            }
        }
        return help(0, prices, 1, dp);
    }
}