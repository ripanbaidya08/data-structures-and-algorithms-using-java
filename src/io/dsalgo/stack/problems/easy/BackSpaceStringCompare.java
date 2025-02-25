package io.dsalgo.stack.problems.easy;

import java.util.Stack;

/**
 * Input: s = "ab#c", t = "ad#c"
 * Output: true
 * Explanation: Both s and t become "ac".
 */
// leetcode 844. Backspace String Compare
public class BackSpaceStringCompare {

    /**
     * Approach:
     * We will push each character one by one from the String. by checking if the Character is '#'
     * then whatever the element presents before the '#' should delete.
     * we will do it for both the String s and t
     * then compare each element between stack1 and stack2.
     * if doesn't satisfy criteria then return false.
     */
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        // for first string
        for(int i = 0; i < s.length(); i ++){
            char ch = s.charAt(i);
            if(ch == '#'){
                // if the current character is '#' whatever the top element, please delete it.
                if(!st1.isEmpty()){
                    st1.pop();
                }
            } else{
                st1.push(ch);
            }
        }

        // for second string
        for(int i = 0; i < t.length(); i ++){
            char ch = t.charAt(i);
            if(ch == '#'){
                if(!st2.isEmpty()){
                    st2.pop();
                }
            } else{
                st2.push(ch);
            }
        }

        if(st1.size()!=st2.size()) return false;
        while(!st1.empty()){
            // if any of the top character doesn't match then false.
            if(st1.pop()!=st2.pop()) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";

        boolean result = new BackSpaceStringCompare().backspaceCompare(s, t);

        System.out.println(result);
    }
}
