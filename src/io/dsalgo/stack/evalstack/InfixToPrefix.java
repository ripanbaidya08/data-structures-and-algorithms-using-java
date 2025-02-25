package io.dsalgo.stack.evalstack;

import java.util.Stack;

/**
 * The Conversion of Infix expression to Prefix expression involves a few steps
 * 1. reverse the infix expression
 * 2. Replace all the opening brackets with closing brackets and vice versa
 * 3. Convert the Infix expression to Postfix expression under some controlled condition
 * 4. Reverse the Postfix expression
 *
 * There is a twist while converting Infix expression to Postfix expression
 * 1. If two operators have the same priority can stay together side by side
 * 2. ^ = these two operators can't stay together side by side
 */
public class InfixToPrefix {
    public static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }
    public static String replaceAllOpeningBracketsToClosingBracketsAndViceVersa(String sb){
        return sb.replace('(', '#') // temporary replacement
                .replace(')', '(')
                .replace('#', ')');
    }
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

    public static String infixToPrefix(String exp) {
        // 1. Reverse the infix expression
        exp = reverse(exp);
        // 2. Replace all ( -> ) & vice versa
        exp = replaceAllOpeningBracketsToClosingBracketsAndViceVersa(exp);

        Stack<Character> st = new Stack<>();
        int len = exp.length(), i = 0; // iterator
        StringBuilder ans = new StringBuilder();

        // 3. Infix to Postfix
        while(i < len){
            char ch = exp.charAt(i);

            if(isOperand(ch)){ // If Operand is encountered, then add it to the result
                ans.append(ch);
            } else if(isOpeningBracket(ch)){ // If Opening bracket is encountered, add it to the stack
                st.push(ch);
            } else if(isClosingBracket(ch)){
                // If Closing bracket is encountered, then whatever the operators are present inside within that opening & closing bracket
                // add them to the result and remove them from the stack.
                while(!st.empty() && st.peek()!= '('){
                    ans.append(st.pop()); // remove & add to the result
                }
                st.pop(); // remove opening bracket
            } else { // Operator is encountered
                if(ch == '^'){
                    while(! st.empty() && st.peek() == '^'){
                        ans.append(st.pop());
                    }
                } else{
                    while(! st.empty() && priority(ch) < priority(st.peek())){
                        ans.append(st.pop());
                    }
                }
                st.push(ch);
            }
            i ++;
        }

        while(!st.empty()){
            // There might exist some Operators in the stack, remove then and add it to the result
            ans.append(st.pop());
        }
        // 4. reverse the answer
        ans = new StringBuilder(reverse(ans.toString()));

        return ans.toString();
    }

    public static void main(String[] args) {
        String infix = "(A+B)*C-D+F";
        String prefix = infixToPrefix(infix);

        System.out.println("Infix: "+infix);
        System.out.println("Prefix: "+prefix);
    }
}
