package io.dsalgo.basics;

public class CheckPalindrome {
    public static boolean isPalindrome(int num){
        int temp = num, rev = 0;
        while(num != 0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        return temp == rev;
    }
    public static void main(String[] args) {
        int num = 123;

        System.out.println(isPalindrome(num));
    }
}
