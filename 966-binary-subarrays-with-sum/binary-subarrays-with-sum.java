class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int a = ans(nums,goal);
        int b = ans(nums,goal-1);
        return a-b;
    }
    private int ans(int[] nums , int goal){
        int start=0;
        int end =0;
        int count=0;
        int sum=0;

        if(goal<0)return 0;
        while(end<nums.length){
            sum+=nums[end];
            while(sum>goal){
                sum=sum-nums[start];
                start++;
            }
            count=count+(end-start+1);
            end++;
        }
        return count;
    } 
}