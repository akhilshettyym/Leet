package akhilshettyym.Leet.Easy;

// Given an integer x, return true if x is a palindrome, and false otherwise.
// Runtime 6ms
public class B_Palindrome {
    public static void main(String[] args) {
        int x = 10;
        B_Palindrome sol = new B_Palindrome();
        boolean ans = sol.isPalindrome(x);
        System.out.println(ans);
    }

    // Leet
    public boolean isPalindrome(int x) {
        String strX = Integer.toString(x);
        int left = 0;
        int right = strX.length() - 1;
        while (left < right) {
            if (strX.charAt(left) != strX.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}