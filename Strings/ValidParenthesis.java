package Strings;

import java.util.Stack;

class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> valid = new Stack<>();
        for(char i : s.toCharArray()) {
            if(i=='(' || i=='[' || i=='{') {
                valid.push(i);
            } else {
                if(valid.isEmpty()) {
                    return false;
                }

                char top = valid.pop();
                if(i==')' && top!='(' || i=='}' && top!='{' || i==']' && top!='[') {
                    return false;
                }
            }
        }
        return valid.isEmpty();
    }

    public static void main(String[] args) {
        ValidParenthesis obj = new ValidParenthesis();
        String s = "{}()[]";
        boolean isTrue = obj.isValid(s);
        System.out.println(isTrue?"valid parenthesis":"invalid parenthesis");
    }
}
