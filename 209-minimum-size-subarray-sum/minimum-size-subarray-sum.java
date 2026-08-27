class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start=0;
        int end=0;

        int minSize= Integer.MAX_VALUE;
        int sum=0;
        int size=0;

        while(end<nums.length){

            if(sum<target){
                sum+=nums[end];
                size=(end-start)+1;
                end++;
            }
            else{
                minSize=Math.min(minSize,size);
                sum-=nums[start];
                size-=1;
                start++;
            }
        }
        while(sum>=target){
            minSize = Math.min(minSize,size);
            sum-=nums[start];
            size-=1;
            start++;
        }
        if(minSize == Integer.MAX_VALUE){
            minSize=0;
        }
        return minSize;
    }
}