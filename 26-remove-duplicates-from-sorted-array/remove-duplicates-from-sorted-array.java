class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Boolean> mp = new HashMap<>();
        int j=0;
        for(int i: nums){
            if(!mp.containsKey(i)){
                mp.put(i,true);
                nums[j]=i;
                j++;
            }
        }
        return mp.size();
    }
}