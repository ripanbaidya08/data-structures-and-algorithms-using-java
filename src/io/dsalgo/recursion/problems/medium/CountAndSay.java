package io.dsalgo.recursion.problems.medium;

// 38. Count and Say
class CountAndSay{
    /**
    * Generates the nth term of the count-and-say sequence.
    * The core logic involves counting consecutive occurrences of the same digit 
    * and appending the count followed by the digit to build the new string. 
    */
    public String countAndSay(int n) {
        if(n == 1) return "1"; 

        String prev = countAndSay(n-1);
        
        StringBuilder ans = new StringBuilder();
        int count = 1;
        for(int i = 0; i < prev.length(); i ++){
            if(i+1 < prev.length() && prev.charAt(i) == prev.charAt(i+1)){
                count ++;
            } else {
                ans.append(count).append(prev.charAt(i)); 
                count = 1;   
            }
        }
        return ans.toString();
    }
}

/**
* time: O(m * 2^n), where n is the input integer and m is the average length 
* of count and say sequence string.
* The function calls itself recursively n-1 times. 
* space: O(2^n) because a string with maximum average length m can 
* roughly double in size with each recursive call, 
*/
