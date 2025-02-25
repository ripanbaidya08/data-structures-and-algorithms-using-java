package io.dsalgo.bitmanipulation.problems.easy;

// 338. Counting Bits
public class CountingBits {
    public int numberOfOnes(int n){
        int count = 0;
        while(n != 0){
            int rem = n % 2;
            if(rem == 1) count ++;
            n/= 2;
        }
        return count;
    }

    public int[] countBits(int n) {
        int[] ans= new int[n+1];

        for(int i = 0; i <= n; i ++){
            int onesInCurrentValue = numberOfOnes(i);
            ans[i] = onesInCurrentValue;
        }
        return ans;
    }
}
