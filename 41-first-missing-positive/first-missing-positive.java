class Solution {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer,Boolean> mp = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n ;i++){
            if(nums[i]>=1){
                mp.put(nums[i],true);
            }
        }
        int miss =1;

        while(mp.containsKey(miss)){
            miss++;
        }
        return miss;
    }
}