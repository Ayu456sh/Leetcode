class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> mp = new HashSet<>();
        
        while(n!=1 ){
            if(mp.contains(n)){
                return false;
            }
            mp.add(n);
        int add=0;
        while(n>0){
            int digit =n%10;
            add+=digit*digit;
            n=n/10;
        }
        n=add;
    }
        return n==1;
    }
}