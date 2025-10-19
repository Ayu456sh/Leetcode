class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(candidates,target,0,new ArrayList<>(),ans);
        return ans;
    }
    private void helper(int[] candidates, int target, int idx, List<Integer> ds ,List<List<Integer>> ans){
        if(idx==candidates.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(candidates[idx]<=target){
            ds.add(candidates[idx]);
            helper(candidates,target-candidates[idx],idx,ds,ans);
            ds.remove(ds.size()-1);
        }
        helper(candidates,target,idx+1,ds,ans);
    }
}