package akhilshettyym.Leet.Easy;

import java.util.Scanner;
import java.util.Stack;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string of brackets: ");
        String input = sc.nextLine();

        Solution sol = new Solution();
        boolean result = sol.isValid(input);

        System.out.println(result);
        sc.close();
    }

    public boolean isValid(String s) {
        Stack<Character> charStack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                charStack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (charStack.isEmpty()) {
                    return false;
                }
                char top = charStack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return charStack.isEmpty();
    }
}