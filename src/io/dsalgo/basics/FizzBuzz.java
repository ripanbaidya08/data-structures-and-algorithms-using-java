package io.dsalgo.basics;

import java.util.ArrayList;
import java.util.List;

/**
 * if n is divisible by 3,
 * print "Fizz", if n is divisible by 5,
 * print "Buzz", if n is divisible by both 3 and 5, print "FizzBuzz".
 * if none of them are true. then store the number as string
 * leetcode 412
 */
public class FizzBuzz {

    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                answer.add("FizzBuzz");
            } else if (i % 3 == 0) {
                answer.add("Fizz");
            } else if (i % 5 == 0) {
                answer.add("Buzz");
            } else {
                String num = Integer.toString(i);
                answer.add(num);
            }
        } // time: O(n)
        return answer;
    }

    public static void main(String[] args) {
        int n = 10;

        List<String> ans = new FizzBuzz().fizzBuzz(n);
        System.out.println(ans);
    }
}
