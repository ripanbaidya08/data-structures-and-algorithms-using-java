package io.dsalgo.string.medium;

// 1400. Construct K Palindrome Strings

public class ConstructKPalindromeStrings {
    public boolean canConstruct(String s, int k) {
        int stringLen = s.length();
        if(stringLen < k) return false;

        int[] charFreq = new int[26];
        for(int i = 0; i < stringLen; i ++){
            charFreq[s.charAt(i) - 'a'] ++;
        }

        int countCharHavingOddLen = 0;
        for(int i = 0; i < 26; i ++){
            if(i % 2 != 0) countCharHavingOddLen++;
        }

        return countCharHavingOddLen <= k;
    }
    public static void main(String[] args) {
        String s = "annabelle"; int k = 2;

        boolean result = new ConstructKPalindromeStrings().canConstruct(s, k);
        System.out.println(result);
    }
}
