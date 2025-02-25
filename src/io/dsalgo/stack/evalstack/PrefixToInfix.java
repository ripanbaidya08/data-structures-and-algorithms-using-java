package io.dsalgo.stack.evalstack;

import java.util.Stack;

/**
 * Start Iterating from the end of the String
 * If any Operands come, then push it to the stack
 * If the Operator comes. then perform the operation and push the result to the stack
 *  operation: '(' + top1 + operator + top2 + ')'
 */
public class PrefixToInfix {
    public static boolean isOperand(char ch){
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9');
    }

    public static String postfixToInfix(String exp){
        Stack<String> st = new Stack<>();
        int len = exp.length(), i = len-1; // iterator

        while(i >= 0){
            char ch = exp.charAt(i);

            if(isOperand(ch)){ // If Operand is encountered, then add it to the result
                st.push(ch+"");
            } else { // We assume there are no opening & closing brackets in the expression.
                String concat = "";
                String top1 = st.pop(); // remove & add to the result
                String top2 = st.pop(); // remove & add to the result
                concat = "(" + top1 + ch + top2 + ")"; // operation: '(' + top2 + operator + top1 + ')'
                st.push(concat);
            }
            i --;
        }
        return st.pop();
    }

    public static void main(String[] args) {
        String prefix = "*+PQ-MN";
        String infix = postfixToInfix(prefix);

        System.out.println("Postfix: "+prefix);
        System.out.println("Infix: "+infix);
    }
}
