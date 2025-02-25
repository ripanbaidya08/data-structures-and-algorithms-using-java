package io.dsalgo.recursion.basics;

public class PrintN_to_1_And_1_To_N {
    private static void printNto1(int n) {
        // n (n-1) (n-2) ..... 3 2 1
        if(n == 0) return;
        System.out.print(n+" "); // 5 4 3 2 1
        printNto1(n-1);
    }
    private static void print1ToN(int start, int n) {
        // 1 2 3 ....(n-2) (n-1) n
        if(start > n) return;
        System.out.print(start+" ");
        print1ToN(start+1, n);
    }
    private static void print1ToN_WithoutExtraParameter(int n){
        if(n == 0) return;
        print1ToN_WithoutExtraParameter(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int N = 5;

        printNto1(N);
        System.out.println();
        print1ToN(1, N);
        System.out.println();
        print1ToN_WithoutExtraParameter(N);
    }
}
