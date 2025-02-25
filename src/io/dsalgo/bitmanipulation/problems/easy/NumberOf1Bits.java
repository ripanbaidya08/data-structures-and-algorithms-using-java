package io.dsalgo.bitmanipulation.problems.easy;

// 191. Number of 1 Bits
public class NumberOf1Bits {
    /**
     * Convert the 'n' into its equivalent binary.
     * Count no of 1's while traversing through the binary String.
     * Return the ans.
     public String toBinary(int n){
     StringBuilder binaryString = new StringBuilder();
     if(n == 0) return "0";

     while(n != 0){
     int rem = n % 2;
     binaryString.append(rem);
     n/= 2;
     }
     return binaryString.reverse().toString();
     }
     public int hammingWeight(int n) {
     String binary = toBinary(n);
     int cnt = 0;
     for(int i = 0; i < binary.length(); i ++){
     if(binary.charAt(i) == '1') cnt ++;
     }

     return cnt;
     }
     */


    public int hammingWeight(int n) {
        int totalBits = 0;

        while(n != 0){
            int rem = n % 2;
            if(rem == 1) totalBits ++;
            n/= 2;
        }
        return totalBits;
    }
}
