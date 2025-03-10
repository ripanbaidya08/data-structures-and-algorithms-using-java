package io.dsalgo.string.medium;

import java.util.ArrayList;
import java.util.List;

//916. Word Subsets
// https://leetcode.com/problems/word-subsets/
public class WordSubsets {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ans = new ArrayList<>();
        int[] maxFreq= new int[26];

        for(var b : words2){
            int[] freq= new int[26];
            for(char c : b.toCharArray()){
                freq[c - 'a'] ++;
            }

            for(int i = 0; i < 26; i ++){
                maxFreq[i] = Math.max(freq[i], maxFreq[i]);
            }
        }

        // check each word against string a in words1
        for(var a : words1){
            int[] freqA = new int[26];
            for(char c : a.toCharArray()){
                freqA[c - 'a']++;
            }

            // Check if current word contains all required characters
            boolean isUniversal = true;
            for(int i = 0; i < 26; i ++){
                if(maxFreq[i] > freqA[i]){
                    isUniversal = false;
                    break;
                }
            }
            if(isUniversal){
                ans.add(a);
            }
        }
        // Time: O(L), l is the length of words1 and words2
        return ans;
    }
    public static void main(String[] args) {
        String[] word1 = {"amazon","apple","facebook","google","leetcode"};
        String[] word2 = {"e","o"};

        List<String> ans = new WordSubsets().wordSubsets(word1, word2);
        System.out.println(ans);
    }
}
