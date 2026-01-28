class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do{
            slow = isSquare(slow);
            fast = isSquare(isSquare(fast));
        }
        while(slow!=fast);

        if(slow==1){
            return true;
        }
        return false;
    }
    public int isSquare(int n){
        int ans =0;
        while(n>0){
            int rem = n%10;
            ans+=rem*rem;
            n=n/10;
        }
        return ans;
    }
}