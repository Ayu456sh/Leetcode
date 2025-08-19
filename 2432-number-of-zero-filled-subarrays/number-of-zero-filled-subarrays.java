class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count =0;
        long currStreak=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                currStreak++;
                count+=currStreak;
            }
            else{
                currStreak=0;
            }
        }
        return count;
    }
}