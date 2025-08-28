class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int start=0;
        int maxFreq=0;
        int maxLength=0;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            freq[ch-'A']++;
            maxFreq=Math.max(maxFreq,freq[ch-'A']);

            if((i-start+1)-maxFreq > k){
                freq[s.charAt(start)-'A']--;
                start++;
            }
            maxLength=Math.max(maxLength,i-start+1);
        }
        return maxLength;
    }
}