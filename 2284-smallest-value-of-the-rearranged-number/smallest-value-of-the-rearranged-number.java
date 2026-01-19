class Solution {
    public long smallestNumber(long num) {
        if(num==0){
            return 0;
        }

        String digits = String.valueOf(Math.abs(num));
        char[] numStr = digits.toCharArray();
        Arrays.sort(numStr);

        if(num >=0 && numStr[0] =='0'){
            int i=1;
            while(i<numStr.length){
                if(numStr[i]!='0'){
                    numStr[0]^= numStr[i];
                    numStr[i]^=numStr[0];
                    numStr[0]^=numStr[i];
                    break;
                }
                i++;
            }
        }

        StringBuilder sb = new StringBuilder(new String(numStr));

        if(num<0){
            num = -(Long.parseLong(sb.reverse().toString()));
        }
        else{
           num = Long.parseLong(sb.toString());
        }
        return num;
    }
}