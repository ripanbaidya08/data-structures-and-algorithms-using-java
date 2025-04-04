package io.dsalgo.slidingwindow.problems.easy;

// 2379. Minimum Recolors to Get K Consecutive Black Blocks
class MinimumRecolorsToGetKConsecutiveBlackBlocks {
    // time: O(n), space: O(1)
    public static int minimumRecolors(String blocks, int k) {
        // k size
        int minOp = 0; // minimum operation
        int white = 0; // operation needed to change white color to black
        for(int i = 0; i < k; i ++){
            if(blocks.charAt(i) == 'W') {
                white ++;
            }
        }   
        minOp = white; // assume this number of operations required

        // Slide the Window to the Right
        for(int i = k; i < blocks.length(); i ++){
            char back = blocks.charAt(i-k);

            if(back == 'W'){
                white --;
            } 
            if(blocks.charAt(i) == 'W'){
                white ++;
            }
            // update the minimum operation
            minOp = Math.min(minOp, white);
        }
        return minOp;
    }

    public static void main(String[] args) {
        String blocks = "WBBWWBBWBW";
        int k = 7;

        System.out.println(minimumRecolors(blocks, k));
    }
}