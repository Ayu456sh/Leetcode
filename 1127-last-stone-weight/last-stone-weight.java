class Solution {
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(stones);
        int n = stones.length;
        
        for(int i=0; i<n; i++){
            list.add(stones[i]);
        }
        while(list.size()>1){
            int subtract = list.get(list.size()-1)-list.get(list.size()-2);
            list.remove(list.get(list.size()-1));
            list.remove(list.get(list.size()-1));

            if(subtract>0){
                list.add(subtract);
                Collections.sort(list);
            }
        }
        if(list.isEmpty()){
            return 0;
        }
        else{
            return list.get(0);
        }
    }
}