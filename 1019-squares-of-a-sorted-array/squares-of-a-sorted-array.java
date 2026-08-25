class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] ans = new int[nums.length];

        int start=0;
        int end = nums.length-1;

        for(int i=nums.length-1; i>=0; i--){
            int startSquare = nums[start]*nums[start];
            int endSquare = nums[end]*nums[end];

            if(startSquare>endSquare){
                ans[i]=startSquare;
                start++;
            } 
            else{
                ans[i]=endSquare;
                end--;
            }
        }
        return ans;
    }
}