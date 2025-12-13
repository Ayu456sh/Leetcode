class Solution {
    public int reverse(int x) {
        int num = Math.abs(x);
        int reversed =0;
        
        while(num>0){
            int digit = num%10;

            if(reversed>(Integer.MAX_VALUE-digit)/10){
                return 0;
            }
            reversed = reversed*10+digit;
            num=num/10;
        }
        if(x<0){
            reversed*=-1;
        }
        return reversed;
    }
}