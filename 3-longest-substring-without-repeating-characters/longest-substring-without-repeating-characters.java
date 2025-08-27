class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()){
            return 0;
        }
        HashMap<Character,Integer> map = new HashMap<>();

        int start=0;
        int max=Integer.MIN_VALUE;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                start=Math.max(start,map.get(ch)+1);
            }
            map.put(ch,i);
            max=Math.max(max,i-start+1);
        }
        return max;
    }
}