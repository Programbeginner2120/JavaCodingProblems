// URL: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/

public class BestStockPick {
    private int checkMaxProfit(int maxProfit, int buy, int sell, int [] prices){
        int currProfit = prices[sell] - prices[buy];
        if (currProfit > maxProfit){
            maxProfit = currProfit;
        }
        return maxProfit;
    }
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int currProfit = 0;
        int buy = 0;
        int sell = 1;
        while (sell < prices.length){
            currProfit = prices[sell] - prices[buy];
            maxProfit = this.checkMaxProfit(maxProfit, buy, sell, prices);
            if (currProfit <= 0){
                buy++;
            }
            if (currProfit > 0 || buy == sell){
                sell++;
            }
        }
        while (buy < prices.length - 1){
            this.checkMaxProfit(maxProfit, buy, sell - 1, prices);
            buy++;
        }
        return maxProfit;
    }
}