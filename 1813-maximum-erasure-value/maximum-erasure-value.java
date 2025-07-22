class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int start=0;
        int sum=0;
        int maxSum=0;
        
        HashSet<Integer> mp = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            while(mp.contains(nums[i])){
                sum-=nums[start];
                mp.remove(nums[start]);
                start++;
            }
            mp.add(nums[i]);
            sum+=nums[i];
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;
    }
}