package Stacks_and_Queues;

import java.util.Scanner;

public class P06_Recursive_Fibonacci {
    public static int getFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return getFibonacci(n - 1) + getFibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for user input
        System.out.print("Enter the desired Fibonacci sequence index (from 1 to 49): ");
        int n = scanner.nextInt();

        // Adjust input to match the zero-indexed internal calculation
        n -= 1;

        // Input validation
        if (n < 0 || n > 48) {
            System.out.println("Index out of range. Please enter a number between 1 and 49.");
        } else {
            // Compute and display the nth Fibonacci number
            int fibonacciNumber = getFibonacci(n);
            System.out.println(fibonacciNumber);
        }

        scanner.close();
    }
}

