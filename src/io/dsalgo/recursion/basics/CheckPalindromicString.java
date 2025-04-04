package io.dsalgo.recursion.basics;

public class CheckPalindromicString {
    public static boolean isPalindrome(String str, int i){
        if(i >= str.length()/2) return true;
        
        if(str.charAt(i) != str.charAt(str.length()-i-1)) return false;
        
        return isPalindrome(str, i + 1);
    }
    public static void main(String[] args) {
        String str = "RACEAR";

        System.out.println("isPalindrome(str, 0) = " + isPalindrome(str, 0));
    }
}
