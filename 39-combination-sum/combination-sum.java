class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> ans = new ArrayList<>();
        helper(candidates,0,target,ans,new ArrayList<>());
        return ans;
    }
private void helper(int[] candidates,int idx,int target,List<List<Integer>> ans,List<Integer> ds){
        if(idx==candidates.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(candidates[idx]<=target){
            ds.add(candidates[idx]);
            helper(candidates,idx,target-candidates[idx],ans,ds);
            ds.remove(ds.size()-1);
        }
        helper(candidates,idx+1,target,ans,ds);
    }
}