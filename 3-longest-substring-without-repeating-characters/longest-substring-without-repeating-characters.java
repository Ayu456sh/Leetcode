class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()){
            return 0;
        }
        HashMap<Character,Integer> mp = new HashMap<>();

        int max=Integer.MIN_VALUE;
        int start=0;
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if(mp.containsKey(c)){
                start=Math.max(start,mp.get(c)+1);
            }
            mp.put(c,i);
            max=Math.max(max,i-start+1); 
        }
        return max;
    }
}