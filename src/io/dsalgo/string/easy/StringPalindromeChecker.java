package io.dsalgo.string.easy;
/*
* Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
* eg: madam -> after reverse, madam its palindrome
* eg2: that -> after reverse, taht, this is not palindrome
 */
public class StringPalindromeChecker {

    static boolean recursivePalindromeFun(int i, String str){
        if(i >= str.length()/2)
            return true;
        if(str.charAt(i) != str.charAt(str.length()-i-1))
            return false;
        return recursivePalindromeFun(i+1, str);
    }

    static boolean isPalindrome(String str){
        String updatedString = str.toLowerCase().replaceAll("[^A-Za-z0-9]", "");

        boolean result= recursivePalindromeFun(0, updatedString);

        return result;
    }

    public static void main(String[] args) {
        String str1 =  "race a car"; // false
        String str2 = "A man, a plan, a canal: Panama"; // true

        System.out.println(isPalindrome(str1));
    }
}