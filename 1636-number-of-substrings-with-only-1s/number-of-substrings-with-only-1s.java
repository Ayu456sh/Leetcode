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
                ones=0;
            }
            result=(result+ones)%mod;
        }
        return (int)result;
    }
}