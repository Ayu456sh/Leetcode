class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            ans[i]=-1;
            for(int j=i+1; j<i+nums.length; j++){
                int idx = j%nums.length;
                if(nums[idx]>nums[i]){
                    ans[i]=nums[idx];
                    break;
                }
            }
        }
        return ans;
    }
}