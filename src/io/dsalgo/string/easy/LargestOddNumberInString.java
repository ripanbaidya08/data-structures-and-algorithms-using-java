package io.dsalgo.string.easy;

// leetcode 1903

public class LargestOddNumberInString {
    /**
     * An integer is considered odd if its last digit is one of {1, 3, 5, 7, 9}.
     * We will traverse the strinng from the end. and will find the right most odd digit.
     * The substring from the start of the string to this digit will be the largest odd number.
     * If no odd digit is found, return an empty string
     */
    public String largestOddNumber(String num) {
        for(int i = num.length()-1; i >= 0; i --){
            if((num.charAt(i) - '0') % 2 != 0)
                return num.substring(0, i+1);
        }
        return "";
    }
}
