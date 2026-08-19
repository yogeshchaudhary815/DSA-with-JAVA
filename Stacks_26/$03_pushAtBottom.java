package Stacks_26;

import java.util.Stack;

public class $03_pushAtBottom {

    public static void pushAtBottom(Stack<Integer> s, int value){

        if (s.isEmpty()) {
            
            s.push(value);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, value);
        s.push(top);
        
       return;
    }
    
    public static void main(String[] args){
        int value = 4;
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtBottom(s, value);
        System.out.println("size of stack = "+s.size());
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }

    }
}
