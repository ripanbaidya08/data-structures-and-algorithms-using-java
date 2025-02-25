package io.dsalgo.binarysearch.problems.medium;

// 875. Koko Eating Bananas
public class KokoEatingBananas {
    // tc: O(nlog(max(piles)))
    public static int findMax(int[] a){
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < a.length; i ++){
            maxi = Math.max(maxi, a[i]);
        }
        return maxi;
    }

    public static int countTotalHours(int[] a, int hourly){
        int totalH = 0;
        for(int i = 0; i < a.length; i ++){
            totalH += (int) Math.ceil((double)(a[i])/(double)(hourly));
        }
        return totalH;
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = findMax(piles);

        while(low<= high){
            int mid = (low+high)/2;
            int totalH = countTotalHours(piles, mid);

            if(totalH <= h){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h = 8;

        int result = minEatingSpeed(piles, h);
        System.out.println(result);
    }
}
