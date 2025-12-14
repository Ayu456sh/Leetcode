class Solution {
    public int lengthOfLastWord(String s) {
        String st = s.trim();
        int count=0;

        for(int i=st.length()-1; i>=0; i--){
            char ch = st.charAt(i);
            if(ch==' '){
                break;
            }
            count++;
        }
        return count;
    }
}