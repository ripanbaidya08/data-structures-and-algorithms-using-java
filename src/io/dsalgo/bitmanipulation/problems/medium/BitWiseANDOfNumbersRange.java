package io.dsalgo.bitmanipulation.problems.medium;

//201. Bitwise AND of Numbers Range
public class BitWiseANDOfNumbersRange {
    public int rangeBitwiseAnd(int left, int right) {
        /**
         * 5 - 0101 -> 0 & 5 = 0101 = 5
         * 6 - 0110 -> 5 & 6 = 0011 = 3
         * 7 - 0111 -> 3 & 7 = 0100 = 4
         * Range left -> right inclusive
         */
        while (left < right) {
            right &= (right - 1); // Remove the lowest set bit from right
        }
        return left & right; // Both will be equal at this point
    }
}
