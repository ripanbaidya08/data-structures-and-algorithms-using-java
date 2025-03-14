package io.dsalgo.string.easy;

// 796. Rotate String
// https://leetcode.com/problems/rotate-string/description/

public class RotateString {

    /**
     * Approach:
     * 1. Check if the lengths of strings 's' and 'goal' are equal; if not, return false.
     * 2. Concatenate 's' with itself to create a new string that contains all possible rotations of 's'.
     * 3. Check if 'goal' is a substring of the concatenated string.
     * 4. Return true if 'goal' is found; otherwise, return false.
     */

    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        String concatenated = s + s;

        return concatenated.contains(goal);
    }

}
