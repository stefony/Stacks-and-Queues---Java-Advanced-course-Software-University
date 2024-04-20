package Stacks_and_Queues;

import java.util.Scanner;
import java.util.Stack;

public class P02_Basic_Stack_Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get N, S, and X
        int N = sc.nextInt();
        int S = sc.nextInt();
        int X = sc.nextInt();

        // Create a stack
        Stack<Integer> stack = new Stack<>();

        // Push N elements into the stack
        for (int i = 1; i <= N; i++) {
            stack.push(sc.nextInt());
        }

        // Pop S elements from the stack
        for (int i = 1; i <= S; i++) {
            stack.pop();
        }

        // Check if X is present in the stack
        if (stack.search(X) != -1) {
            System.out.println("true");
        } else {
            // Print the smallest element in the stack
            if(stack.empty()){
                System.out.println(0);
            }else{
                int min = stack.pop();
                while (!stack.empty()) {
                    min = Math.min(min, stack.pop());
                }
                System.out.println(min);
            }
        }
    }
}
