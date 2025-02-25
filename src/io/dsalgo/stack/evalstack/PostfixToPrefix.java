package io.dsalgo.stack.evalstack;

/**
 * Start Iterating from the left side
 * If the operand comes, add it to the stack
 * else, perform the operation and push the result to the stack
 * operation: operator + top2 + top1
 */

import java.util.Stack;

public class PostfixToPrefix {
    public static boolean isOperand(char ch){
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9');
    }

    public static String postfixToPrefix(String exp){
        Stack<String> st = new Stack<>();
        int len = exp.length(), i = 0; // iterator

        while(i < len){
            char ch = exp.charAt(i);

            if(isOperand(ch)){ // If Operand is encountered, then add it to the result
                st.push(ch+"");
            } else { // We assume there are no opening & closing brackets in the expression.
                String concat = "";
                String top1 = st.pop(); // remove & add to the result
                String top2 = st.pop(); // remove & add to the result
                concat = ch + top2 + top1;
                st.push(concat);
            }
            i ++;
        }
        return st.pop();
    }

    public static void main(String[] args) {
        String postfix = "AB-DE+F*/";
        String prefix = postfixToPrefix(postfix);

        System.out.println("Postfix: "+postfix);
        System.out.println("Prefix: "+prefix);
    }
}
