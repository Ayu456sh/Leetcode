class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> mp = new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n ;i++){
            if(nums[i]>=1){
                mp.add(nums[i]);
            }
        }
        int miss =1;

        while(mp.contains(miss)){
            miss++;
        }
        return miss;
    }
}