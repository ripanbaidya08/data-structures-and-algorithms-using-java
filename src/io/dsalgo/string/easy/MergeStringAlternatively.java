package io.dsalgo.string.easy;

// 1768. Merge Strings Alternately
public class MergeStringAlternatively {
    public String mergeAlternately(String word1, String word2) {
        StringBuffer ans = new StringBuffer();
        int i = 0, j = 0;
        // m -> word1, n -> word2
        int m = word1.length()-1, n = word2.length()-1;

        while(i <= m && j <= n){
            if(i <= m){
                ans.append(word1.charAt(i));
                i ++;
            }
            if(j <= n){
                ans.append(word2.charAt(j));
                j ++;
            }
        }

        // still in the word1
        while(i <= m){
            if(i <= m){
                ans.append(word1.charAt(i++));
            }
        }

        // still in the word2
        while(j <= n){
            if(j <= n){
                ans.append(word2.charAt(j++));
            }
        }

        return ans.toString();
    }
}
