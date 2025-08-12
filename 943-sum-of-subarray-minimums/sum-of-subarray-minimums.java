class Solution {
    public int sumSubarrayMins(int[] arr) {
        int total =0;
        int mod = (int)(1e9+7);

        ArrayList<Integer> nse = findNSE(arr);
        ArrayList<Integer> pse = findPSE(arr);

        for(int i=0; i<arr.length; i++){
            int left = i-pse.get(i);
            int right = nse.get(i)-i;
            long contribution = (long) left*right*arr[i];
            total =(int)((total+contribution)%mod);
        }
        return total;
    }
    public ArrayList<Integer> findNSE(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        ArrayList<Integer> nse = new ArrayList<>(n);
        for(int i=0; i<n; i++){
            nse.add(n);
        }
        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                nse.set(i,st.peek());
            }
            st.push(i);
        }
        return nse;
    }
        public ArrayList<Integer> findPSE(int[] arr){

        Stack<Integer> st = new Stack<>();

        int n = arr.length;
        ArrayList<Integer> pse = new ArrayList<>(n);
        for(int i=0; i<n; i++){
            pse.add(-1);
        }
        for(int i=0; i<n; i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                pse.set(i,st.peek());
            }
            st.push(i);
        }
        return pse;
    }
}