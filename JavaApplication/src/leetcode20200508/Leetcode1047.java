package leetcode20200508;

import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author m2912
 */
public class Leetcode1047 {
    public String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<S.length(); i++){
            if(stack.isEmpty()){
                stack.add(S.charAt(i));
            }
            else if(!stack.isEmpty() && S.charAt(i) == stack.peek()){
                stack.pop();
            }
            else if(!stack.isEmpty() && S.charAt(i) != stack.peek()){
                stack.add(S.charAt(i));
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<stack.size(); i++){
            sb.append(stack.get(i));
        }
        return sb.toString();
    }
}
