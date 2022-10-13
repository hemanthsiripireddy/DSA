package pac6;

public class BestTimetoBuyandSellStockwithTransactionFee {
	public int maxProfit(int[] prices, int fee) {
        int cash=0,holding=-prices[0];
        for(int i=1;i<prices.length;i++){
            cash =Math.max(cash,holding+prices[i]-fee);
            holding=Math.max(holding,cash-prices[i]);
        }
        return cash;
        
    }

}
