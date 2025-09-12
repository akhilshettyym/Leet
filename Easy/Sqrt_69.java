package akhilshettyym.Leet.Easy;

/* Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
You must not use any built-in exponent function or operator.
For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
Runtime 1ms 

LeetCode - 
class Solution {
    public int mySqrt(int x) {
        if(x < 2) {
            return x;
        }
        int left = 1;
        int right = x;
        int result = 0;

        while(left <= right){
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;

            if(square == x) {
                return mid;
            } else if(square < x) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}   */

import java.util.Scanner;

public class Sqrt_69 {
    public static int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        int left = 1;
        int right = x;
        int result = 0;

        while (left < right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            } else if (square < x) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = sc.nextInt();
        int result = mySqrt(x);
        System.out.println("Sqrt of " + x + " is : " + result);
        sc.close();
    }
}