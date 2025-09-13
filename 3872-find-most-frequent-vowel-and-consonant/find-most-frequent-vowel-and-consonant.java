class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> mp = new HashMap<>();
        int maxVowel=0;
        int maxConst=0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch,1);
            }
            else{
                mp.put(ch,mp.get(ch)+1);
            }

            if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'){
                maxVowel=Math.max(maxVowel,mp.get(ch));
            }
            else{
                maxConst=Math.max(maxConst,mp.get(ch));
            }
        }
        return maxVowel+maxConst;
    }
}