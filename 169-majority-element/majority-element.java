class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();

        int max =0;
        for(int i=0; i<nums.length; i++){
            if(!mp.containsKey(nums[i])){
                mp.put(nums[i],1);
            }
            else{
                mp.put(nums[i],mp.get(nums[i])+1);
            }
        }
        for(int x : mp.keySet()){
            if(mp.get(x)>nums.length/2){
                max=x;
            }
        }
        return max;
    }
}