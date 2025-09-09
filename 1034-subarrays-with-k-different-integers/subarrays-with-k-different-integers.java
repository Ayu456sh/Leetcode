class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return helper(nums,k)-helper(nums,k-1);
    }
    private int helper(int[] nums , int k){
        HashMap<Integer,Integer> mp = new HashMap<>();

        int start=0;
        int end =0;
        int count=0;


        while(end<nums.length){
            if(!mp.containsKey(nums[end])){
                mp.put(nums[end],1);
            }
            else{
                mp.put(nums[end],mp.get(nums[end])+1);
            }

            while(mp.size()>k){
                mp.put(nums[start],mp.get(nums[start])-1);
                if(mp.get(nums[start])==0){
                    mp.remove(nums[start]);
                }
                start++;
            }
            count+=(end-start+1);
            end++;
        } 
        return count;
    }
}