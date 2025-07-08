class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty())return 0;
        
        HashMap<Character, Integer> mp = new HashMap<>();

        int maxCount=Integer.MIN_VALUE;
        int j=0;

        for(int i=0; i<s.length(); i++){
            char curr = s.charAt(i);
            if(mp.containsKey(curr)){   
                j = Math.max(j,mp.get(curr)+1);
            }
            mp.put(curr,i);
            maxCount=Math.max(maxCount,i-j+1);
        }
        return maxCount;
    }
}