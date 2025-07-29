class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(!mp.containsKey(nums[i])){
                mp.put(nums[i],1);
            }
            else{
                mp.put(nums[i],mp.get(nums[i])+1);
                return nums[i];
            }
            
        }
        return 0;
    }
}