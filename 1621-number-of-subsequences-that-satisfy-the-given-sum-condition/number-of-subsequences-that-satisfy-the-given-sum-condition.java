class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int mod = (int)(1e9+7);

        int[] powers = new int[nums.length];
        powers[0]=1;
        for(int i=1; i<nums.length; i++){
            powers[i]=(powers[i-1]*2)%mod;
        }
        int count=0;
        int start=0;
        int end = nums.length-1;

        while(start<=end){
            if((nums[start]+nums[end])<=target){
                count=(count+powers[end-start])%mod;
                start++;
            }
            else{
                end--;
            } 
        }
        return count;
    }
}