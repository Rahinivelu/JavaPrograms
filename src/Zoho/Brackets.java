package Zoho;

import java.util.Stack;

public class Brackets {
    public static boolean flag(String s){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                stack.push(s.charAt(i));
            }else{
                if(!stack.empty() &&((
                        stack.peek()=='(' && s.charAt(i)==')')||(stack.peek()=='{' && s.charAt(i)=='}'))||(stack.peek()=='[' && s.charAt(i)==']')){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }

        return stack.empty();
    }
    public static void main(String[] args) {
        String s="()[{}()]";
        if(flag(s))
            System.out.println("The bracket is balanced");
        else
            System.out.println("It is not balanced");
    }
}
