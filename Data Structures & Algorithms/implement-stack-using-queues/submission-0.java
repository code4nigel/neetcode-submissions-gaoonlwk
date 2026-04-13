class MyStack {
    Queue<Integer> q1;

    public MyStack() {
        q1 = new LinkedList<>();
    }
    
    public void push(int x) {
        q1.offer(x);
        int s = q1.size();

        for(int i = 1; i <= s - 1; i++){
            q1.offer(q1.poll());
    }
    }
    
    public int pop() {
       return q1.poll();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}
