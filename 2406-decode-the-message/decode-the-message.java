class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> map = new HashMap<>();
        
        map.put(' ',' ');

        char c = 'a';
        int idx=0;

        while(idx<key.length() && c<='z'){
            char ch = key.charAt(idx);

            if(ch!=' ' && !map.containsKey(ch)){
                map.put(ch, c);
                c++;
            }
            idx++;
        }

        StringBuilder ans = new StringBuilder();
        for(int i=0; i<message.length(); i++){
            char ch = message.charAt(i);
            ans.append(map.get(ch));
        }
        return ans.toString();
    }
}