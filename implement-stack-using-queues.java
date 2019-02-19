class MyStack1{
    Queue<Integer> queue1;
    Queue<Integer> queue2;
    /** Initialize your data structure here. */
    public MyStack(){
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x){
        queue2 = queue1;
        queue1 = new LinkedList<>();
        queue1.offer(x);
        while(!queue2.isEmpty())
            queue1.offer(queue2.poll());
    }
    
    /** Removes the element on the top of the stack and returns that element. */
    public int pop(){
        return queue1.poll();
    }
    
    /** Get the top element. */
    public int top(){
        return queue1.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty(){
        return queue1.isEmpty();
    }
}

class MyStack2 {
    Queue<Integer> queue;
    /** Initialize your data structure here. */
    public MyStack() {
        queue = new LinkedList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(x);
        for(int i = 0; i < queue.size() - 1; i++){
            queue.add(queue.poll());
        }
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue.poll();
    }
    
    /** Get the top element. */
    public int top() {
        return queue.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
