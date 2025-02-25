package io.dsalgo.array.problems.easy;

// leetcode 1295
public class FindNumbersWithEvenNumberOfDigits {

    public static boolean isEvenNumberDigits(int num){
        int cnt = 0; // count the number of digits
        while(num != 0){
            int rem = num % 10;
            cnt ++;
            num /= 10;
        }

        // check whether the count is even or not
        return (cnt % 2 == 0);
    }

    public static int findNumbers(int[] nums) {
        int cnt = 0; // count the number, having even number of digits

        for(int i = 0 ;i < nums.length; i ++){
            if(isEvenNumberDigits(nums[i]))
                cnt ++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896}; // Output: 2 , 12 & 7896 has even numbers of digits.

        int result = findNumbers(nums);
        System.out.println(result);
    }
}
