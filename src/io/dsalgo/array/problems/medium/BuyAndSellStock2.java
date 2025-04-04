package io.dsalgo.array.problems.medium;

//122. Best Time to Buy and Sell Stock II

public class BuyAndSellStock2 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 5, 3, 6, 4}; // output: 7
        int result = maxProfit(arr);

        System.out.println(result);
    }

    public static int maxProfit(int[] prices) {
        int totalProfit = 0;

        // Staring from the second day
        for(int i = 1; i < prices.length; i ++){
            if(prices[i] > prices[i-1]){
                totalProfit += prices[i] - prices[i-1];
            }
        }
        return totalProfit;
    }

}
