package io.dsalgo.recursion.basics;
// print sum of 1 to n

public class SumOfN {
    private static int sumOfN(int n){
        if(n == 0 || n == 1) return n;
        return n + sumOfN(n-1);
    }
    public static void main(String[] args) {
        int n = 1;
        int result = sumOfN(n);

        System.out.println("result = " + result);
    }
}
