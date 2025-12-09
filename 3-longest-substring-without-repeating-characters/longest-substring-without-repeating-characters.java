class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()){
            return 0;
        }
        HashMap<Character,Integer> mp = new HashMap<>();

        int start=0;
        int maxLen =Integer.MIN_VALUE;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(mp.containsKey(ch)){
                start=Math.max(start,mp.get(ch)+1);
            }
            mp.put(ch,i);
            maxLen = Math.max(maxLen,i-start+1);
        }
        return maxLen;
    }
}