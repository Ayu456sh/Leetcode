class Solution {
    public String largestOddNumber(String num) {
        
        int lastOddIndex=-1;
        for(int i=0; i<num.length(); i++){
            char ch = num.charAt(i);
            
            if((ch-'0')%2!=0){
                lastOddIndex=i;
            }
        }
        if(lastOddIndex!=-1){
            return num.substring(0,lastOddIndex+1);
        }
        return "";
    }
}