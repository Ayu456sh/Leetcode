class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int p=x;
        int r =0;
        while(p>0){
            int digit = p%10;
            r=r*10+digit;
            p/=10;
        }
        return r==x;
    }
}