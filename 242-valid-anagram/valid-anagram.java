class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        char [] ans1= s.toCharArray();
        char [] ans2= t.toCharArray();

        Arrays.sort(ans1);
        Arrays.sort(ans2);

        for(int i=0; i<s.length(); i++){
            if(ans1[i]!=ans2[i]){
                return false;
            }
        }
        return true;
    }
}