import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    public int pop() {
        if(stack1.isEmpty()){
            return -1;
        }
        return stack1.pop();
        
    }
    public void push(int node) {
        if(stack1.isEmpty() == true){
            stack1.push(node);
            return;
        }
        while(stack1.isEmpty() == false){
            stack2.push(stack1.pop());
        }
        stack2.push(node);
        while(stack2.isEmpty() == false){
            stack1.push(stack2.pop());
        }
        
    }
}
