package Stacks_26;

import java.util.Stack;

public class $04_reverseString {
    
    public static String reveString(String str ){

        Stack<Character> s = new Stack<>();

        int idx = 0;
        while (idx < str.length()) {
            
            char ch = str.charAt(idx);
            s.push(ch);
            idx++;
        }

        StringBuilder result  = new StringBuilder();
        while (!s.isEmpty()) {
            result.append(s.pop());
        }

        return result.toString();
    }

    public static void main(String[] args){

        String str = "abc";
        System.out.println(reveString(str));
    }
}
