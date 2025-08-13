class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {

        ArrayList<Integer> list = new ArrayList<>();
        int mod = (int)(1e9+7);
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                sum+=nums[j];
                list.add(sum);
            }
        }
        Collections.sort(list);
        int sum1=0;
        for(int i=left-1; i<right; i++){
            sum1=(sum1+list.get(i))%mod;
        }
        return sum1;
    }
}