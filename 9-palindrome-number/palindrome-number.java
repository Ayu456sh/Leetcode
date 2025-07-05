class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 || x%10==0 && x!=0){
            return false;
        }
        int digit =0;

        while(x>digit){
            digit=digit*10+ x%10;
            x=x/10;
        }
        return x==digit || x==digit/10;
    }
}