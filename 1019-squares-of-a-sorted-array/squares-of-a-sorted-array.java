class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int start=0;
        int end = n-1;

        for(int i=n-1; i>=0; i--){
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