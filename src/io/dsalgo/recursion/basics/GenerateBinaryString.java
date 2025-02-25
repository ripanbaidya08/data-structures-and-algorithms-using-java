package io.dsalgo.recursion.basics;

import java.util.Scanner;

/**
 * variant 1
 * Given a number n, generate all possible binary strings of length n.
 * n = 2
 * output: 00, 01, 10, 11
 *
 * variant 2
 * Given a number n, generates all possible binary strings of length n excluding consecutive one.
 * n = 2
 * output: 00, 01, 10
* */
public class GenerateBinaryString {
    public static void printBinaryString(String ans, int n){
        if(n == 0){
            System.out.println(ans);
            return;
        }
        printBinaryString(ans+"0", n-1);
        printBinaryString(ans+"1", n-1);
    }
    public static void printBinaryStringSkipConsecutiveOne(String ans, int n){
        int len = ans.length();
        if(len == n){
            System.out.println(ans);
            return;
        }
        if(len == 0 || ans.charAt(len-1) == '0') {
            printBinaryStringSkipConsecutiveOne(ans+"0", n);
            printBinaryStringSkipConsecutiveOne(ans+"1", n);
        } else {
            printBinaryStringSkipConsecutiveOne(ans+"0", n);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        printBinaryStringSkipConsecutiveOne("", n);
    }
}
