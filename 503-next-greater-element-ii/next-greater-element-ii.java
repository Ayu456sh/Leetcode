class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] nge = new int[nums.length];
        Arrays.fill(nge, -1);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1;j < i + nums.length; j++) {
                int idx = j % nums.length;
                if (nums[idx] > nums[i]) {
                    nge[i] = nums[idx];
                    break;
                }
            }
        }
        return nge;
    }
}