class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();

        Arrays.sort(strs);

        char[] start=strs[0].toCharArray();
        char[] end = strs[strs.length-1].toCharArray();

        for(int i=0;i<start.length; i++){
            if(start[i]!=end[i]){
                break;    
            }
            res.append(start[i]);
        }
        return res.toString();
    }
}