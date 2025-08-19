class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.isEmpty()){
            return ans;
        }
        return helper("",digits);
    }
    private List<String> helper(String p , String up){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int num = up.charAt(0)-'0';
        List<String> list = new ArrayList<>();

        String letter = getLetters(num);
        for(int i=0; i<letter.length(); i++){
            char ch = letter.charAt(i);
            list.addAll(helper(p+ch,up.substring(1)));
        }
        return list;
    }
    private String getLetters(int num){
        switch(num){
            case 2: return "abc";
            case 3: return "def";
            case 4: return "ghi";
            case 5: return "jkl";
            case 6: return "mno";
            case 7: return "pqrs";
            case 8: return "tuv";
            case 9: return "wxyz";
            default: return "";
        }
    }
}