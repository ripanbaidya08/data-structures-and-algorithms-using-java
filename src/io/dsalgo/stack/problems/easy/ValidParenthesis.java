package io.dsalgo.stack.problems.easy;

import java.util.Stack;

// leetcode 20
public class ValidParenthesis {

    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(int i = 0 ; i < s.length(); i ++){
            char ch = s.charAt(i);

            // If Opening bracket, push into the stack
            if(ch == '(' || ch == '[' ||ch == '{') {
                st.push(ch);
            } else{
                // If there is no Opening bracket
                // or stack is empty
                if(st.empty()) return false;

                // whatever the top element of the stack we required
                char topBracket = st.peek();

                if(ch == ')' && topBracket == '('){
                    st.pop();
                } else if(ch == ']' && topBracket == '['){
                    st.pop();
                } else if(ch == '}' && topBracket == '{'){
                    st.pop();
                } else {
                    return false;
                }
            }
        }

        // Since, every opening bracket should have its corresponding closing bracket
        // so, if all conditions satisfy then stack should empty
        if(!st.empty()) return false;

        return true;
    }

    public static void main(String[] args) {
        String s = "({})";

        boolean isValid = new ValidParenthesis().isValid(s);

        System.out.println(isValid);
    }
}
