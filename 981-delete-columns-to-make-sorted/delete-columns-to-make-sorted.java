class Solution {
    public int minDeletionSize(String[] strs) {
        int cnt=0;
        int n = strs[0].length();
        int m = strs.length;

        for(int i=0; i<n; i++){
            for(int j=1; j<m; j++){
                if(strs[j].charAt(i)<strs[j-1].charAt(i)){
                    cnt++;
                    break;
                }
            }
        }
        return cnt;
    }
}