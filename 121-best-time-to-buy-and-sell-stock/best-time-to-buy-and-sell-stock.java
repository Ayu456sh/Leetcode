class Solution {
    public int maxProfit(int[] prices) {

        if(prices.length==1)return 0;
        
        int maxProfit = Integer.MIN_VALUE;
        int minPrice = prices[0];
        for(int i=1; i<prices.length; i++){
            if(minPrice>prices[i]){
                minPrice=prices[i];
            }
            int maxPrice = Math.max(minPrice , prices[i]);
            int profit = maxPrice-minPrice;
            if(profit>maxProfit){
                maxProfit=profit;
            }
        }
        return maxProfit;
    }
}