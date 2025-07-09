class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Boolean> mp = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(!mp.containsKey(nums[i])){
                mp.put(nums[i],false);
            }
            else{
                mp.put(nums[i],true);
                return true;
            }
        }
        return false;
    }
}