class MinStack {

    private Stack<Pair<Integer,Integer>> st;

    public MinStack() {
        this.st = new Stack();
    }
    
    public void push(int val) {
        if(st.isEmpty()){
            this.st.add(new Pair(val, val));
        }
        else{
            this.st.add(new Pair(val, Math.min(val,st.peek().getValue())));
        }
    }
    
    public void pop() {
        this.st.pop();
    }
    
    public int top() {
        return this.st.peek().getKey();
    }
    
    public int getMin() {
        return this.st.peek().getValue();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */