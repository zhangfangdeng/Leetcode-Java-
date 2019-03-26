class MyCircularQueue {
    private int[] data;
    private int p_start;
    private int p_end;
    private int size;
    
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        size = k;
        data = new int[size];
        p_start = -1;
        p_end = -1;
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(isFull())
            return false;
        if(isEmpty())
            p_start = 0;
        p_end = (p_end + 1) % size;
        data[p_end] = value;
        return true;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(isEmpty)
            return false;
        if(p_end == p_start){
            p_end = -1;
            p_start = -1;
            return true;
        }
        p_start = (p_start + 1) % size;
        return true;
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        if(!isEmpty())
            return data[p_start];
        return -1;
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        if(!isEmpty)
            return data[p_end];
        return -1;
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        if(p_start == -1)
            return true;
        return false;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        if((p_end + 1) % size == p_start)
            return true;
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue(value);
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
