class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();

        for(int i=0; i<num.length(); i++){
            while(!st.isEmpty() && k>0 && (st.peek()-'0')>(num.charAt(i)-'0')){
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }
        while(k>0){
            st.pop(); // [1,2,3,4,5] and k=2  then till end we will pop the end 2 elements.
            k--; // this loop is for if the stack haven't remove a element from stack till last.
        }
        StringBuilder res = new StringBuilder();
        if(st.isEmpty())return "0";
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        res.reverse();
        while(res.length()!=0 && res.charAt(0)=='0'){
            res.deleteCharAt(0);
        }
        if(res.isEmpty())return "0";

        return res.toString();
    }
}