package io.dsalgo.stack.evalstack;

/**
 * Start Iterating from the right side of expression
 * If the operand comes, add it to the stack
 * else, perform the operation and push the result to the stack
 * operation: top1 + top2 + operator
 */

import java.util.Stack;

public class PrefixToPostfix {
    public static boolean isOperand(char ch){
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9');
    }

    public static String prefixToPostfix(String exp){
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
                concat = top1 + top2 + ch ;
                st.push(concat);
            }
            i --;
        }
        return st.pop();
    }

    public static void main(String[] args) {
        String prefix = "*+PQ-MN";
        String postfix = prefixToPostfix(prefix);

        System.out.println("Prefix: "+prefix);
        System.out.println("Postfix: "+postfix);
    }
}
