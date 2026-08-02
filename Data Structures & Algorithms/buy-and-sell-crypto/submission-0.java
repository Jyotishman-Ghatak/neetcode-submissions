class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;

        int i =0;
        int j = 0;
        
        while(j<prices.length){
            
            if(prices[j]<prices[i]){
                i = j;
            }
            else if(prices[j]>prices[i]){
                maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
            }
            j++;
        }

        return maxProfit;

    }
}
