class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for(int i =0; i<s.length(); i++){

            if(st.isEmpty()){
                st.push(s.charAt(i));
            }
            else{

                if(s.charAt(i)=='('){
                st.push(s.charAt(i));
                ans.append(s.charAt(i));
                }
                else{
                    st.pop();

                    if(st.isEmpty()){
                        continue;
                    }
                    else{
                        ans.append(s.charAt(i));
                    }
                }
            }
        }
        return ans.toString();
    }
}