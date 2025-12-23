class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 || x%10==0 && x!=0){
            return false;
        }
        int org =0;
        while(x>org){
            org=org*10+x%10;
            x=x/10;
        }
        return org==x || x==org/10;
    }
}