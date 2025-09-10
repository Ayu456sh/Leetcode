class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> mp = new HashMap<>();

        int start=0;
        int end=0;
        int cnt=0;
        int minLen=Integer.MAX_VALUE;
        int sIdx=-1;
        
        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            
            if(!mp.containsKey(ch)){
                mp.put(ch,1);
            }
            else{
                mp.put(ch,mp.get(ch)+1);
            }
        }
        while(end<s.length()){
            char ch = s.charAt(end);

            if(mp.containsKey(ch)){
                if(mp.get(ch)>0){
                    cnt++;
                }
                mp.put(ch,mp.get(ch)-1);
            }

            while(cnt==t.length()){
                if(end-start+1 <minLen){
                    minLen=end-start+1;
                    sIdx=start;
                }

                char leftC = s.charAt(start);
                if(mp.containsKey(leftC)){
                    mp.put(leftC,mp.get(leftC)+1);

                    if(mp.get(leftC)>0){
                        cnt--;
                    }
                }
                start++;
            }
            end++;
        }
        if(sIdx==-1){
            return "";
        }
        return s.substring(sIdx,sIdx+minLen);
    }
}