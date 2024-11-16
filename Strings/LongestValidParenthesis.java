package Strings;

import java.util.Stack;

class LongestValidParenthesis {
    public int longestValidParenthesis(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int maxLength = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            
            if (current == '(') {
                stack.push(i);
            } else {
                stack.pop();
                
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }
        return maxLength;
    }
    
    public static void main(String[] args) {
        String s = "(()())";
        LongestValidParenthesis obj = new LongestValidParenthesis();
        System.out.println(obj.longestValidParenthesis(s));
    }
}
