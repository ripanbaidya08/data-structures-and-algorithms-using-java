package io.dsalgo.string.medium;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

// 451. Sort Characters By Frequency
// https://leetcode.com/problems/sort-characters-by-frequency/
public class SortCharactersByFrequency {
    /**
     * This method sorts the characters in the input string based on their frequency in descending order.
     *
     * Time Complexity: O(n + k log k), where n is the length of the input string and k is the number of unique characters.
     * In the worst case, this simplifies to O(n log n) when all characters are unique.
     *
     * Space Complexity: O(n), where n is the length of the input string, due to storage in StringBuilder and HashMap.
     */


    public String frequencySort(String s) {
        HashMap<Character, Integer> mp = new HashMap<>(); // character and there frequency
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < s.length(); i ++){
            char curChar = s.charAt(i);
            mp.put(curChar, mp.getOrDefault(curChar, 0)+1);
        }

        // sorting the hashmap in descending order based on there values.
        LinkedHashMap<Character, Integer> sortedMap = mp.entrySet().stream()
                .sorted((Map.Entry.<Character, Integer>comparingByValue().reversed()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new
                ));

        for(Character ch : sortedMap.keySet()){
            int cnt = sortedMap.get(ch); // no of count of the character
            for(int j = 0; j < cnt; j ++){
                result.append(ch);
            }
        }

        return result.toString();
    }
}
