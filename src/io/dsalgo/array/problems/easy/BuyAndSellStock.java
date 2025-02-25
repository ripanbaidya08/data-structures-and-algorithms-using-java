package io.dsalgo.array.problems.easy;

// leetcode 121. Buy
public class BuyAndSellStock {

    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 5, 3, 6, 4};
        int result = maximumProfit(arr);

        System.out.println(result);
    }

    public static int maximumProfit(int[] prices){
        // we, assume that we bought the stock on day 0
        int minValue = prices[0];

        // I am not interested to make negative profit
        int maxProfit = 0;

        // traverse through the 2nd element to the last elment of the array
        for(int i = 1; i < prices.length; i ++){
            int profit = prices[i] - minValue;
            maxProfit = Math.max(maxProfit, profit); // update the maxProfit
            minValue = Math.min(minValue, prices[i]); // update the minValue
        }
        return maxProfit;
    }

}
