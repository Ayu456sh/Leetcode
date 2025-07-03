class Solution {
    public String reverseWords(String s) {
        String[] ans = s.trim().split(" +");

        for(int i=0; i<ans.length/2; i++){
            String temp = ans[i];
            ans[i]= ans[ans.length-1-i];
            ans[ans.length-1-i]= temp;
        }
        return String.join(" ",ans);
    }
}