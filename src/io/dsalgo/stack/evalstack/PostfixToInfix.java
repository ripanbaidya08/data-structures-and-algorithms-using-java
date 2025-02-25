package io.dsalgo.stack.evalstack;

import java.util.Stack;

/**
 * If any Operands come, then push it to the stack
 *  If the Operator comes. then perform the operation and push the result to the stack
 *  operation: '(' + top2 + operator + top1 + ')'
 */
public class PostfixToInfix {
    public static boolean isOperand(char ch){
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9');
    }

    public static String postfixToInfix(String exp){
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
                concat = "(" + top2 + ch + top1 + ")"; // operation: '(' + top2 + operator + top1 + ')'
                st.push(concat);
            }
            i ++;
        }
        return st.pop();
    }

    public static void main(String[] args) {
        String postfix = "AB-DE+F*/";
        String infix = postfixToInfix(postfix);

        System.out.println("Postfix: "+postfix);
        System.out.println("Infix: "+infix);
    }
}
