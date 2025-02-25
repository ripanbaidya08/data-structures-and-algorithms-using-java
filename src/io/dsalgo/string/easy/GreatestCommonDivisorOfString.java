package io.dsalgo.string.easy;

// 1071. Greatest Common Divisor of Strings

public class GreatestCommonDivisorOfString {
    public int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a%b);
    }
    public String gcdOfStrings(String str1, String str2) {
        // If concatenated strings are not equal, there's no GCD string
        if(!(str1 + str2).equals(str2 + str1)) return "";

        int gcdLength = gcd(str1.length(), str2.length());

        // Return the substring of str1 with length equal to the GCD
        return str1.substring(0, gcdLength);
    }

    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";

        System.out.println(new GreatestCommonDivisorOfString().gcdOfStrings(str1, str2));
    }
}
