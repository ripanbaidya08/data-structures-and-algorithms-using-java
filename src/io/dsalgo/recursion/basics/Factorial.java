package io.dsalgo.recursion.basics;

// Calculate Factorial using Recursion
import java.util.Scanner;

public class Factorial {
    /**
     * In Recursion, we have to initialize the base case.
     * or else, the program will go into infinite loop and result as StackOverflowError
     * time: T(n)=T(n−1)+O(1)
     * space: O(n), for an input n, there will be n calls on the stack before reaching the base case. */
    private static int factorial(int n){
        if(n == 1 || n == 0) return 1;
        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(factorial(n));
    }
}
