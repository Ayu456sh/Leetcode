class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> mp = new HashMap<>();

        int start=0;
        int end=0;
        int len=0;

        while(end<fruits.length){
            if(!mp.containsKey(fruits[end])){
                mp.put(fruits[end],1);
            }
            else{
                mp.put(fruits[end],mp.get(fruits[end])+1);
            }
            if(mp.size()>2){
                mp.put(fruits[start],mp.get(fruits[start])-1);
                if(mp.get(fruits[start])==0){
                    mp.remove(fruits[start]);
                }
                start++;
            }
            else if(mp.size()<=2){
                len=Math.max(len,end-start+1);
            }
            end++;
        }
        return len;
    }
}