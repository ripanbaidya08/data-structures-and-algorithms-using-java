package io.dsalgo.recursion.basics;
/*
* print the string using recursion.
* skip a specific character if it occurs.
* */
public class StringTraversal {
    public static void print(int i, String s, String ans){
        if(i == s.length()) {
            System.out.println(ans);
            return;
        }
        ans+= s.charAt(i);
        print(i+1, s, ans);
    }
    public static void skip(int i, String s, String ans){
        if(i == s.length()){
            System.out.println(ans);
            return;
        }
        if(s.charAt(i) != 'a') ans+= s.charAt(i);
        skip(i+1, s, ans);
    }
    public static void main(String[] args) {
        String s = "jon dev";
        print(0, s, ""); // print the string using recursion

        String s2 = "abcaad"; // task is to print all the character's skipping the letter 'a'
        skip(0, s2, "");
    }
}
