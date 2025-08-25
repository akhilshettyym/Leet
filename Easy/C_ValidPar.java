package akhilshettyym.Leet.Easy;

/* Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
- Open brackets must be closed by the same type of brackets.
- Open brackets must be closed in the correct order.
- Every close bracket has a corresponding open bracket of the same type. 
- Runtime 3ms */
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
     
    // Leet
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