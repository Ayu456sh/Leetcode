class Solution {
    public long getDescentPeriods(int[] prices) {
        int start=0;
        int end =1;

        long count=0;
        
        
        while(end<prices.length){
            if(prices[end-1]-prices[end]==1){
                count+=(end-start+1);
            }
            else{
                start=end;
                count+=1;
            }
            end++;
        }
        return count+1;
    }
}