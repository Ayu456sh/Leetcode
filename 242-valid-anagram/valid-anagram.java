class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        char [] ans1= s.toCharArray();
        char [] ans2= t.toCharArray();

        Arrays.sort(ans1);
        Arrays.sort(ans2);

        return Arrays.equals(ans1, ans2);
    }
}