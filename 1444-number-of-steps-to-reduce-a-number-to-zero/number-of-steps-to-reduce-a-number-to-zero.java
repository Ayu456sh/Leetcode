class Solution {
    public int numberOfSteps(int num) {
        
        int even = num/2;
        int odd = num-1;
        if(num==0){
            return 0;
        }
        if(num%2==0){
            return 1+numberOfSteps(even);
        }
        else{
            return 1+numberOfSteps(odd);
        }
    }
}