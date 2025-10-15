class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] neg = new int[nums.length/2];
        int[] pos = new int[nums.length/2];

        int pve=0;
        int nve=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0){
                pos[pve++]=nums[i];
            }
            else{
                neg[nve++]=nums[i];
            }
        }
        pve=0;
        nve=0;

        for(int i=0; i<nums.length; i++){
            if(i%2==0){
                nums[i]=pos[pve++];
            }
            else{
                nums[i]=neg[nve++];
            }
        }
        return nums;
    }
}