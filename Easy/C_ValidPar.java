package akhilshettyym.Leet.Easy;

import java.util.Stack;
// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.
class Main {
    
    public static void main (String[] args){
        String str = "([])";
        Stack<Character> charStack = new Stack<>();
        for(char c : str.toCharArray()) {
            if(c == '(' || c == '{' || c == '['){
            charStack.push(c);
            System.out.println(c);
            }
            if(c == ')' || c == '}' || c == ']'){
                char topEle = Stack.peek();
                if(topEle == '(' || c == ')'){
                    System.out.println(c);
                }
            }
        }
        // System.out.print("Stack :"+ charStack);
    }
}