class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> mp = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            if(!mp.contains(nums[i])){
                mp.add(nums[i]);
            }
        }
        if(mp.size()==nums.length){
            return false;
        }
        return true;
    }
}