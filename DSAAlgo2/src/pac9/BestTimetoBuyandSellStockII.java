package pac9;

public class BestTimetoBuyandSellStockII {
	public int maxProfit(int[] prices) {
        int ans=0,it=prices[0],p=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                p=prices[i]-it;
            }else{
                
                ans+=p;
                p=0;
                it=prices[i];
            }

        }
        
            ans+=p;
       
        return ans;
        
    }

}
