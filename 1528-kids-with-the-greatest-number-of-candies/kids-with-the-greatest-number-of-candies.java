class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max=0;

        for(int i=0; i<candies.length; i++){
            int currMax = candies[i];

            if(currMax>max){
                max=currMax;
            }
        }
        for(int i=0; i<candies.length; i++){
            if(candies[i]+extraCandies>=max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}