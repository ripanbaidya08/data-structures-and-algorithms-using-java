package io.dsalgo.stack.problems.hard;

// leetcode 42. Trapping Rain Water
class TrappingRainWater {
    // time: O(n), space: O(n)
    public int[] prefixMaxArr(int[] arr){ // left max 
        int[] pre = new int[arr.length];
        pre[0] = arr[0]; // first element
        for(int i = 1; i < arr.length; i ++){
            pre[i] = Math.max(pre[i-1], arr[i]);
        }
        return pre;
    }
    public int[] suffixMaxArr(int[] arr){ // right max
        int n = arr.length;
        int[] suff = new int[n];
        suff[n-1] = arr[n-1]; // last element
        for(int i = n-2; i >= 0; i --){
            suff[i] = Math.max(suff[i+1], arr[i]);
        }
        return suff;
    }

    public int trap(int[] height) {
        int n = height.length, total = 0;

        int[] preArr = prefixMaxArr(height);
        int[] suffArr = suffixMaxArr(height);

        for(int i = 0; i < n; i ++){
            int leftMax = preArr[i];
            int rightMax = suffArr[i];
            if(height[i] < leftMax && height[i] < rightMax){
                total += Math.min(leftMax, rightMax) - height[i]; 
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int ans = new TrappingRainWater().trap(height);

        System.out.println(ans);
    }
}