package akhilshettyym.Leet.Easy;

/*A phrase is a palindrome if, after converting all uppercase letters into lowercase letters 
and removing all non-alphanumeric characters, it reads the same forward and backward.
Runtime 3ms 

LeetCode -
class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}
*/

public class ValidPalindrome_125 {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome_125 sol = new ValidPalindrome_125();

        System.out.println("madam → " + sol.isPalindrome("madam"));
        System.out.println("race a car → " + sol.isPalindrome("race a car"));
        System.out.println("A man, a plan, a canal: Panama → " + sol.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println("No 'x' in Nixon → " + sol.isPalindrome("No 'x' in Nixon"));
    }
}