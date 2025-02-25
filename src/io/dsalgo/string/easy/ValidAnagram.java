package io.dsalgo.string.easy;

import java.util.HashMap;

// leetcode 242

public class ValidAnagram {

    public boolean isAnagram(String s1, String s2) {
        // if length is different, then they are not valid anagram for sure
        if(s1.length() != s2.length()) return false;

        // declare a hashmap to put all the characters with there frequency
        HashMap<Character, Integer> mp = new HashMap<>();

        // for s1, put all the characters and there frequency
        for(int i = 0; i < s1.length(); i ++){
            char ch = s1.charAt(i);

            // getting the value of the character
            int charValue = mp.getOrDefault(ch, 0);

            // put character and its frequency
            mp.put(ch, charValue + 1);
        }

        // for s2, check character is already present or not
        // if yes, decrement its value -1
        // if no, increment its value +1
        for(int i = 0; i < s2.length(); i ++){
            char ch = s2.charAt(i);
            // getting the value of the character
            int charValue = mp.getOrDefault(ch, 0);


            // if the character is already present
            if(mp.containsKey(ch)){
                mp.put(ch, charValue - 1);
            } else {
                // put character and its frequency
                mp.put(ch, charValue + 1);
            }

        }


        // check each value of the mp
        for(Integer val : mp.values()){
            if(val != 0){
                return false;
            }
        }
        return true;
    }
}
