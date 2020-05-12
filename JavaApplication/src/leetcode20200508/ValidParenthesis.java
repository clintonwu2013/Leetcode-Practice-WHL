/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode20200508;


import java.util.Stack;

/**
 *
 * @author m2912
 */
public class ValidParenthesis {
    public boolean isValid(String s) {
        
        char[] schar = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char c: schar){
            if(c =='(' || c =='[' || c=='{'){
                stack.add(c);
            }else if(stack.isEmpty()){
                return false;
            }else if( (c==')' && '('== stack.peek())||
                    (c=='}' && '{'== stack.peek()) ||
                    (c==']' && '['== stack.peek())){
                stack.pop();
            } else{
                return false;
                
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        
    }
}
