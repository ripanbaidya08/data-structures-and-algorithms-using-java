package io.dsalgo.stack.problems.easy;

import java.util.*;

// Next Smaller Element
public class NextSmallerElement {
    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n){
        ArrayList<Integer> result = new ArrayList<>(Collections.nCopies(n, -1));
        Stack<Integer> st = new Stack<>();

        for(int i = n-1; i >= 0; i --){
            while(!st.empty() && arr.get(i) <= arr.get(st.peek())){
                st.pop();
            }

            if(!st.empty()) result.set(i, arr.get(st.peek()));

            st.push(i);
        }
        return result;
    }
}