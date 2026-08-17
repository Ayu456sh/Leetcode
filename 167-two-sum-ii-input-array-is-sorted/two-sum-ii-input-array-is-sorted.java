class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> mp = new HashMap<>();

        int n = numbers.length; 
        for(int i=0; i<n;i++){
            if(!mp.containsKey(target-numbers[i])){
                mp.put(numbers[i],i+1);
            }
            else{
                return new int[]{mp.get(target-numbers[i]),i+1};
            }
        }
        return new int[]{-1,-1};
    }
}