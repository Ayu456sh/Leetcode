class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> ds = new ArrayList<>();
        helper(0,s,ds,ans);
        return ans;
    }
    private void helper(int idx , String s , List<String> ds , List<List<String>> ans){
        if(idx==s.length()){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=idx; i<s.length(); i++){
            if(isPalindrome(s,idx,i)){
                ds.add(s.substring(idx,i+1));
                helper(i+1,s,ds,ans);
                ds.remove(ds.size()-1);
            }
        }
    }
    private boolean isPalindrome(String s , int start, int end){
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}