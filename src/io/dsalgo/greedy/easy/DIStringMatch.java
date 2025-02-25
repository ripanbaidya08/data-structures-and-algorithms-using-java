package io.dsalgo.greedy.easy;

// leetcode 942. DI String Match
class DIStringMatch {
    /**
    * This method generates a permutation of integers from 0 to n (where n is the length of the input string)
    * based on the pattern of 'I's (Increase) and 'D's (Decrease) in the input string.
    *
    * The logic is as follows:
    * - If the character is 'I', the next number in the permutation should be the smallest available number.
    * - If the character is 'D', the next number in the permutation should be the largest available number.
    *
    * We maintain two pointers, `I` and `D`, where:
    * - `I` starts at 0 and increments for each 'I' encountered.
    * - `D` starts at `n` (the length of the string) and decrements for each 'D' encountered.
    *
    * The last element of the permutation is determined by the last character in the string:
    * - If the last character is 'I', the last element is `I`.
    * - If the last character is 'D', the last element is `D`.
    *
    * 
    * @return An array representing the permutation of integers from 0 to n.
    */
    public int[] diStringMatch(String s) {
        int n = s.length();
        int[] perm = new int[n + 1];  // The permutation array will have n+1 elements.
        int I = 0, D = n;  // Initialize the pointers for 'I' and 'D'.

        // Iterate through the string to build the permutation.
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                perm[i] = I++;  // Assign the smallest available number and increment `I`.
            } else {
                perm[i] = D--;  // Assign the largest available number and decrement `D`.
            }
        }

        // Set the last element of the permutation based on the last character in the string.
        perm[n] = s.charAt(n - 1) == 'I' ? I : D;

        return perm;
    }
}