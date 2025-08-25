package akhilshettyym.Leet.Easy;

import java.util.Stack;

class Main {
   public static boolean main(String[] args) {
       String str = "([])";
       Stack<Character> charStack = new Stack<>();

       for (char c : str.toCharArray()) {
           if (c == '(' || c == '{' || c == '[') {
               charStack.push(c);
           } else if (c == ')' || c == '}' || c == ']') {
               if (charStack.isEmpty()) {
                   return false;
               }
               char top = charStack.pop();
               if (!isMatchingPair(top, c)) {
                   return false;
               }
           }
       }

       if (charStack.isEmpty()) {
           return true;
       } else {
           return false;
       }
   }

   private static boolean isMatchingPair(char open, char close) {
       return (open == '(' && close == ')') ||
              (open == '{' && close == '}') ||
              (open == '[' && close == ']');
   }
}


// I want the above in below format
class Solution {
    public boolean isValid(String s) {
        
    }
}