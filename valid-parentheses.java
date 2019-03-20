class Solution {
    public boolean isValid(String s) {
        if(s.length()%2 == 0)
            return false;
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for(char c:chars){
            if(stack.size() != 0 && isSym(stack.peek(),c))
                stack.pop();
            else
                stack.push(c);
        }
        return stack.size() == 0;
    }
    private boolean isSym(char c2, char c2){
        return (c1 == '(' && c2 == ')' || c1 == '{' && c2 == '}' || c1 == '[' && c2 == ']');
    }
}
