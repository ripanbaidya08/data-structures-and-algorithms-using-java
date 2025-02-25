package io.dsalgo.string.easy;

// 13. Roman to Integer

public class RomanToInteger {
    public int romanToInt(String s) {
        int result = 0;

        for(int i = 0; i < s.length(); i ++){
            char current = s.charAt(i);
            char next = (i+1 < s.length())?s.charAt(i+1):'\0';

            if(current == 'I' && next == 'V'){
                result += 4;
                i ++;
                // skip the next character
                // since, it has already been counted in the current iteration
            } else if(current == 'I' && next == 'X'){
                result += 9;
                i ++;
            } else if(current == 'X' && next == 'L'){
                result += 40;
                i ++;
            } else if(current == 'X' && next == 'C'){
                result += 90;
                i ++;
            } else if(current == 'C' && next == 'D'){
                result += 400;
                i ++;
            } else if(current == 'C' && next == 'M'){
                result += 900;
                i ++;
            } else {
                switch(current){
                    case 'I' -> result += 1;
                    case 'V' -> result += 5;
                    case 'X' -> result += 10;
                    case 'L' -> result += 50;
                    case 'C' -> result += 100;
                    case 'D' -> result += 500;
                    case 'M' -> result += 1000;
                }
            }
        }
        return result;
    }
}
