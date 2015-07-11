/**
 * Created by WangJQ on 2015/7/11.
 */
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0)
            return 0;

        int minBuy = prices[0];
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++) {
            if((prices[i] - minBuy) > maxProfit)
                maxProfit = prices[i] - minBuy;
            if(prices[i] < minBuy)
                minBuy = prices[i];
        }

        return maxProfit;
    }
}
