package akhilshettyym.Leet.Easy;

/* You are given an integer n. You need to check if the number is prime or not. Return true if it is a prime number, otherwise return false.

A prime number is a number which has no divisors except 1 and itself. */
import java.util.Scanner;

public class PrimeNumbers {
    public static boolean prime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        boolean result = prime(n);
        if (result == true) {
            System.out.println("Prime number : " + result);
        } else {
            System.out.println("Npt a prime number : " + result);
        }
        sc.close();
        ;
    }
}