class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> mp = new HashMap<>();

        int start=0;
        int length=0;

        for(int end=0; end<fruits.length; end++){
            if(!mp.containsKey(fruits[end])){
                mp.put(fruits[end],1);
            }
            else{
                mp.put(fruits[end],mp.get(fruits[end])+1);
            }
            while(mp.size()>2){
                mp.put(fruits[start],mp.get(fruits[start])-1);
                if(mp.get(fruits[start])==0){
                    mp.remove(fruits[start]);
                }
                start++;
            }
            if(mp.size()<=2){
                length=Math.max(length,end-start+1);
            }
        }
        return length;
    }
}