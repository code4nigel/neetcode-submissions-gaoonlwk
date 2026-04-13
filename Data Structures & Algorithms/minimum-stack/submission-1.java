class MinStack {
 Stack<Integer> s1;
 Stack<Integer> m1;
    public MinStack() {
        s1 = new Stack<>();
        m1 = new Stack<>();
    }
    
    public void push(int val) {
        s1.push(val);
        if(m1.isEmpty()){
            m1.push(val);
        } else m1.push(Math.min(val,m1.peek()));
    }
    
    public void pop() {
        s1.pop();
        m1.pop();
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
        return m1.peek();
    }
}
