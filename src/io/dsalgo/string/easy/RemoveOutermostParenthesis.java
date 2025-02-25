package io.dsalgo.string.easy;

// 1021. Remove Outermost Parentheses

public class RemoveOutermostParenthesis {

    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int counter = 0; // keep the track of open and close parenthesis

        for(int i = 0; i < s.length(); i ++){
            char curChar = s.charAt(i);

            if(curChar == '('){
                // If counter is greater than 0, we are inside an outer pair
                if(counter > 0){
                    result.append(curChar);
                }
                counter ++;
            } else if(curChar == ')'){
                counter --;
                if(counter > 0){
                    result.append(curChar); // Only append ')' if we are inside an outer pair
                }
            }
        }
        return result.toString();
    }
}
