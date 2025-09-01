package akhilshettyym.Leet.Easy;

// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// Runtime 45ms.
import java.util.Arrays;

public class TwoSum_1 {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        // int[] nums = {3, 2, 4};
        // int target = 6;

        // int[] nums = { 3, 3};
        // int target = 6;

        int[] test = twoSum(nums, target);
        System.out.println(Arrays.toString(test));
    }

    // Leet
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}