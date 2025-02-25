package io.dsalgo.recursion.basics;

// Calculate a^b using recursion

public class CalculatePower {
    /**
     * This function calculates a raised to the power of b using a simple recursive approach.
     * Time Complexity: O(b) - The function makes b recursive calls, which results in linear time complexity.
     *
     * Key Points:
     * - If both a and b are 0, it throws an IllegalArgumentException, as 0^0 is considered undefined.
     * - Base cases:
     *   - If b is 1, it returns a (since a^1 = a).
     *   - If b is 0, it returns a (this may need clarification since any number to the power of 0 is typically defined as 1).
     * - The recursive case multiplies a by the result of pow(a, b-1), effectively calculating a^b.
     */
    private static int pow(int a, int b){ // TC: O(b)
        if((a == 0 && b == 0) || b < 0) throw new IllegalArgumentException("Not Defined");
        if(b == 0) return 1;
        if(b == 1) return a;
        return a * pow(a, b-1);
    }
    /**
     * This function calculates a raised to the power of b using an optimized recursive approach known as exponentiation by squaring.
     *
     * Time Complexity: O(log b) - The function reduces the problem size by half with each recursive call,
     * resulting in logarithmic time complexity.
     *
     * Key Points:
     * - If both a and b are 0, it throws an IllegalArgumentException, as 0^0 is considered undefined.
     * - Base case: If b is 0, it returns 1 (any number raised to the power of 0 is defined as 1).
     * - The recursive case:
     *   - It first computes pow2(a, b/2), which gives a^(b/2).
     *   - If b is even, it returns ans * ans (which is equivalent to a^(b/2) multiplied by itself).
     *   - If b is odd, it returns ans * ans * a (to account for the extra multiplication by a).
     */
    private static int pow2(int a, int b){ // TC: O(log b)
        if(a == 0 && b == 0) throw new IllegalArgumentException("Not Defined");
        if(b == 1) return a; // base case
        if(b == 0) return 1; // base case
        int ans = pow2(a, b/2);
        return (b % 2 != 0) ? (ans * ans * a) : (ans * ans);
    }
    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        int res = pow2(a, b);
        System.out.println(res);
    }
}
