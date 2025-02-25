package io.dsalgo.string.easy;

// 1614. Maximum Nesting Depth of the Parentheses
public class MaximumNestingDepthOfParenthesis {
    /**
     * To Check the nesting depth, we will use a count
     * If '(' occur then we increase the count by 1
     * If ')' occur then we simple decrease the count by 1
     * If any other character occur then we will do nothing
     */
    public int maxDepth(String s) {
        int maxi = 0;
        int count = 0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                count ++;
                maxi = Math.max(maxi, count);
            } else if(ch == ')'){
                count --;
            }
        }
        return maxi;
    }
}
