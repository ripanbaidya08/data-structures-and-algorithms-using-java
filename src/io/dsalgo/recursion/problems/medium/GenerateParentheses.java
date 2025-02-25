package io.dsalgo.recursion.problems.medium;

import java.util.ArrayList;
import java.util.List;

// 22. Generate Parentheses
class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        char[] current = new char[2*n];

        backtrack(result, current, 0, 0, n, 0);
        return result;
    }

    public void backtrack(List<String> res, char[] curr, int openN, int closeN, int n, int index){
        // add open parenthesis when open < n
        // add closign parenthesis when close < open
        // stop when open == close == n
        if (openN == n && closeN == n) {
            res.add(new String(curr)); // Create a new string from the char array
            return;
        }

        if (openN < n) {
            curr[index] = '(';
            backtrack(res, curr, openN + 1, closeN, n, index + 1);
        }

        if (closeN < openN) {
            curr[index] = ')';
            backtrack(res, curr, openN, closeN + 1, n, index + 1);
        }
    }
}