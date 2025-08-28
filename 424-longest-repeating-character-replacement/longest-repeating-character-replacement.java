class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> mp = new HashMap<>();

        int start=0;
        int maxLength=0;
        int maxFreq=0;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch,1);
            }
            else{
                mp.put(ch,mp.get(ch)+1);
            }
            maxFreq = Math.max(maxFreq , mp.get(ch));
            while((i-start+1)-maxFreq > k){
                mp.put(s.charAt(start),mp.get(s.charAt(start))-1);
                start++;
            }
            maxLength = Math.max(maxLength,i-start+1);
        }
        return maxLength;
    }
}