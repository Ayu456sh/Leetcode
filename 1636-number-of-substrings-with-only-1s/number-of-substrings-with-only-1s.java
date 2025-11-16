class Solution {
    public int numSub(String s) {
        long mod = 1000000007;
        long ones=0;
        long result=0;

        for(char c : s.toCharArray()){
            if(c=='1'){
                ones+=1;
            }
            else{
                long sum=(ones*(ones+1)/2)%mod;
                result=(result+sum)%mod;
                ones=0;
            }
        }
        long sum=(ones*(ones+1)/2)%mod;
        result=(result+sum)%mod;
        return (int)result;
    }
}