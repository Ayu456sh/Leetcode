class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int cnt=0;
        boolean firstOne=false;

        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                cnt++;
            }
            else{
                if(firstOne && cnt<k){
                    return false;
            }
                cnt=0;
                firstOne=true;
            }
        }
        return true;
    }
}