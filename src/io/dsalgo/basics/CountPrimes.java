package io.dsalgo.basics;

// leetcode 204

import java.util.Arrays;

public class CountPrimes {
    public int countPrimes(int n) {
        int ans = 0; // count the number of prime
        // taking boolean array of size n to mark number as prime or non prime
        boolean[] primes = new boolean[n];
        // Initially set all its value to true
        Arrays.fill(primes, true);

        for(int i = 2; i < n; i ++){
            // for each element of i, which is prime
            // we perform operation to mark its multiple as non prime
            if(primes[i]){
                ans++;
                for(int j = i*2; j < n; j +=i){
                    primes[j] = false;
                }
            }
        }
        // time: O(n)+O(nlon(log(n)))
        // space: O(n)
        return ans;
    }

    public static void main(String[] args) {
        int n = 10;

        int numberOfPrimes = new CountPrimes().countPrimes(n);
        System.out.println(numberOfPrimes);
    }
}
