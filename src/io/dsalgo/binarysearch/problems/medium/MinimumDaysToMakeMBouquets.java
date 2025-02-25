package io.dsalgo.binarysearch.problems.medium;

// 1498. Minimum Days to Make M Bouquets
// tag:: google
public class MinimumDaysToMakeMBouquets {
    // tc: O(max(ar[])-min(arr[]+1)) + O(n)
    // sc: O(1)
    public static boolean isBouquetPossible(int[] bloomDay, int day, int m, int k){
        int cnt = 0, noOfB = 0;

        for(int i = 0; i < bloomDay.length; i ++){
            if(bloomDay[i] <= day){
                cnt ++;
            } else{
                noOfB += (cnt/k);
                cnt = 0;
            }
        }
        noOfB += (cnt/k);
        return noOfB >= m;
    }

    // m -> no of bouquets, k -> adjacent flowers
    public static int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        long val = (long) m * k;
        if(val > n) return -1;

        // find minimum and maximum day
        int maxi = Integer.MIN_VALUE, mini = Integer.MAX_VALUE;
        for(int i = 0; i < n; i ++){
            mini = Math.min(mini, bloomDay[i]);
            maxi = Math.max(maxi, bloomDay[i]);
        }

        int low = mini, high = maxi;
        while(low <= high){
            int mid = (low+high)/2;

            if(isBouquetPossible(bloomDay, mid, m, k)){
                // we want the minimum
                // we know minimum always be on the left side
                high = mid - 1;
            } else{
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] bloomDay = {1,10,3,10,2};
        int m = 3, k = 1;

        System.out.println(minDays(bloomDay, m, k));
    }
}
