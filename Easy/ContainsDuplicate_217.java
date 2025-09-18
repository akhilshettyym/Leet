package akhilshettyym.Leet.Easy;

/* Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
Runtime 13ms

LeetCode - 
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> uni = new HashSet<>();
        for(int num: nums) {
            if(uni.contains(num)) {
                return true;
            }
            uni.add(num);
        }
        return false;
    }
}   */

import java.util.HashSet;

public class ContainsDuplicate_217 {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> uni = new HashSet<>();
        for (int num : nums) {
            if (uni.contains(num)) {
                return true;
            }
            uni.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        // int[] nums = { 1,2,3,1 };
        // int[] nums = { 1,2,3,4 };
        int[] nums = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };

        boolean result = containsDuplicate(nums);
        System.out.println("Result : " + result);
    }
}