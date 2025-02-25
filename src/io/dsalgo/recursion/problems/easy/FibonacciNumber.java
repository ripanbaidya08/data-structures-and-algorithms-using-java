package io.dsalgo.recursion.problems.easy;

// 509. Fibonacci Number
public class FibonacciNumber {
    private static int fibo(int n){
        // naive approach
        return n == 0 ? 0 : n == 1 ? 1 : fibo(n-1) + fibo(n-2);
    }
    public static void main(String[] args) {
        int n = 5;

        System.out.println(fibo(n));
    }
}
