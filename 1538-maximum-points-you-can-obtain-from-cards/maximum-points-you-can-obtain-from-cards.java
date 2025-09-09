class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lSum =0;
        int rSum=0;

        int sum=0;

        for(int i=0; i<k; i++){
            lSum+=cardPoints[i];
            sum=lSum;
        }
        int end = cardPoints.length-1;
        for(int i=k-1; i>=0; i--){
            lSum-=cardPoints[i];
            rSum+=cardPoints[end];
            end--;
            
            sum=Math.max(sum,lSum+rSum);
        }
        
        return sum;
    }
}