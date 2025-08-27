class Solution {
    public int longestOnes(int[] nums, int k) {
        int start=0;
        int end=0;
        int count=0;
        int maxLength=Integer.MIN_VALUE;

        while(end<nums.length){
            if(nums[end]==0){
                count++;
            }

            while(count>k){
                if(nums[start]==0){
                    count--;
                }
                start++;
            }
            maxLength=Math.max(maxLength,end-start+1);
            end++;
        }
        return maxLength;
    }
}