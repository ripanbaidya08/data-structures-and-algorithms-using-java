package io.dsalgo.stack.problems.medium;

// 402. Remove K Digits
class RemoveKDigits {
    public String removeKdigits(String num, int k) {
        StringBuilder stk = new StringBuilder();

        for(char c : num.toCharArray()){
            while(k > 0 && stk.length() > 0 && stk.charAt(stk.length()-1) > c) {
                stk.deleteCharAt(stk.length()-1);
                --k;
            }
            stk.append(c);
        }

        for(; k > 0; --k){
            stk.deleteCharAt(stk.length()-1);
        }

        int i = 0;
        for(; i < stk.length() && stk.charAt(i) == '0'; ++i){ }

        String res = (i == stk.length()) ? "0" : stk.substring(i).toString();

        return res;  
    }
}