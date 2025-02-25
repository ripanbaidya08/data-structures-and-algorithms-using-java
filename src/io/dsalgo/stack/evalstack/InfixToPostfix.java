package io.dsalgo.stack.evalstack;

import java.util.Stack;

public class InfixToPostfix {
    public static boolean isOperand(char ch){
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9');
    }
    public static boolean isOpeningBracket(char ch){
        return ch == '(';
    }
    public static boolean isClosingBracket(char ch){
        return ch == ')';
    }
    public static int priority(char ch){
        if(ch == '^') return 3;
        else if(ch == '*' || ch == '/') return 2;
        else if(ch == '+' || ch == '-') return 1;
        else return -1;
    }

    public static String infixToPostfix(String exp) {
        Stack<Character> st = new Stack<>();
        int len = exp.length(), i = 0; // iterator
        StringBuilder ans = new StringBuilder();

        while(i < len){
            char ch = exp.charAt(i);

            if(isOperand(ch)){ // If Operand is encountered, then add it to the result
                ans.append(ch);
            } else if(isOpeningBracket(ch)){ // If Opening bracket is encountered, add it to the stack
                st.push(ch);
            } else if(isClosingBracket(ch)){
                // If Closing bracket is encountered, then whatever the operators are present inside within that opening & closing bracket
                // add them to the result and remove them from the stack.
                while(!st.isEmpty() && st.peek()!= '('){
                    ans.append(st.pop()); // remove & add to the result
                }
                st.pop(); // remove opening bracket
            } else { // Operator is encountered
                while (! st.empty() && priority(ch) <= priority(st.peek())){
                    ans.append(st.pop());
                }
                st.push(ch);
            }
            i ++;
        }

        while(!st.empty()){
            // There might exist some Operators in the stack, remove then and add it to the result
            ans.append(st.pop());
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String infix = "a+b*(c^d-e)";
        String postfix = infixToPostfix(infix);

        System.out.println("Infix: "+infix);
        System.out.println("Postfix: "+postfix);
    }
}
