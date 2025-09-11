package akhilshettyym.Leet.Easy;

/* Write a function that reverses a string. The input string is given as an array of characters s.
You must do this by modifying the input array in-place with O(1) extra memory.
Runtime 0ms

LeetCode - 
class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while(left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}   */
public class ReverseString_344 {
    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] s = { 'h', 'e', 'l', 'l', 'o' };
        // char[] s = { 'H','a','n','n','a','h' };
        System.out.println("Original array : " + new String(s));

        reverseString(s);
        System.out.println("Reversed array : " + new String(s));
    }
}