class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            return list;
        }
        return helper("",digits);
    }
    private List<String> helper(String p , String digits){
        if(digits.isEmpty()){
            ArrayList<String> res = new ArrayList<>();
            res.add(p);
            return res;
        }
        int num = digits.charAt(0)-'0';
        
        ArrayList<String> list = new ArrayList<>();

        String letter = getLetters(num);
        for(int i = 0; i<letter.length(); i++){
            
            char ch = letter.charAt(i);
            list.addAll(helper(p+ch, digits.substring(1)));
        }
        return list;
    }
    private String getLetters(int num){
        switch(num){
            case 2 : return "abc";
            case 3 : return "def";
            case 4 : return "ghi";
            case 5 : return "jkl";
            case 6 : return "mno";
            case 7 : return "pqrs";
            case 8 : return "tuv";
            case 9 : return "wxyz";
            default: return "";
        }
    }
}