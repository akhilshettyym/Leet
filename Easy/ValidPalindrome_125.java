package akhilshettyym.Leet.Easy;

/*A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.*/
public class ValidPalindrome_125 {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
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
        System.out.println("racecar → " + sol.isPalindrome("race a car"));
        System.out.println("heheh → " + sol.isPalindrome("a man a plan a canal panama"));

    }
}
