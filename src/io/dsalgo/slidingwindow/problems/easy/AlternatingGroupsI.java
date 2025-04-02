package io.dsalgo.slidingwindow.problems.easy;
// 3206. Alternating Groups I
public class AlternatingGroupsI {
    public static int numberOfAlternatingGroups(int[] colors) {
        int n = colors.length;
        int k = 3, count = 0; // k = 3 always for this question

        for(int i = 0; i < n; i ++){
            int alt = 1;
            for(int j = 0; j < k-1; j ++){
                if(colors[(i+j)%n] != colors[(i+1+j)%n]) {
                    alt ++;
                }
            }
            if(alt == k) count ++; // k is always 3
        }
        return count;
    }

    public static void main(String[] args) {
        int[] colors = {1,1,1,2,2,2,3,3,3,4,4,4,5,5,5};

        System.out.println(numberOfAlternatingGroups(colors));

    }
}
