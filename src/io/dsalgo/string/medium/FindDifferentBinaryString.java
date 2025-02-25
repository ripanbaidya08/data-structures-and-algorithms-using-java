package io.dsalgo.string.medium;

import java.util.HashMap;
import java.util.Map;

// 1980. Find Unique Binary String
// https://leetcode.com/problems/find-unique-binary-string/description/?envType=daily-question&envId=2025-02-20

class FindDifferentBinaryString {
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;

        // Iterate over the binary string from right to left
        for (int i = binary.length() - 1; i >= 0; i--) {
            char ch = binary.charAt(i);
            if (ch == '1') {
                decimal += Math.pow(2, power);
            } else if (ch != '0') {
                throw new IllegalArgumentException("Invalid binary string: " + binary);
            }
            power++;
        }

        return decimal;
    }

    public static String decimalToBinary(int decimal, int n) {
        StringBuilder binary = new StringBuilder();

        // Convert decimal to binary with leading zeros
        for (int i = n - 1; i >= 0; i--) {
            int mask = 1 << i;
            binary.append((decimal & mask) != 0 ? '1' : '0');
        }

        return binary.toString();
    }

    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        Map<Integer, Integer> mp = new HashMap<>(); // decimal, val

        // Convert all binary strings in nums to decimal and store in map
        for (String num : nums) {
            int dec = binaryToDecimal(num);
            mp.put(dec, 1);
        }

        // Check all possible binary strings of length n
        int rangeH = (int) Math.pow(2, n);
        for (int i = 0; i < rangeH; ++i) {
            if (!mp.containsKey(i)) {
                // Return the binary string with leading zeros
                return decimalToBinary(i, n);
            }
        }

        return ""; // This will not execute
    }
}