package io.dsalgo.string.medium;

import java.util.Stack;

// 151. Reverse Words in a String
public class ReverseWordsInString {

    public String reverseWords(String s) {
        Stack<StringBuilder> st = new Stack<>();
        StringBuilder reversedString = new StringBuilder(); // store the reversed string
        StringBuilder temp = new StringBuilder(); // store word

        for(int i = 0; i < s.length(); i ++){
            char curChar = s.charAt(i);

            if(curChar != ' '){
                temp.append(curChar);
            } else{
                // Only Adding non empty words
                if(temp.length() > 0){
                    st.push(temp);
                    temp = new StringBuilder(); // clear the temp
                }
            }
        }
        if(temp.length() > 0) st.push(temp); // check remaining words after loop

        while(!st.isEmpty()){
            reversedString.append(st.pop()); // pop element and add it to result
            if(!st.isEmpty()) {
                reversedString.append(" "); // add space if there are more words
            }
        }

        return reversedString.toString();
    }
}
