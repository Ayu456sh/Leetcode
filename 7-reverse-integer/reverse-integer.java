class Solution {
    public int reverse(int x) {
        int p = Math.abs(x);
        int r=0;
        while(p>0){
            int digit = p%10;
            if(r>(Integer.MAX_VALUE-digit)/10){
                return 0;
            }
            r = r*10+digit;
            p/=10;
        }
        if(x<0){
            return -1*r;
        }
        else{
            return r;
        }
    }
}