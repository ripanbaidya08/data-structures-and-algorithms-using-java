package io.dsalgo.array.problems.easy;

// leetcode 66
public class PlusOne {

    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // start traversing from the end.
        for(int i = n-1; i >= 0; i --){
            // if current value is less than 9, increment the value by 1 and return it.
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }

            // if number is 9, then set it to 0.
            digits[i] = 0;
        }

        // If we have gone through all digits and they are all 0s,
        // we need to create a new array with an additional digit
        int[] result = new int[n+1];
        result[0] = 1; // set the first digit 1

        return result;
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3}; // output: {1, 2, 4}

        int[] result = new PlusOne().plusOne(num);
        System.out.println(result);
    }
}
