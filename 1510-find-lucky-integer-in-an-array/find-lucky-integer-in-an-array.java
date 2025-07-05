class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        
        for(int i=0; i<arr.length; i++){
            if(!mp.containsKey(arr[i])){
                mp.put(arr[i],1);
            }
            else{
                mp.put(arr[i],mp.get(arr[i])+1);
            }
        }
        int maxAns=-1;
        for(int i=0; i<arr.length; i++){
            if(mp.get(arr[i])==arr[i]){
                int ans = arr[i];
                if(ans>maxAns){
                    maxAns=ans;
                }
            }
        }
        return maxAns;
    }
}